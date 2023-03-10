/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package locadora.view.tela.clientes;
import locadora.model.Cliente;


public class FormularioClientes extends javax.swing.JPanel {

    private Cliente clienteSelecionadoParaAtualizacao;
    
    public FormularioClientes() {
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

        labelClienteNome = new javax.swing.JLabel();
        labelClienteSobrenome = new javax.swing.JLabel();
        labelClienteRg = new javax.swing.JLabel();
        labelClienteCpf = new javax.swing.JLabel();
        labelClienteEndereco = new javax.swing.JLabel();
        campoNomeCliente = new javax.swing.JTextField();
        campoSobrenome = new javax.swing.JTextField();
        campoRg = new javax.swing.JFormattedTextField();
        campoCpf = new javax.swing.JFormattedTextField();
        campoEndereco = new javax.swing.JTextField();

        labelClienteNome.setText("Nome");
        labelClienteNome.setToolTipText("");

        labelClienteSobrenome.setText("Sobrenome");

        labelClienteRg.setText("RG");

        labelClienteCpf.setText("CPF");

        labelClienteEndereco.setText("Endereço");

        try {
            campoRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoRg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoRgKeyTyped(evt);
            }
        });

        try {
            campoCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoCpfKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelClienteNome)
                        .addGap(18, 18, 18)
                        .addComponent(campoNomeCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelClienteSobrenome)
                        .addGap(18, 18, 18)
                        .addComponent(campoSobrenome, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelClienteEndereco)
                        .addGap(18, 18, 18)
                        .addComponent(campoEndereco))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelClienteCpf)
                            .addComponent(labelClienteRg))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoRg)
                            .addComponent(campoCpf))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelClienteNome)
                    .addComponent(campoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelClienteSobrenome)
                    .addComponent(campoSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelClienteRg)
                    .addComponent(campoRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelClienteCpf)
                    .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelClienteEndereco)
                    .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campoRgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoRgKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_campoRgKeyTyped

    private void campoCpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCpfKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_campoCpfKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField campoCpf;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoNomeCliente;
    private javax.swing.JFormattedTextField campoRg;
    private javax.swing.JTextField campoSobrenome;
    private javax.swing.JLabel labelClienteCpf;
    private javax.swing.JLabel labelClienteEndereco;
    private javax.swing.JLabel labelClienteNome;
    private javax.swing.JLabel labelClienteRg;
    private javax.swing.JLabel labelClienteSobrenome;
    // End of variables declaration//GEN-END:variables

    public void setCliente(Cliente cliente) {
        this.clienteSelecionadoParaAtualizacao = cliente;
        campoNomeCliente.setText(cliente.getNome());
        campoSobrenome.setText(cliente.getSobrenome());
        campoRg.setText(cliente.getRg());
        campoCpf.setText(cliente.getCpf());
        campoEndereco.setText(cliente.getEndereco());      
    }

        public void limparClienteAtualizar(){
        clienteSelecionadoParaAtualizacao=null;
    }
    
        public Cliente getClienteParaAtualizar() {
        if(clienteSelecionadoParaAtualizacao==null){
            return null;
        }
            clienteSelecionadoParaAtualizacao.setNome(campoNomeCliente.getText());
            clienteSelecionadoParaAtualizacao.setSobrenome(campoSobrenome.getText());
            clienteSelecionadoParaAtualizacao.setRg(campoRg.getText());
            clienteSelecionadoParaAtualizacao.setCpf(campoCpf.getText());
            clienteSelecionadoParaAtualizacao.setEndereco(campoEndereco.getText());      
            return clienteSelecionadoParaAtualizacao;            
        }  
    public Cliente getClienteFormulario() {
       String nome = campoNomeCliente.getText();
       String sobrenome = campoSobrenome.getText();
       String rg = campoRg.getText();
       String cpf = campoCpf.getText();
       String endereco = campoEndereco.getText();
     
       return new Cliente(nome, sobrenome, rg, cpf, endereco);
    }
}
