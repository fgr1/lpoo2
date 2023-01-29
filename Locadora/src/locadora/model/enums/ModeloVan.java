/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package locadora.model.enums;

/**
 *
 * @author Felipe
 */
public enum ModeloVan implements Modelo {
   
    FIORINO ("Fiorino"),
    SCUDO("Scudo"),
    DUCATO("Ducato Chassi"),
    SPIN ("Spin"),
    TRACKER("Tracker"),
    EQUINOX("Equinox"),
    TRAILBRAZER("Trailbrazer");
    
    private final String descricao;

    private ModeloVan(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }   
}
