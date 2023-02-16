/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.controller;

import java.sql.SQLException;
import java.util.List;
import locadora.model.Cliente;
import locadora.dao.ClienteDao;
import locadora.view.tela.clientes.JanelaClientes;
import locadora.view.JanelaIndex;

/**
 *
 * @author Felipe
 */
public class ClienteController {
    
    private JanelaClientes view;
    private ClienteDao clienteDao;

    public ClienteController(JanelaClientes view, ClienteDao clienteDao) {
        this.view = view;
        this.clienteDao = clienteDao;
        initController();
    }

    private void initController() {        
        this.view.setController(this);
        this.view.initView();
    }
    
    public void incluirCliente() {
        try{
            Cliente cliente = view.getClienteFormulario();
            clienteDao.inserir(cliente);
            view.inserirClienteView(cliente);
            view.apresentaInfo("Adicionado com sucesso!!!");
        }catch(Exception ex){
            view.apresentaErro("Erro ao criar contato.");
        }
    }

    public void atualizarCliente() {
        try{
            
            Cliente cliente = view.getClienteParaAtualizar();
            if(cliente==null){
                view.apresentaInfo("Selecione um contato na tabela para atualizar.");
                return;
            }
            clienteDao.atualizar(cliente);
            view.atualizarCliente(cliente);
            
        }catch(Exception ex){
            view.apresentaErro("Erro ao atualizar contato.");
        }
    }
    
    public void excluirCliente(){
        try {
        List<Cliente> listaParaExcluir = view.getClientesParaExcluir();
        
        for (Cliente cliente : listaParaExcluir) {
            if (clienteDao.clienteEstaEmLocacao(cliente)) {
                view.apresentaErro("O cliente " + cliente.getNome() + " não pode ser excluído pois está em uma locação.");
            } else {
                clienteDao.excluir(cliente);
                view.excluirClienteView(listaParaExcluir);
            }
        }
        } catch (RuntimeException ex) {
            view.apresentaErro("Erro ao excluir contatos.");
        } catch (SQLException ex) {
            view.apresentaErro("Erro ao acessar o banco de dados.");
        }
    }
    
    public void listarCliente() {
        try{
            view.limparClienteAtualizar();
            List<Cliente> lista = this.clienteDao.getLista();
            view.mostrarListaClientes(lista);
        }catch(SQLException ex){
            view.apresentaErro("Erro ao listar contatos.");
        }
    }
    
     public void voltarIndex() {
        JanelaIndex janela = new JanelaIndex();
        IndexController controller = new IndexController(janela);
        view.dispose();
        
    }
}
