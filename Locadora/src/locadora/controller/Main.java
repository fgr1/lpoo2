/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package locadora.controller;

import locadora.dao.ClienteDao;
import locadora.dao.ConnectionFactory;
import locadora.view.JanelaClientes;

/**
 *
 * @author Felipe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JanelaClientes view = new JanelaClientes();
        ClienteDao clienteDao = new ClienteDao(new ConnectionFactory());
        LocadoraController controller = new LocadoraController(view,clienteDao);
    }
    
}
