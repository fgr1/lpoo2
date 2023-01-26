/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package locadora.model.enums;

/**
 *
 * @author Felipe
 */
public enum Marca {
    
    VW ("Volkswagen"), 
    GM ("General Motors"), 
    FIAT ("Fiat"), 
    HONDA ("Honda"), 
    MERCEDES ("Mercedes");
           
    private final String descricao;

    private Marca(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
