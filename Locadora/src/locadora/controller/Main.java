/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package locadora.controller;

import locadora.dao.ClienteDao;
import locadora.dao.ConnectionFactory;
import locadora.view.tela.clientes.JanelaClientes;
import locadora.view.JanelaIndex;

/**
 *
 * @author Felipe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JanelaIndex view = new JanelaIndex();
        IndexController controller = new IndexController(view);
    }
    
}
