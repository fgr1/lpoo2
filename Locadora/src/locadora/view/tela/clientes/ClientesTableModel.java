/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.view.tela.clientes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import locadora.model.Cliente;

/**
 *
 * @author Felipe
 */
public class ClientesTableModel extends AbstractTableModel{
    
    private String[] colunas=new String[]{"ID","Nome", "Sobrenome", "RG", "CPF", "Endereço"};

    private List<Cliente> lista=new ArrayList();
      
    public ClientesTableModel(List<Cliente> lista){
        this.lista=lista;
    }
    
    public ClientesTableModel(){       
    }

  
    @Override
    public int getRowCount() {
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
        Cliente cliente = lista.get(rowIndex);
        switch (columnIndex) {
            case 0: return cliente.getId();
            case 1: return cliente.getNome();
            case 2: return cliente.getSobrenome();
            case 3: return cliente.getRg();
            case 4: return cliente.getCpf();   
            case 5: return cliente.getEndereco() ;
            default : return null;
        }
    }
    
    @Override
    public void setValueAt(Object value, int row, int col) {
        Cliente cliente = lista.get(row);
        switch (col) {
            case 0:
                cliente.setId((long) value); //if column 0 (code)
                break;
            case 1:
                cliente.setNome((String) value);
                break;
            case 2:
                cliente.setSobrenome((String) value);
                break;
            case 3:
                cliente.setRg((String) value);
                break;
            case 4:
                cliente.setCpf((String) value);
                break;
            case 5:
                cliente.setEndereco((String) value);
                break;
            default:
        }
        this.fireTableCellUpdated(row, col);
    }
    
    void adicionaCliente(Cliente cliente) {
        this.lista.add(cliente);
        this.fireTableRowsInserted(lista.size()-1,lista.size()-1);
    }

    void setListaCliente(List<Cliente> cliente) {
        this.lista = cliente;
        this.fireTableDataChanged();
    }

    public Cliente getCliente(int linha){
        return lista.get(linha);
    }

    public boolean removeCliente(Cliente cliente) {
        int linha = this.lista.indexOf(cliente);
        boolean result = this.lista.remove(cliente);
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

    void removeClientes(List<Cliente> listaParaExcluir) {
        listaParaExcluir.forEach((cliente) -> {
            removeCliente(cliente);
        });
    }
    
}
