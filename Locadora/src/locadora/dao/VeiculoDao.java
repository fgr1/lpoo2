/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import locadora.model.Veiculo;

/**
 *
 * @author Felipe
 */
public class VeiculoDao {
    
    private final ConnectionFactory connectionFactory;
    private final String insert = "INSERT INTO veiculos (marca, estado, locacao, categoria, valorDeCompra, placa, ano, modelo) VALUES (?,?,?,?,?,?,?,?)";

    public VeiculoDao(ConnectionFactory conFactory) {
        this.connectionFactory = conFactory;
    }
    
    public void inserir(Veiculo veiculo) {
        Connection connection=connectionFactory.getConnection();
        try {
            
            PreparedStatement stmtAdiciona = connection.prepareStatement(insert);
            
            stmtAdiciona.setString(1, veiculo.getMarca().getDescricao());
            stmtAdiciona.setString(2, veiculo.getEstado().getDescricao());
            stmtAdiciona.setString(3, veiculo.getLocacao().toString());
            stmtAdiciona.setString(4, veiculo.getCategoria().getDescricao());
            stmtAdiciona.setDouble(5, veiculo.getValorDeCompra());
            stmtAdiciona.setString(6, veiculo.getPlaca());
            stmtAdiciona.setInt(7, veiculo.getAno());
            // Campo de Modelo - presente somente nas classes Automovel, Motocicleta e Van
            //stmtAdiciona.setString(8, veiculo.);
            
            
            stmtAdiciona.executeUpdate();
  
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } 
    }
    
}
