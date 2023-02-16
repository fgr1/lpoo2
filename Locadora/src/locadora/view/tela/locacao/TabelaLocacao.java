/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package locadora.view.tela.locacao;

import java.util.List;
import javax.swing.JTable;
import locadora.model.Veiculo;


public class TabelaLocacao extends javax.swing.JPanel {
    
    private LocacaoTableModel locacaoTableModel = new LocacaoTableModel();
    private JanelaLocacao janela;
    private int linhaClicadaParaAtualizacao = -1;
    /**
     * Creates new form TabelaLocacao
     */
    public TabelaLocacao() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tLocar = new javax.swing.JTable();

        tLocar.setModel(locacaoTableModel);
        jScrollPane1.setViewportView(tLocar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public JTable getTabelaLocacao() {
        return tLocar;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tLocar;
    // End of variables declaration//GEN-END:variables

    void setJanelaView(JanelaLocacao janela) {
        this.janela = janela;
    }
    
    public void inserirVeiculoTabela(Veiculo veiculo) {
        locacaoTableModel.adicionaVeiculo(veiculo);
    }

    public void setListaVeiculosTabela(List<Veiculo> lista) {
        locacaoTableModel.setListaVeiculo(lista);
    }
    
    public Veiculo getVeiculoParaLocarDaTabela() {
        int linhaSelecionada = this.getTabelaLocacao().getSelectedRow();
            Veiculo veiculo = locacaoTableModel.getVeiculo(linhaSelecionada);
        return veiculo;
    }
    
    public void excluirVeiculosDaTabela(Veiculo veiculo) {
        locacaoTableModel.removeVeiculo(veiculo);
    }

    public void atualizarVeiculoNaTabela(Veiculo veiculo) {
        locacaoTableModel.fireTableRowsUpdated(linhaClicadaParaAtualizacao, linhaClicadaParaAtualizacao);    
    } 
}
