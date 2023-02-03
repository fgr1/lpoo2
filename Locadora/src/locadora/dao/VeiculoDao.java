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
import java.util.List;
import locadora.model.Automovel;
import locadora.model.Motocicleta;
import locadora.model.Van;
import locadora.model.Veiculo;
import locadora.model.enums.Categoria;
import locadora.model.enums.Estado;
import locadora.model.enums.Marca;
import locadora.model.enums.ModeloAutomovel;
import locadora.model.enums.ModeloMotocicleta;
import locadora.model.enums.ModeloVan;

/**
 *
 * @author Felipe
 */
public class VeiculoDao {
    
    private final ConnectionFactory connectionFactory;
    private final String insert = "INSERT INTO veiculos (marca, estado, categoria, valordecompra, placa, ano, modelo, tipo) VALUES (?,?,?,?,?,?,?,?)";
    private final String vender = "UPDATE veiculos SET estado = 'VENDIDO' WHERE placa = ?";
    private final String locar = "UPDATE veiculos SET estado = 'LOCADO' WHERE placa = ?";
    private final String selectVendas = "SELECT * FROM veiculos WHERE estado != 'VENDIDO'";
    
    public VeiculoDao(ConnectionFactory conFactory) {
        this.connectionFactory = conFactory;
    }
    
    public void inserir(Veiculo veiculo) {
        Connection connection=connectionFactory.getConnection();
        try {
            
            PreparedStatement stmtAdiciona = connection.prepareStatement(insert);
            
            stmtAdiciona.setString(1, veiculo.getMarca().toString());
            stmtAdiciona.setString(2, veiculo.getEstado().toString());
            stmtAdiciona.setString(3, veiculo.getCategoria().toString());
            stmtAdiciona.setDouble(4, veiculo.getValorDeCompra());
            stmtAdiciona.setString(5, veiculo.getPlaca());
            stmtAdiciona.setInt(6, veiculo.getAno());
            if (veiculo instanceof Automovel v) {
                stmtAdiciona.setString(7, v.getModelo().toString());
                stmtAdiciona.setString(8, "Automovel");
            } else if (veiculo instanceof Motocicleta v) {
                stmtAdiciona.setString(7, v.getModelo().toString());
                stmtAdiciona.setString(8, "Motocicleta");                
            } else if (veiculo instanceof Van v) {
                stmtAdiciona.setString(7, v.getModelo().toString());    
                stmtAdiciona.setString(8, "Van");
            }
        stmtAdiciona.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } 
    }
    
    private void atualizarVenda (Veiculo veiculo) throws SQLException {
            Connection connection=connectionFactory.getConnection();
            PreparedStatement stmtAtualiza;
            stmtAtualiza = connection.prepareStatement(vender);
            try {
                stmtAtualiza.setString(1, veiculo.getPlaca());
                stmtAtualiza.executeUpdate();
            } finally{
                stmtAtualiza.close();
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
    
    public void venderLista(List<Veiculo> veiculos) throws SQLException {
        for(Veiculo veiculo:veiculos){
            atualizarVenda(veiculo);
        }
    } 
    
    public List<Veiculo> getListaParaVender() throws SQLException {
        Connection connection=connectionFactory.getConnection();
        ResultSet rs = null;    
        PreparedStatement stmtLista = connection.prepareStatement(selectVendas);
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
}
