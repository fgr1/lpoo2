/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import locadora.model.Cliente;
import locadora.model.Veiculo;
/**
 *
 * @author Felipe
 */
public class LocacaoDao {
    
    private final ConnectionFactory connectionFactory;
    private final String insert = "";
    
    public LocacaoDao(ConnectionFactory conFactory) {
        this.connectionFactory = conFactory;
    }
    
    public void inserir(Veiculo veiculo, Cliente cliente) {
        Connection connection=connectionFactory.getConnection();
        
        try {
            PreparedStatement stmtAdiciona = connection.prepareStatement(insert);
            

        
            stmtAdiciona.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } 
    }
}
