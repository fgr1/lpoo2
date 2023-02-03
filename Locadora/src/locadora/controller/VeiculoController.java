/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.controller;

import locadora.dao.VeiculoDao;
import locadora.view.JanelaIndex;
import locadora.view.tela.veiculos.JanelaVeiculos;
import java.util.ArrayList;;
import locadora.model.Veiculo;
import locadora.model.enums.Categoria;
import locadora.model.enums.Marca;
import locadora.model.enums.Modelo;
import static locadora.model.enums.ModeloAutomovel.*;
import static locadora.model.enums.ModeloMotocicleta.*;
import static locadora.model.enums.ModeloVan.*;

/**
 *
 * @author Felipe
 */
public class VeiculoController {
    
    private final JanelaVeiculos view;
    private final VeiculoDao veiculoDao;  
    private ArrayList<Modelo> listaModelo = new ArrayList();
    
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
        view.limparFormView();
    }

     public void voltarIndex() {
        JanelaIndex janela = new JanelaIndex();
        IndexController controller = new IndexController(janela);
        view.dispose();    
    }
     
    public ArrayList<Modelo> getListaAutomovel (Marca marca, Categoria categoria){
                
        if(Marca.Volkswagen == marca && categoria == Categoria.POPULAR){
            listaModelo.add(GOL);
        }
        else if (Marca.Volkswagen == marca && categoria == Categoria.INTERMEDIARIO){
            listaModelo.add(POLO);
        }
        else if (Marca.Volkswagen == marca && categoria == Categoria.LUXO){
            listaModelo.add(JETTA);
        }
        else if (Marca.Fiat == marca && categoria == Categoria.POPULAR){
            listaModelo.add(MOBI);
            listaModelo.add(PALIO);
        }
        else if (Marca.Fiat == marca && categoria == Categoria.INTERMEDIARIO){
            listaModelo.add(ARGO);
        }
        else if (Marca.Fiat == marca && categoria == Categoria.LUXO){
            listaModelo.add(CRONOS);
        }
        else if (Marca.GM == marca && categoria == Categoria.POPULAR){
            listaModelo.add(CELTA);
        }
        else if (Marca.GM == marca && categoria == Categoria.INTERMEDIARIO){
            listaModelo.add(ONIX);
        }
        else if (Marca.GM == marca && categoria == Categoria.LUXO){
            listaModelo.add(CRUZE);
        }
        else
            return null;
        return listaModelo;
    }
    
    public ArrayList<Modelo> getListaMotocicleta (Marca marca, Categoria categoria){
        
        if (Marca.Honda == marca && categoria == Categoria.POPULAR){
            listaModelo.add(CG125);
        }
        else if (Marca.Honda == marca && categoria == Categoria.INTERMEDIARIO){
            listaModelo.add(CB250TWISTER);
        }
        else if (Marca.Honda == marca && categoria == Categoria.LUXO){
            listaModelo.add(CB500X);
        }
        else
            return null;
        return listaModelo;
    }
    
    public ArrayList<Modelo> getListaVan (Marca marca, Categoria categoria){

        if(Marca.Fiat == marca && categoria == Categoria.POPULAR){
            listaModelo.add(FIORINO);
        }
        else if (Marca.Fiat == marca && categoria == Categoria.INTERMEDIARIO){
            listaModelo.add(SCUDO);
        }
        else if (Marca.Fiat == marca && categoria == Categoria.LUXO){
            listaModelo.add(DUCATO);
        }        
        else if (Marca.GM == marca && categoria == Categoria.POPULAR){
            listaModelo.add(SPIN);
            listaModelo.add(TRACKER);
        }
        else if (Marca.GM == marca && categoria == Categoria.INTERMEDIARIO){
            listaModelo.add(EQUINOX);
        }
        else if (Marca.GM == marca && categoria == Categoria.LUXO){
            listaModelo.add(TRAILBRAZER);
        }
        else
            return null;
        return listaModelo;
    }    
     
}
