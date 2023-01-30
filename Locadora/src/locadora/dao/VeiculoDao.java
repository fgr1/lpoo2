/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import locadora.model.Automovel;
import locadora.model.Motocicleta;
import locadora.model.Van;
import locadora.model.Veiculo;

/**
 *
 * @author Felipe
 */
public class VeiculoDao {
    
    private final ConnectionFactory connectionFactory;
    private final String insert = "INSERT INTO veiculos (marca, estado, categoria, valordecompra, placa, ano, modelo) VALUES (?,?,?,?,?,?,?)";

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
                System.out.println(v.getModelo().toString());
                stmtAdiciona.setString(7, v.getModelo().toString());
            } else if (veiculo instanceof Motocicleta v) {
                stmtAdiciona.setString(7, v.getModelo().toString());
            } else if (veiculo instanceof Van v) {
                stmtAdiciona.setString(7, v.getModelo().toString());
            }
        stmtAdiciona.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } 
    }
    
}
