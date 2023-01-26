/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package locadora.model.enums;

/**
 *
 * @author Felipe
 */
public enum Categoria {
    POPULAR ("Popular"),
    INTERMEDIARIO ("Intermediário"),
    LUXO ("Luxo");
    
    private final String descricao;

    private Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
