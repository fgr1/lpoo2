/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.controller;

import locadora.dao.VeiculoDao;
import locadora.view.JanelaIndex;
import locadora.view.tela.veiculos.JanelaVeiculos;

/**
 *
 * @author Felipe
 */
public class VeiculoController {
    
    private JanelaVeiculos view;
    private VeiculoDao veiculoDao;
    
    
    public VeiculoController(JanelaVeiculos view, VeiculoDao veiculoDao) {
        this.view = view;
        this.veiculoDao = veiculoDao;
        initController();
    }
    
    private void initController() {        
        this.view.setController(this);
        this.view.initView();
    }

    public void incluirVeiculo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void limparCampos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

     public void voltarIndex() {
        JanelaIndex janela = new JanelaIndex();
        IndexController controller = new IndexController(janela);
        view.dispose();    
    }
    
}
