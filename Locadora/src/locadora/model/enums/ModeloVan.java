/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package locadora.model.enums;

/**
 *
 * @author Felipe
 */
public enum ModeloVan {
   
    KOMBI("Kombi"), 
    SPRINTER("Sprinter"), 
    DUCATO("Ducato");
    
    private final String descricao;

    private ModeloVan(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }   
}
