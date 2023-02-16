/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package locadora.model.enums;


public enum Categoria {
    POPULAR ("POPULAR"),
    INTERMEDIARIO ("INTERMEDIARIO"),
    LUXO ("LUXO");
    
    private final String descricao;
    
    private Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
