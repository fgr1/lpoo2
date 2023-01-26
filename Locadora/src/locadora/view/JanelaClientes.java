/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package locadora.view;

import java.util.List;
import javax.swing.JOptionPane;
import locadora.controller.ClienteController;
import locadora.model.Cliente;
/**
 *
 * @author Felipe
 */
public class JanelaClientes extends javax.swing.JFrame {

    /**
     * Creates new form JanelaClientes
     */
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

        formularioClientes1 = new locadora.view.FormularioClientes();
        botoesClientes1 = new locadora.view.BotoesClientes();
        tabelaClientes1 = new locadora.view.TabelaClientes();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botoesClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(tabelaClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formularioClientes1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botoesClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(tabelaClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formularioClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private locadora.view.BotoesClientes botoesClientes1;
    private locadora.view.FormularioClientes formularioClientes1;
    private locadora.view.TabelaClientes tabelaClientes1;
    // End of variables declaration//GEN-END:variables

    public void setController(ClienteController controller) {
       botoesClientes1.setController(controller); 
    }
    
    public void initView() {
        /* Create and display the form */
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
        JOptionPane.showMessageDialog(null,info + "\n", "Informação", JOptionPane.INFORMATION_MESSAGE);
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


