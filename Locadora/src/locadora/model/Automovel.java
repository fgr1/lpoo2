/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.model;

import locadora.model.enums.Categoria;
import locadora.model.enums.Estado;
import locadora.model.enums.Marca;
import locadora.model.enums.ModeloAutomovel;

/**
 *
 * @author Felipe
 */
public class Automovel extends Veiculo {
     
    private ModeloAutomovel modelo;

    public Automovel(ModeloAutomovel modelo, Marca marca, Estado estado, Categoria categoria, double valorDeCompra, String placa, int ano) {
        super(marca, estado, categoria, valorDeCompra, placa, ano);
        this.modelo = modelo;
    }

    public ModeloAutomovel getModelo() {
        return modelo;
    }

    public void setModelo(ModeloAutomovel modelo) {
        this.modelo = modelo;
    }

    
    @Override
    public double getValorDiariaLocacao() {
        Categoria cat = this.categoria;
        double valorCategoria;
        
        switch(cat) {
            case POPULAR -> {
                valorCategoria = 100;
                return valorCategoria;
            }
            case INTERMEDIARIO -> {
                valorCategoria = 300;
                return valorCategoria;
            }
            case LUXO -> {
                valorCategoria = 450;
                return valorCategoria;
            }
        }
        return 0;
    }
}
