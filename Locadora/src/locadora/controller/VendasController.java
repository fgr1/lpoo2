/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.controller;

import java.util.List;
import locadora.dao.VeiculoDao;
import locadora.model.Veiculo;
import locadora.view.JanelaIndex;
import locadora.view.tela.vendas.JanelaVendas;

/**
 *
 * @author Felipe
 */
public class VendasController {

    private final JanelaVendas view;
    private final VeiculoDao veiculoDao;

    public VendasController(JanelaVendas view, VeiculoDao veiculoDao) {
        this.view = view;
        this.veiculoDao = veiculoDao;
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

    public void venderVeiculo() {
        try{
            List<Veiculo> listaParaVender = view.getVeiculosParaExcluir();
            veiculoDao.venderLista(listaParaVender);
            view.excluirClienteView(listaParaVender);
        }catch(Exception ex){
            view.apresentaErro(ex.toString());
        }
    }

    public void pesquisarVeiculo() {
        try{
            String col = view.getPesquisaForm();
            String filtro = view.getFiltroForm();
            List<Veiculo> lista = this.veiculoDao.getLista(col, filtro);
            view.mostrarListaVeiculos(lista);            
        }catch(Exception ex){
            ex.printStackTrace();
            view.apresentaErro(ex.toString());
        }
    }
    
}
