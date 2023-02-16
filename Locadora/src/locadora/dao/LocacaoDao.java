/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
import locadora.model.Motocicleta;
import locadora.model.Van;
import locadora.model.Veiculo;
import locadora.model.enums.Categoria;
import locadora.model.enums.Estado;
import locadora.model.enums.Marca;
import locadora.model.enums.ModeloAutomovel;
import locadora.model.enums.ModeloMotocicleta;
import locadora.model.enums.ModeloVan;


public class LocacaoDao {
    
    private final ConnectionFactory connectionFactory;
    private final String insert = "INSERT INTO locacoes (cpf, placa, dias, data, valorlocacao) VALUES ((SELECT cpf FROM clientes WHERE cpf = ?),(SELECT placa FROM veiculos WHERE placa = ?),?, ?, ?)";
    private final String selectClientes = "SELECT * FROM clientes";
    private final String selectVeiculos = "SELECT * FROM veiculos WHERE estado != 'VENDIDO' AND estado != 'LOCADO'";
    private final String locar = "UPDATE veiculos SET estado = 'LOCADO' WHERE placa = ?";
    
    public LocacaoDao(ConnectionFactory conFactory) {
        this.connectionFactory = conFactory;
    }
    
    public void locar (Veiculo veiculo, Cliente cliente, int dia, Calendar data, double valor) {
        Connection connection=connectionFactory.getConnection();
        
        try {
            PreparedStatement stmtAdiciona = connection.prepareStatement(insert);
            
            stmtAdiciona.setString(1, cliente.getCpf());
            stmtAdiciona.setString(2, veiculo.getPlaca());
            stmtAdiciona.setInt(3, dia);
            
            java.util.Date utilDate = data.getTime();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            stmtAdiciona.setDate(4, sqlDate);
            
            stmtAdiciona.setDouble(5, valor);
        
            stmtAdiciona.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } 
    }
    
    public void atualizarLocacao (Veiculo veiculo) throws SQLException {
        Connection connection=connectionFactory.getConnection();
        PreparedStatement stmtAtualiza;
        stmtAtualiza = connection.prepareStatement(locar);
        try {
            stmtAtualiza.setString(1, veiculo.getPlaca());
            stmtAtualiza.executeUpdate();
        } finally{
            stmtAtualiza.close();
        }
    }
    
    public List<Veiculo> getListaVeiculosParaLocar() throws SQLException {
        Connection connection=connectionFactory.getConnection();
        ResultSet rs = null;    
        PreparedStatement stmtLista = connection.prepareStatement(selectVeiculos);
        List<Veiculo> veiculos = new ArrayList();
        try { 
            rs = stmtLista.executeQuery();
            while (rs.next()) {
                String type = rs.getString("tipo");
                Veiculo v = null;
                if (type.equals("Automovel")) {
                  v = new Automovel(
                    ModeloAutomovel.valueOf(rs.getString("modelo")),
                    Marca.valueOf(rs.getString("marca")),
                    Estado.valueOf(rs.getString("estado")),
                    Categoria.valueOf(rs.getString("categoria")),
                    rs.getDouble("valordecompra"),
                    rs.getString("placa"),
                    rs.getInt("ano")
                  );
                } else if (type.equals("Motocicleta")) {
                  v = new Motocicleta(
                    ModeloMotocicleta.valueOf(rs.getString("modelo")),
                    Marca.valueOf(rs.getString("marca")),
                    Estado.valueOf(rs.getString("estado")),
                    Categoria.valueOf(rs.getString("categoria")),
                    rs.getDouble("valordecompra"),
                    rs.getString("placa"),
                    rs.getInt("ano")
                  );
                } else if (type.equals("Van")) {
                  v = new Van(
                    ModeloVan.valueOf(rs.getString("modelo")),
                    Marca.valueOf(rs.getString("marca")),
                    Estado.valueOf(rs.getString("estado")),
                    Categoria.valueOf(rs.getString("categoria")),
                    rs.getDouble("valordecompra"),
                    rs.getString("placa"),
                    rs.getInt("ano")
                  );
                }
                veiculos.add(v);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
          rs.close();
          stmtLista.close();
          connection.close();
        }
        return veiculos;
    }
    
    public List<Cliente> getListaClienteParaLocar() throws SQLException {
        Connection connection=connectionFactory.getConnection();
        ResultSet rs = null;
        PreparedStatement stmtLista = connection.prepareStatement(selectClientes);
        try {
            rs = stmtLista.executeQuery();
            List<Cliente> clientes = new ArrayList();
            while (rs.next()) {

                long id = rs.getLong("id");
                String nome= rs.getString("nome");
                String sobrenome = rs.getString("sobrenome");
                String rg = rs.getString("rg");
                String cpf = rs.getString("cpf");
                String endereco = rs.getString("endereco");
                
                

                clientes.add(new Cliente(id, nome, sobrenome, rg, cpf, endereco));
            }
            
            return clientes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            rs.close();
            stmtLista.close();
        }
    }
}
