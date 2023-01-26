/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package locadora.model.enums;

/**
 *
 * @author Felipe
 */
public enum Estado {

    NOVO ("Novo"), 
    LOCADO ("Locado"), 
    DISPONIVEL ("Disponível"), 
    VENDIDO("Vendido");
    
    private final String descricao;

    private Estado(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }   
}
