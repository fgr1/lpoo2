/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Felipe
 */
public class ConnectionFactory {   
    
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost/locadora", "postgres", "juju1219");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
