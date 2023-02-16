/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package locadora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import locadora.model.Automovel;
import locadora.model.Cliente;
import locadora.model.Locacao;
import locadora.model.Motocicleta;
import locadora.model.Van;
import locadora.model.Veiculo;
import locadora.model.enums.Categoria;
import locadora.model.enums.Estado;
import locadora.model.enums.Marca;
import locadora.model.enums.ModeloAutomovel;
import locadora.model.enums.ModeloMotocicleta;
import locadora.model.enums.ModeloVan;


public class DevolucaoDao {

private final ConnectionFactory connectionFactory;
private final String devolver = "DELETE FROM locacoes WHERE placa = ?";
private final String update = "UPDATE veiculos SET estado = 'DISPONIVEL' WHERE placa = ?";
private final String select = "SELECT * FROM locacoes";
private final String selectVeiculo = "SELECT * FROM veiculos WHERE placa = ?";
private final String selectCliente = "SELECT * FROM clientes WHERE cpf = ?";

    public DevolucaoDao(ConnectionFactory conFactory) {
        this.connectionFactory = conFactory;
    }

    public List<Veiculo> getListaVeiculosParaDevolucao() throws SQLException {
        Connection connection = connectionFactory.getConnection();
        Locacao l = null;
        List<Veiculo> listaVeiculo = new ArrayList<>();
        Veiculo v = null;
        Cliente c = null;

        ResultSet rs = null;    
        PreparedStatement stmtLista = connection.prepareStatement(select);

        //=====================================INSTANCIA LOCACOES=======================================//

        try { 
            rs = stmtLista.executeQuery();
            while (rs.next()) {

                String cpf = rs.getString("cpf");
                String placa = rs.getString("placa");
                int dias = rs.getInt("dias");
                Calendar data = Calendar.getInstance();
                data.setTime(rs.getDate("data"));
                double valor = rs.getDouble("valorlocacao");

        //=====================================INSTANCIA VEICULOS=======================================//

                PreparedStatement ps = connection.prepareStatement(selectVeiculo);
                ps.setString(1, placa);
                ResultSet rsVeiculo = ps.executeQuery();

                if (rsVeiculo.next()) {
                    String type = rsVeiculo.getString("tipo");
                    Marca marca = Marca.valueOf(rsVeiculo.getString("marca"));
                    Estado estado = Estado.valueOf(rsVeiculo.getString("estado"));
                    Categoria categoria = Categoria.valueOf(rsVeiculo.getString("categoria"));
                    double valorDeCompra = rsVeiculo.getDouble("valordecompra");
                    int ano = rsVeiculo.getInt("ano");

                    if (type.equals("Automovel")) {
                      v = new Automovel(
                        ModeloAutomovel.valueOf(rsVeiculo.getString("modelo")),
                        Marca.valueOf(rsVeiculo.getString("marca")),
                        Estado.valueOf(rsVeiculo.getString("estado")),
                        Categoria.valueOf(rsVeiculo.getString("categoria")),
                        rsVeiculo.getDouble("valordecompra"),
                        rsVeiculo.getString("placa"),
                        rsVeiculo.getInt("ano")
                      );
                    } else if (type.equals("Motocicleta")) {
                      v = new Motocicleta(
                        ModeloMotocicleta.valueOf(rsVeiculo.getString("modelo")),
                        Marca.valueOf(rsVeiculo.getString("marca")),
                        Estado.valueOf(rsVeiculo.getString("estado")),
                        Categoria.valueOf(rsVeiculo.getString("categoria")),
                        rsVeiculo.getDouble("valordecompra"),
                        rsVeiculo.getString("placa"),
                        rsVeiculo.getInt("ano")
                      );
                    } else if (type.equals("Van")) {
                      v = new Van(
                        ModeloVan.valueOf(rsVeiculo.getString("modelo")),
                        Marca.valueOf(rsVeiculo.getString("marca")),
                        Estado.valueOf(rsVeiculo.getString("estado")),
                        Categoria.valueOf(rsVeiculo.getString("categoria")),
                        rsVeiculo.getDouble("valordecompra"),
                        rsVeiculo.getString("placa"),
                        rsVeiculo.getInt("ano")
                      );
                    }
                }
            //=====================================INSTANCIA CLIENTE=======================================//

                ps = connection.prepareStatement(selectCliente);
                ps.setString(1, cpf);
                ResultSet rsCliente = ps.executeQuery();
                if (rsCliente.next()) {
                    long id = rsCliente.getLong("id");
                    String nome= rsCliente.getString("nome");
                    String sobrenome = rsCliente.getString("sobrenome");
                    String rg = rsCliente.getString("rg");
                    String endereco = rsCliente.getString("endereco");

                    c = new Cliente(id, nome, sobrenome, rg, cpf, endereco);
                }
            l = new Locacao(c, dias, data, valor, placa);
            v.setLocacao(l);
            listaVeiculo.add(v);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            rs.close();
            stmtLista.close();
            connection.close();
        } 
        return listaVeiculo;
    }

    public void devolver(Veiculo v) throws SQLException {
        Connection connection = connectionFactory.getConnection();
        PreparedStatement stmtDevolver = connection.prepareStatement(devolver);
        PreparedStatement ps = connection.prepareStatement(update);
        try {
            stmtDevolver.setString(1, v.getPlaca());
            stmtDevolver.executeUpdate();
            
            ps.setString(1, v.getPlaca());
            ps.executeUpdate();
            
        } finally {
            stmtDevolver.close();
            connection.close();
        }
    }

}
