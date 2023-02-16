/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package locadora.view.tela.devolucao;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import locadora.model.Automovel;
import locadora.model.Cliente;
import locadora.model.Locacao;
import locadora.model.Motocicleta;
import locadora.model.Van;
import locadora.model.Veiculo;

/**
 *
 * @author Felipe
 */
public class DevolucaoTableModel extends AbstractTableModel{

    private String[] colunas=new String[]{"Cliente","Placa", "Marca", "Modelo", "Ano", "Data de Locação", "Preço Diária", "Dias", "Valor da Locação"};

    private List<Veiculo> listaVeiculo=new ArrayList();
    private List<Cliente> listaCliente=new ArrayList();
      
    public DevolucaoTableModel(List<Veiculo> listaVeiculo, List<Cliente> listaCliente){
        this.listaVeiculo=listaVeiculo;
        this.listaCliente=listaCliente;
    }
    
    public DevolucaoTableModel(){       
    }

  
    @Override
    public int getRowCount() {
        if(null == listaVeiculo)
            return 0;
        return this.listaVeiculo.size();
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
    public Object getValueAt(int rowIndex, int columnIndex) {
        Veiculo veiculo = listaVeiculo.get(rowIndex);
        switch (columnIndex) {
            case 0: {            
                Locacao locacao = veiculo.getLocacao();
                if (locacao != null && locacao.getCliente() != null) {
                    return locacao.getCliente().getNome();
                } else {
                    return "";
                }
            }
            case 1: return veiculo.getPlaca();
            case 2: return veiculo.getMarca();
            case 3: 
                if(veiculo instanceof Automovel v) {
                    return v.getModelo();
                } else if (veiculo instanceof Motocicleta v) {
                    return v.getModelo();
                } else if (veiculo instanceof Van v) {
                    return v.getModelo();
                } 
            case 4: return veiculo.getAno();
            case 5: {
                Calendar data = veiculo.getLocacao().getData();
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                formatter.format(data.getTime());
                return formatter.format(data.getTime());
            }
            case 6: return NumberFormat.getCurrencyInstance().format(veiculo.getValorDiariaLocacao());
            case 7: return veiculo.getLocacao().getdias();
            case 8: return NumberFormat.getCurrencyInstance().format(veiculo.getLocacao().getValor());
            default : return null;
        }
    }
    
    void adicionaVeiculo(Veiculo veiculo) {
        this.listaVeiculo.add(veiculo);
        this.fireTableRowsInserted(listaVeiculo.size()-1,listaVeiculo.size()-1);
    }

    void setListaVeiculo(List<Veiculo> veiculo) {
        this.listaVeiculo = veiculo;
        this.fireTableDataChanged();
    }

    public Veiculo getVeiculo(int linha){
        return listaVeiculo.get(linha);
    }

    public boolean removeVeiculo(Veiculo veiculo) {
        int linha = this.listaVeiculo.indexOf(veiculo);
        boolean result = this.listaVeiculo.remove(veiculo);
        this.fireTableRowsDeleted(linha,linha);
        return result;
    }  

    public void limpaTabela() {
        int indice = listaVeiculo.size()-1;
        if(indice<0)
            indice=0;
        this.listaVeiculo = new ArrayList();
        this.fireTableRowsDeleted(0,indice);
    }    
}
