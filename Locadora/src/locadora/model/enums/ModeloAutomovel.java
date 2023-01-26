/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package locadora.model.enums;

/**
 *
 * @author Felipe
 */
public enum ModeloAutomovel {
    
    GOL("Gol"), 
    CELTA("Celta"), 
    PALIO("Palio"), 
    CRUZE("Cruze"), 
    NIX("Onix");    
    
    private final String descricao;

    private ModeloAutomovel(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }   
}
