/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.model;

import locadora.model.enums.Categoria;
import locadora.model.enums.Estado;
import locadora.model.enums.Marca;
import locadora.model.enums.ModeloVan;

/**
 *
 * @author Felipe
 */
public class Van extends Veiculo {

    private ModeloVan modelo;

    public Van(ModeloVan modelo, Marca marca, Estado estado, Locacao locacao, Categoria categoria, double valorDeCompra, String placa, int ano) {
        super(marca, estado, locacao, categoria, valorDeCompra, placa, ano);
        this.modelo = modelo;
    }
    
    
    @Override
    public double getValorDiariaLocacao() {
        Categoria cat = this.categoria;
        double valorCategoria;
        
        switch(cat) {
            case POPULAR -> {
                valorCategoria = 200;
                return valorCategoria;
            }
            case INTERMEDIARIO -> {
                valorCategoria = 400;
                return valorCategoria;
            }
            case LUXO -> {
                valorCategoria = 600;
                return valorCategoria;
            }
        }
        return 0;
    }
    
}
