/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import locadora.dao.LocacaoDao;
import locadora.model.Automovel;
import locadora.model.Cliente;
import locadora.model.Motocicleta;
import locadora.model.Van;
import locadora.model.Veiculo;
import locadora.view.JanelaIndex;
import locadora.view.tela.locacao.JanelaLocacao;

/**
 *
 * @author Felipe
 */
public class LocacaoController {

    private final JanelaLocacao view;
    private final LocacaoDao locacaoDao;
    private List<Veiculo> veiculoFiltroList = new ArrayList<>();
    private List<Cliente> clienteFiltroList = new ArrayList<>();
    
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

    public void locarVeiculo() {
        try{
        Veiculo v = null;
        Cliente c = null;
        v = view.getVeiculoParaLocarDaTabelaView();
        c = view.getClienteFormView();
        
        int dia = view.getDiaFormView();
        Calendar data = view.getDataFormView();
        double valor = v.getValorDiariaLocacao()*dia;
        
        v.locar(dia, data, c);
        locacaoDao.locar(v, c, dia, data, valor);
        locacaoDao.atualizarLocacao(v);
        view.excluirVeiculoView(v);
        view.apresentaInfo("Locação realizada!");
        
        }catch(Exception ex){
            ex.printStackTrace();
            view.apresentaErro(ex.toString());
        }
    }

    public void pesquisarVeiculos() {
        try{
            String categoria = view.getCategoriaFormView();
            String marca = view.getMarcaFormView();
            String atributo = view.getAtributoFormView();
            List<Veiculo> lista = this.locacaoDao.getListaVeiculosParaLocar();                   
                        
            veiculoFiltroList = filtarAtributo(lista, atributo);
            veiculoFiltroList = filtarCategoria(veiculoFiltroList, categoria);
            veiculoFiltroList = filtarMarca(veiculoFiltroList, marca);

            view.mostrarListaVeiculosView(veiculoFiltroList);            
        }catch(Exception ex){
            ex.printStackTrace();
            view.apresentaErro("Erro ao localizar veiculo!");
        }
    }

    public void pesquisarClientes() {
        try{
            Cliente cliente = null;
            String cpf = view.getCpfClienteFormView().trim();
            String nome = view.getNomeClienteFormView().trim();
            String sobrenome = view.getSobrenomeClienteFormView().trim();
            List<Cliente> listaCliente = this.locacaoDao.getListaClienteParaLocar();                   
                        
            clienteFiltroList = filtarCpf(listaCliente, cpf);
            clienteFiltroList = filtarNome(clienteFiltroList, nome);
            clienteFiltroList = filtarSobrenome(clienteFiltroList, sobrenome);
            
            if (clienteFiltroList != null && !clienteFiltroList.isEmpty()) {
                cliente = clienteFiltroList.get(0);
            }

            if(cliente != null){
                view.setClientFormView(cliente);
                view.apresentaInfo("Cliente localizado!");
            } else {
                view.apresentaErro("Erro ao localizar cliente!");
                view.limparFormClienteView();
            }
        }catch(Exception ex){
            ex.printStackTrace();
            view.apresentaErro("Erro ao localizar cliente!");
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

    private List<Cliente> filtarCpf(List<Cliente> lista, String cpf) {
        if (cpf == null || cpf.isEmpty()) {
            return lista;
        } else {
            List<Cliente> listaFiltro = new ArrayList<>(); 
            for (Cliente c : lista) {
                if (c.getCpf().equals(cpf)) {
                    listaFiltro.add(c);
                }
            }
            return listaFiltro; 
        }
    }

    private List<Cliente> filtarNome (List<Cliente> lista, String nome) {
        if (nome == null || nome.isEmpty()) {
            return lista;
        } else {
            List<Cliente> listaFiltro = new ArrayList<>(); 
            for (Cliente c : lista) {
                if (c.getNome().equals(nome)) {
                    listaFiltro.add(c);
                }
            }
            return listaFiltro; 
        }
    }

    private List<Cliente> filtarSobrenome (List<Cliente> lista, String sobrenome) {
        if (sobrenome == null || sobrenome.isEmpty()) {
            return lista;
        } else {
            List<Cliente> listaFiltro = new ArrayList<>(); 
            for (Cliente c : lista) {
                if (c.getSobrenome().equals(sobrenome)) {
                    listaFiltro.add(c);
                }
            }
            return listaFiltro; 
        }
    }
}
