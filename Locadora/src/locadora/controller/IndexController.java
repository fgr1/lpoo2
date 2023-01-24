/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.controller;

import javax.swing.JFrame;
import locadora.dao.ClienteDao;
import locadora.dao.ConnectionFactory;
import locadora.dao.VeiculoDao;
import locadora.view.JanelaClientes;
import locadora.view.JanelaIndex;

/**
 *
 * @author Felipe
 */
public class IndexController {
   
    private JanelaIndex janela;
    private ClienteDao clienteDao;
    private VeiculoDao veiculoDao;

    public IndexController(JanelaIndex janela) {
        this.janela = janela;
        initController();
    }

    private void initController() {        
        this.janela.setController(this);
        this.janela.initView();
    }

    public void clienteView() {
        JanelaClientes view = new JanelaClientes();
        ClienteDao clienteDao = new ClienteDao(new ConnectionFactory());
        ClienteController controller = new ClienteController(view,clienteDao);
        janela.dispose();
    }

    public void veiculoView() {
//        JanelaVeiculos view = new JanelaVeiculos();
//        VeiculoDao veiculoDao = new VeiculoDao(new ConnectionFactory());
//        VeiculoController controller = new VeiculoController(view,veiculoDao);
//        janela.dispose();
    }

    public void devolucaoView() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void locarView() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void quitProgram() {
        System.exit(0);
    }

    public void venderView() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
