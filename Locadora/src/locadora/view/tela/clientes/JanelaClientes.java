/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package locadora.view.tela.clientes;

import java.util.List;
import javax.swing.JOptionPane;
import locadora.controller.ClienteController;
import locadora.model.Cliente;


public class JanelaClientes extends javax.swing.JFrame {

    public JanelaClientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botoesClientes1 = new locadora.view.tela.clientes.BotoesClientes();
        tabelaClientes1 = new locadora.view.tela.clientes.TabelaClientes();
        formularioClientes1 = new locadora.view.tela.clientes.FormularioClientes();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botoesClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formularioClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabelaClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botoesClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tabelaClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(formularioClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private locadora.view.tela.clientes.BotoesClientes botoesClientes1;
    private locadora.view.tela.clientes.FormularioClientes formularioClientes1;
    private locadora.view.tela.clientes.TabelaClientes tabelaClientes1;
    // End of variables declaration//GEN-END:variables

    public void setController(ClienteController controller) {
       botoesClientes1.setController(controller); 
    }
    
    public void initView() {
        tabelaClientes1.setJanelaView(this);
        java.awt.EventQueue.invokeLater(() ->  this.setVisible(true));
    }   
    
    public Cliente getClienteFormulario() {
       return this.formularioClientes1.getClienteFormulario();
    }
    
    public void inserirClienteView(Cliente cliente) {
       tabelaClientes1.inserirClienteTabela(cliente);
    }
    
    public void apresentaErro(String erro) {
       JOptionPane.showMessageDialog(null,erro + "\n", "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
    public void mostrarListaClientes(List<Cliente> lista) {
       tabelaClientes1.setListaClientesTabela(lista);
    }
    
    public List<Cliente> getClientesParaExcluir() {
       return this.tabelaClientes1.getClientesParaExcluirDaTabela();
    }

    public void excluirClienteView(List<Cliente> listaParaExcluir) {
       tabelaClientes1.excluirClientesDaTabela(listaParaExcluir);
    }
    
    public Cliente getClienteParaAtualizar() {
       return formularioClientes1.getClienteParaAtualizar();
    }  
    
    public void atualizarCliente(Cliente cliente) {
       tabelaClientes1.atualizarClienteNaTabela(cliente);
    }
    
    public void limparClienteAtualizar(){
       formularioClientes1.limparClienteAtualizar();
    }
    
    public void apresentaInfo(String info) {
        JOptionPane.showMessageDialog(null,info + "\n", "Informa????o", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public BotoesClientes getBotoesClienteView() {
       return botoesClientes1;
    }  
    
    public FormularioClientes getFormularioClientesView() {
       return formularioClientes1;
    }
    
    public TabelaClientes getTabelaClienteView() {
       return tabelaClientes1;
    }
}


