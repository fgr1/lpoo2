/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package locadora.view.tela.veiculos;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import locadora.model.Automovel;
import locadora.model.Motocicleta;
import locadora.model.Van;
import locadora.model.Veiculo;
import locadora.model.enums.Categoria;
import locadora.model.enums.Estado;
import locadora.model.enums.Marca;
import locadora.model.enums.Modelo;
import locadora.model.enums.ModeloAutomovel;
import static locadora.model.enums.ModeloAutomovel.*;
import locadora.model.enums.ModeloMotocicleta;
import static locadora.model.enums.ModeloMotocicleta.*;
import locadora.model.enums.ModeloVan;
import static locadora.model.enums.ModeloVan.*;

/**
 *
 * @author Felipe
 */
public class FormVeiculos extends javax.swing.JPanel {

     /**
     * Creates new form FormVeiculos
     */
    public FormVeiculos() {
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

        jPanel1 = new javax.swing.JPanel();
        cbxAtributo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        cbxModelo = new javax.swing.JComboBox<>();
        cbxCategoria = new javax.swing.JComboBox<>();
        lCategoria = new javax.swing.JLabel();
        lModelo = new javax.swing.JLabel();
        cbxMarca = new javax.swing.JComboBox<>();
        lMarca = new javax.swing.JLabel();
        lVeiculo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lValorCompra = new javax.swing.JLabel();
        lPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JFormattedTextField();
        txtValorCompra = new javax.swing.JFormattedTextField();
        lAno = new javax.swing.JLabel();
        txtAno = new javax.swing.JFormattedTextField();

        cbxAtributo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automóvel", "Motocicleta", "Van"}));
        cbxAtributo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbxAtributo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAtributoActionPerformed(evt);
            }
        });

        cbxCategoria.setModel(new DefaultComboBoxModel(Categoria.values()));
        cbxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCategoriaActionPerformed(evt);
            }
        });

        lCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lCategoria.setText("Categoria");

        lModelo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lModelo.setText("Modelo");

        cbxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMarcaActionPerformed(evt);
            }
        });

        lMarca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lMarca.setText("Marca");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCategoria))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lModelo))
                .addContainerGap())
        );

        lVeiculo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lVeiculo.setText("Veículo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(lVeiculo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxAtributo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lVeiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(cbxAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lValorCompra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lValorCompra.setText("Valor de Compra: ");

        lPlaca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lPlaca.setText("Placa: ");

        try {
            txtPlaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUU-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });

        txtValorCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtValorCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorCompraKeyTyped(evt);
            }
        });

        lAno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lAno.setText("Ano: ");

        try {
            txtAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtAno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(lPlaca)
                            .addGap(91, 91, 91))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(lValorCompra)
                            .addGap(18, 18, 18)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lAno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPlaca)
                    .addComponent(txtAno)
                    .addComponent(txtValorCompra))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPlaca)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lAno)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbxAtributoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAtributoActionPerformed
        try{
            if(cbxAtributo.getSelectedItem().equals("Automóvel")){
                cbxMarca.removeAllItems();
                cbxModelo.removeAllItems();
                cbxMarca.addItem(Marca.Volkswagen);
                cbxMarca.addItem(Marca.GM);
                cbxMarca.addItem(Marca.Fiat);
            }
            else
            if(cbxAtributo.getSelectedItem().equals("Motocicleta")) {
                cbxMarca.removeAllItems();
                cbxModelo.removeAllItems();
                cbxMarca.addItem(Marca.Honda);
            }
            else
            if(cbxAtributo.getSelectedItem().equals("Van")){
                cbxMarca.removeAllItems();
                cbxModelo.removeAllItems();
                cbxMarca.addItem(Marca.GM);
                cbxMarca.addItem(Marca.Fiat);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_cbxAtributoActionPerformed

    private void cbxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategoriaActionPerformed
        try{
            ArrayList<Modelo> listaModelo;
            Marca marca = (Marca) cbxMarca.getSelectedItem();
            Categoria categoria = (Categoria) cbxCategoria.getSelectedItem();

            if(cbxAtributo.getSelectedItem().equals("Automóvel")){
                cbxModelo.removeAllItems();
                listaModelo = getListaAutomovel(marca, categoria);
                for(Modelo m : listaModelo){
                    cbxModelo.addItem(m);
                }
            }
            else
            if(cbxAtributo.getSelectedItem().equals("Motocicleta")) {
                cbxModelo.removeAllItems();
                listaModelo = getListaMotocicleta(marca, categoria);
                for(Modelo m : listaModelo){
                    cbxModelo.addItem(m);
                }
            }
            else
            if(cbxAtributo.getSelectedItem().equals("Van")){
                cbxModelo.removeAllItems();
                listaModelo = getListaVan(marca, categoria);
                for(Modelo m : listaModelo){
                    cbxModelo.addItem(m);
                }
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_cbxCategoriaActionPerformed

    private void cbxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMarcaActionPerformed
        try{
            ArrayList<Modelo> listaModelo;
            Marca marca = (Marca) cbxMarca.getSelectedItem();
            Categoria categoria = (Categoria) cbxCategoria.getSelectedItem();

            if(cbxAtributo.getSelectedItem().equals("Automóvel")){
                cbxModelo.removeAllItems();
                listaModelo = getListaAutomovel(marca, categoria);
                for(Modelo m : listaModelo){
                    cbxModelo.addItem(m);
                }
            }
            else
            if(cbxAtributo.getSelectedItem().equals("Motocicleta")) {
                cbxModelo.removeAllItems();
                listaModelo = getListaMotocicleta(marca, categoria);
                for(Modelo m : listaModelo){
                    cbxModelo.addItem(m);
                }
            }
            else
            if(cbxAtributo.getSelectedItem().equals("Van")){
                cbxModelo.removeAllItems();
                listaModelo = getListaVan(marca, categoria);
                for(Modelo m : listaModelo){
                    cbxModelo.addItem(m);
                }
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_cbxMarcaActionPerformed

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaActionPerformed

    private void txtValorCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorCompraKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtValorCompraKeyTyped

    private void txtAnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnoKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtAnoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxAtributo;
    private javax.swing.JComboBox<Categoria> cbxCategoria;
    private javax.swing.JComboBox<Marca> cbxMarca;
    private javax.swing.JComboBox<Modelo> cbxModelo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lAno;
    private javax.swing.JLabel lCategoria;
    private javax.swing.JLabel lMarca;
    private javax.swing.JLabel lModelo;
    private javax.swing.JLabel lPlaca;
    private javax.swing.JLabel lValorCompra;
    private javax.swing.JLabel lVeiculo;
    private javax.swing.JFormattedTextField txtAno;
    private javax.swing.JFormattedTextField txtPlaca;
    private javax.swing.JFormattedTextField txtValorCompra;
    // End of variables declaration//GEN-END:variables

    public ArrayList<Modelo> getListaAutomovel (Marca marca, Categoria categoria){
        ArrayList<Modelo> listaModelo = new ArrayList();
                
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
        ArrayList<Modelo> listaModelo = new ArrayList();
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
        ArrayList<Modelo> listaModelo = new ArrayList();
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

    public Veiculo getVeiculoFormulario() {
        Veiculo v = null;
        String vlr = txtValorCompra.getText();
        Double d = Double.parseDouble(vlr);
        String ano = txtAno.getText();
        int a = Integer.parseInt(ano);
        Marca marca = (Marca) cbxMarca.getSelectedItem();
        Categoria cat = (Categoria) cbxCategoria.getSelectedItem();
      
        if(cbxAtributo.getSelectedItem().equals("Automóvel")){
            ModeloAutomovel model = (ModeloAutomovel) cbxModelo.getSelectedItem();

            v = new Automovel(model, marca, Estado.NOVO, cat, d, txtPlaca.getText(), a);
        }
        else
        if(cbxAtributo.getSelectedItem().equals("Motocicleta")) {
            ModeloMotocicleta model = (ModeloMotocicleta) cbxModelo.getSelectedItem();

            v = new Motocicleta(model, marca, Estado.NOVO, cat, d, txtPlaca.getText(), a);
        }
        else
        if(cbxAtributo.getSelectedItem().equals("Van")){
            ModeloVan model = (ModeloVan) cbxModelo.getSelectedItem();

            v = new Van(model, marca, Estado.NOVO, cat, d, txtPlaca.getText(), a);
        }
        return v;     
    }
    
    public void limparForm(){
        txtAno.setText("");
        txtPlaca.setText("");
        txtValorCompra.setText("");
    }
}
