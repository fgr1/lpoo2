 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package locadora.controller;

import java.util.List;
import locadora.dao.DevolucaoDao;
import locadora.dao.LocacaoDao;
import locadora.model.Veiculo;
import locadora.view.JanelaIndex;
import locadora.view.tela.devolucao.JanelaDevolucao;

/**
 *
 * @author Felipe
 */
public class DevolucaoController {

    private final JanelaDevolucao view;
    private final DevolucaoDao devolucaoDao;

    DevolucaoController(JanelaDevolucao view, DevolucaoDao devolucaoDao) {
        this.view = view;
        this.devolucaoDao = devolucaoDao;
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

    public void devolverVeiculo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void listarVeiculos() {
        try{

            List<Veiculo> lista = this.devolucaoDao.getListaVeiculosParaDevolucao();                 

            view.mostrarListaVeiculosView(lista);            
        }catch(Exception ex){
            ex.printStackTrace();
            view.apresentaErro("Erro ao localizar veiculos!");
        }
    }
}
