/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package locadora.model.enums;
/**
 *
 * @author Felipe
 */
public enum ModeloAutomovel implements Modelo{
    
    GOL("Gol"), 
    POLO("Polo"), 
    JETTA("Jetta"),  
    MOBI("Mobi"),
    PALIO("Palio"),
    ARGO("Argo"), 
    CRONOS("Cronos"),
    CELTA("Celta"),
    CRUZE("Cruze"), 
    ONIX("Onix");    
    
    private final String descricao;

    private ModeloAutomovel(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }   
}
