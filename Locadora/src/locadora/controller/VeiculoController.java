/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.controller;

import locadora.dao.VeiculoDao;
import locadora.model.Veiculo;
import locadora.view.JanelaIndex;
import locadora.view.tela.veiculos.JanelaVeiculos;

/**
 *
 * @author Felipe
 */
public class VeiculoController {
    
    private final JanelaVeiculos view;
    private final VeiculoDao veiculoDao;
    
    
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
        try{
            Veiculo veiculo = view.getVeiculoForm();
            veiculoDao.inserir(veiculo);
            view.apresentaInfo("Adicionado com sucesso!!!");
        }catch(Exception ex){
            view.apresentaErro(ex.toString());
        }
    }

    public void limparCampos() {
        view.limparForm();
    }

     public void voltarIndex() {
        JanelaIndex janela = new JanelaIndex();
        IndexController controller = new IndexController(janela);
        view.dispose();    
    }
    
}
