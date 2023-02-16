/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.view.tela.vendas;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import locadora.model.Automovel;
import locadora.model.Motocicleta;
import locadora.model.Van;
import locadora.model.Veiculo;


public class VendasTableModel extends AbstractTableModel {

    private String[] colunas=new String[]{"Placa", "Marca", "Modelo", "Ano", "Preço de venda"};

    private List<Veiculo> lista=new ArrayList();
      
    public VendasTableModel(List<Veiculo> lista){
        this.lista=lista;
    }
    
    public VendasTableModel(){       
    }

  
    @Override
    public int getRowCount() {
        if(null == lista)
            return 0;
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public String getColumnName(int index) {
        return this.colunas[index];
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
        /*if(column==0)
            return true;
        return false;*/
    }  
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Veiculo veiculo = lista.get(rowIndex);
        switch (columnIndex) {
            case 0: return veiculo.getPlaca();
            case 1: return veiculo.getMarca();
            case 2: 
                if(veiculo instanceof Automovel v) {
                    return v.getModelo();
                } else if (veiculo instanceof Motocicleta v) {
                    return v.getModelo();
                } else if (veiculo instanceof Van v) {
                    return v.getModelo();
                }
            case 3: return veiculo.getAno();  
            case 4: return NumberFormat.getCurrencyInstance().format(veiculo.getValorParaVenda());  
            default : return null;
        }
    }
    
    void adicionaVeiculo(Veiculo veiculo) {
        this.lista.add(veiculo);
        this.fireTableRowsInserted(lista.size()-1,lista.size()-1);
    }

    void setListaVeiculo(List<Veiculo> veiculo) {
        this.lista = veiculo;
        this.fireTableDataChanged();
    }

    public Veiculo getVeiculo(int linha){
        return lista.get(linha);
    }

    public boolean removeVeiculo(Veiculo veiculo) {
        int linha = this.lista.indexOf(veiculo);
        boolean result = this.lista.remove(veiculo);
        this.fireTableRowsDeleted(linha,linha);
        return result;
    }  

    public void limpaTabela() {
        int indice = lista.size()-1;
        if(indice<0)
            indice=0;
        this.lista = new ArrayList();
        this.fireTableRowsDeleted(0,indice);
    }

    void removeVeiculos(List<Veiculo> listaParaExcluir) {
        listaParaExcluir.forEach((veiculo) -> {
            removeVeiculo(veiculo);
        });
    }
    
}
