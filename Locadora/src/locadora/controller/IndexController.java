/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.controller;

import javax.swing.JFrame;
import locadora.dao.ClienteDao;
import locadora.dao.ConnectionFactory;
import locadora.dao.DevolucaoDao;
import locadora.dao.LocacaoDao;
import locadora.dao.VeiculoDao;
import locadora.view.tela.clientes.JanelaClientes;
import locadora.view.JanelaIndex;
import locadora.view.tela.devolucao.JanelaDevolucao;
import locadora.view.tela.locacao.JanelaLocacao;
import locadora.view.tela.veiculos.JanelaVeiculos;
import locadora.view.tela.vendas.JanelaVendas;


public class IndexController {
   
    private JanelaIndex janela;

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
        JanelaVeiculos view = new JanelaVeiculos();
        VeiculoDao veiculoDao = new VeiculoDao(new ConnectionFactory());
        VeiculoController controller = new VeiculoController(view,veiculoDao);
        janela.dispose();
    }

    public void devolucaoView() {
        JanelaDevolucao view = new JanelaDevolucao();
        DevolucaoDao devolucaoDao = new DevolucaoDao(new ConnectionFactory());
        DevolucaoController controller = new DevolucaoController(view,devolucaoDao);
        janela.dispose();
    }

    public void locarView() {
        JanelaLocacao view = new JanelaLocacao();
        LocacaoDao locacaoDao = new LocacaoDao(new ConnectionFactory());
        LocacaoController controller = new LocacaoController(view, locacaoDao);
        janela.dispose();
    }

    public void quitProgram() {
        System.exit(0);
    }

    public void venderView() {
        JanelaVendas view = new JanelaVendas();
        VeiculoDao veiculoDao = new VeiculoDao(new ConnectionFactory());
        VendasController controller = new VendasController(view,veiculoDao);
        janela.dispose();
    }
}
