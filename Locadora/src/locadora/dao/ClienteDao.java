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
import locadora.model.Cliente;

/**
 *
 * @author Felipe
 */
public class ClienteDao {
    
    private final ConnectionFactory connectionFactory;
    private final String insert = "INSERT INTO clientes (nome, sobrenome, rg, cpf, endereco) VALUES (?,?,?,?,?)";
    private final String select = "SELECT * FROM clientes";
    private final String update = "UPDATE clientes SET nome = ?, sobrenome = ?, rg = ?, cpf = ?, endereco = ? WHERE id = ?";
    private final String delete = "DELETE FROM clientes WHERE id=?";
    
    public ClienteDao(ConnectionFactory conFactory) {
        this.connectionFactory = conFactory;
    }
    
    public void inserir(Cliente cliente) {
        Connection connection=connectionFactory.getConnection();
        try {
            
            PreparedStatement stmtAdiciona = connection.prepareStatement(insert);
            
            stmtAdiciona.setString(1, cliente.getNome());
            stmtAdiciona.setString(2, cliente.getSobrenome());
            stmtAdiciona.setString(3, cliente.getRg());
            stmtAdiciona.setString(4, cliente.getCpf());
            stmtAdiciona.setString(5, cliente.getEndereco());
            
            stmtAdiciona.executeUpdate();
  
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } 
    }
    
    public List<Cliente> getLista() throws SQLException {
        Connection connection=connectionFactory.getConnection();
        ResultSet rs = null;
        PreparedStatement stmtLista = connection.prepareStatement(select);
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
    
    public void atualizar(Cliente cliente) throws SQLException {
        Connection connection=connectionFactory.getConnection();
        PreparedStatement stmtAtualiza = connection.prepareStatement(update);
        try{            
            stmtAtualiza.setString(1, cliente.getNome());
            stmtAtualiza.setString(2, cliente.getSobrenome());
            stmtAtualiza.setString(3, cliente.getRg());
            stmtAtualiza.setString(4, cliente.getCpf());
            stmtAtualiza.setString(5, cliente.getEndereco());
            stmtAtualiza.setLong(6, cliente.getId());  
            stmtAtualiza.executeUpdate();
        } finally{
            stmtAtualiza.close();
        }

    }
    
    public void excluir(Cliente cliente) throws SQLException {
        Connection connection=connectionFactory.getConnection();
        PreparedStatement stmtExcluir;
        stmtExcluir = connection.prepareStatement(delete);
        try {
            stmtExcluir.setLong(1, cliente.getId());
            stmtExcluir.executeUpdate();
        } finally{
            stmtExcluir.close();
        }

    }
    
    public void exluirLista(List<Cliente> clientes) throws SQLException {
        for(Cliente cliente:clientes){
            excluir(cliente);
        }
    }   
}
