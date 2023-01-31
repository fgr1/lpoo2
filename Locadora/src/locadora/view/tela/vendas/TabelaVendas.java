/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package locadora.view.tela.vendas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import locadora.model.Veiculo;

/**
 *
 * @author Felipe
 */
public class TabelaVendas extends javax.swing.JPanel {
    private VendasTableModel modeloTabelaVenda = new VendasTableModel();
    private JanelaVendas janela;
    private int linhaClicadaParaAtualizacao = -1;
    /**
     * Creates new form TabelaVendas
     */
    public TabelaVendas() {
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

        spVendas = new javax.swing.JScrollPane();
        tVendas = new javax.swing.JTable();

        tVendas.setModel(modeloTabelaVenda);
        spVendas.setViewportView(tVendas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
                                             

    public JTable getTabelaVendas() {
        return tVendas;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane spVendas;
    private javax.swing.JTable tVendas;
    // End of variables declaration//GEN-END:variables

    public void setJanelaView(JanelaVendas janela) {
        this.janela = janela;
    }
    
    public void inserirVeiculoTabela(Veiculo veiculo) {
        modeloTabelaVenda.adicionaVeiculo(veiculo);
    }

    public void setListaVeiculosTabela(List<Veiculo> lista) {
        modeloTabelaVenda.setListaVeiculo(lista);
    }
    
    public List<Veiculo> getVeiculosParaVenderDaTabela() {
        int[] linhasSelecionadas = this.getTabelaVendas().getSelectedRows();
        List<Veiculo> listaVender = new ArrayList();
        for (int i = 0; i < linhasSelecionadas.length; i++) {
            Veiculo veiculo = modeloTabelaVenda.getVeiculo(linhasSelecionadas[i]);
            listaVender.add(veiculo);
        }
        return listaVender;
    }
    
    public void excluirVeiculosDaTabela(List<Veiculo> listaParaExcluir) {
        modeloTabelaVenda.removeVeiculos(listaParaExcluir);
    }

    public void atualizarVeiculoNaTabela(Veiculo veiculo) {
        
        modeloTabelaVenda.fireTableRowsUpdated(linhaClicadaParaAtualizacao, linhaClicadaParaAtualizacao);
        
    } 
}
