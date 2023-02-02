/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.controller;

import locadora.dao.LocacaoDao;
import locadora.view.JanelaIndex;
import locadora.view.tela.locacao.JanelaLocacao;

/**
 *
 * @author Felipe
 */
public class LocacaoController {

    private final JanelaLocacao view;
    private final LocacaoDao locacaoDao;  
    
    public LocacaoController(JanelaLocacao view, LocacaoDao locacaoDao) {
        this.view = view;
        this.locacaoDao = locacaoDao;
        initController();
    }
    
    private void initController() {        
        this.view.setController(this);
        this.view.initView();
    }    
    
    public void voltarIndex() {
        JanelaIndex janela = new JanelaIndex();
        IndexController controller = new IndexController(janela);
        view.dispose();    
    }

    public void pesquisarVeiculos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void locarVeiculo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void pesquisarClientes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
