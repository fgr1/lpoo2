/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package locadora.view.tela.veiculos;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import locadora.model.enums.*;
import static locadora.model.enums.ModeloAutomovel.*;
import static locadora.model.enums.ModeloMotocicleta.*;
import static locadora.model.enums.ModeloVan.*;

/**
 *
 * @author Felipe
 */
public class ComboBoxVeiculos extends javax.swing.JPanel {
    
    private Categoria categoria;
    private Marca marca;
     
    /**
     * Creates new form ComboBoxVeiculos
     */
    public ComboBoxVeiculos() {
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

        cbxAtributo = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        cbxModelo = new javax.swing.JComboBox<>();
        cbxCategoria = new javax.swing.JComboBox<>();
        lCategoria = new javax.swing.JLabel();
        lModelo = new javax.swing.JLabel();
        cbxMarca = new javax.swing.JComboBox<>();
        lMarca = new javax.swing.JLabel();
        lVeiculo = new javax.swing.JLabel();

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCategoria))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lModelo))
                .addContainerGap())
        );

        lVeiculo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lVeiculo.setText("Veículo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lVeiculo)
                .addGap(133, 133, 133))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(cbxAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(lVeiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            marca = (Marca) cbxMarca.getSelectedItem();
            categoria = (Categoria) cbxCategoria.getSelectedItem();
            
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
            marca = (Marca) cbxMarca.getSelectedItem();
            categoria = (Categoria) cbxCategoria.getSelectedItem();
            
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxAtributo;
    private javax.swing.JComboBox<Categoria> cbxCategoria;
    private javax.swing.JComboBox<Marca> cbxMarca;
    private javax.swing.JComboBox<Modelo> cbxModelo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lCategoria;
    private javax.swing.JLabel lMarca;
    private javax.swing.JLabel lModelo;
    private javax.swing.JLabel lVeiculo;
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
}
