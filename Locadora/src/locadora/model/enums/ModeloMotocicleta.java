/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package locadora.model.enums;

/**
 *
 * @author Felipe
 */
public enum ModeloMotocicleta implements Modelo{
  
    CG125("CG 125"), 
    CB500X("CB 500x"), 
    CB250TWISTER("CB 250 TWISTER");
    
    private final String descricao;

    private ModeloMotocicleta(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}
