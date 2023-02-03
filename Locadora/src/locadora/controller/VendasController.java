/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.controller;

import java.util.ArrayList;
import java.util.List;
import locadora.dao.VeiculoDao;
import locadora.model.Automovel;
import locadora.model.Motocicleta;
import locadora.model.Van;
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
    private List<Veiculo> veiculoFiltroList = new ArrayList<>();

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
            List<Veiculo> listaParaVender = view.getVeiculosParaVenderView();
            veiculoDao.venderLista(listaParaVender);
            view.excluirVeiculoView(listaParaVender);
        }catch(Exception ex){
            view.apresentaErro(ex.toString());
        }
    }

    public void pesquisarVeiculo() {
        try{
            String categoria = view.getCategoriaFormView();
            String marca = view.getMarcaFormView();
            String atributo = view.getAtributoFormView();
            List<Veiculo> lista = this.veiculoDao.getListaParaVender();                   
                        
            veiculoFiltroList = filtarAtributo(lista, atributo);
            veiculoFiltroList = filtarCategoria(veiculoFiltroList, categoria);
            veiculoFiltroList = filtarMarca(veiculoFiltroList, marca);

            view.mostrarListaVeiculosView(veiculoFiltroList);            
        }catch(Exception ex){
            ex.printStackTrace();
            view.apresentaErro(ex.toString());
        }
    }
    
    public List<Veiculo> filtarAtributo(List<Veiculo> lista, String atributo){
        List<Veiculo> listaFiltro = new ArrayList<>(); 
        for(Veiculo v: lista){
            switch (atributo) {
                case "Automovel" -> {
                    if(v instanceof Automovel){
                        listaFiltro.add(v);
                    }
                }
                case "Motocicleta" -> {
                    if(v instanceof Motocicleta){
                        listaFiltro.add(v);
                    }
                }
                case "Van" -> {
                    if(v instanceof Van){
                        listaFiltro.add(v);
                    }
                }
                default -> {
                    return lista;
                }
            }
        }
        return listaFiltro;
    }


    public List<Veiculo> filtarCategoria(List<Veiculo> lista, String categoria){
        if (categoria.equals("None")) {
            return lista;
        } else {
            List<Veiculo> listaFiltro = new ArrayList<>(); 
            for(Veiculo v: lista){
                if(v.getCategoria().toString().equals(categoria))
                    listaFiltro.add(v); 
            }
            return listaFiltro; 
        }
    }
    
    public List<Veiculo> filtarMarca (List<Veiculo> lista, String marca){
        if (marca.equals("None")) {
            return lista;
        } else {
            List<Veiculo> listaFiltro = new ArrayList<>(); 
            for(Veiculo v: lista){
                if(v.getMarca().toString().equals(marca))
                    listaFiltro.add(v); 
            }
            return listaFiltro; 
        }
    }
   
}
