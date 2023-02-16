/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.model;

import locadora.model.enums.Categoria;
import locadora.model.enums.Marca;
import locadora.model.enums.Estado;
import java.util.Calendar;

/**
 *
 * @author Felipe
 */
public abstract class Veiculo implements VeiculoI {
    
    Marca marca;
    Estado estado;
    Locacao locacao;
    Categoria categoria;
    private double valorDeCompra;
    private String placa;
    private int ano;

    public Veiculo(Marca marca, Estado estado, Categoria categoria, double valorDeCompra, String placa, int ano) {
        this.marca = marca;
        this.estado = estado;
        this.categoria = categoria;
        this.valorDeCompra = valorDeCompra;
        this.placa = placa;
        this.ano = ano;
    }

    @Override
    public abstract double getValorDiariaLocacao();

    @Override
    public double getValorParaVenda(){
        int idadeVeiculoEmAnos = (Calendar.getInstance().get(Calendar.YEAR)) - this.ano;
        double valorParaVenda = this.valorDeCompra - (idadeVeiculoEmAnos*0.15*valorDeCompra);
        if((valorParaVenda<(this.valorDeCompra*0.10)) || valorParaVenda<0){
            valorParaVenda = valorDeCompra*0.1;
        }
        return valorParaVenda;
    }

    @Override
    public int getAno() {
        return this.ano;
    }

    @Override
    public String getPlaca() {
        return this.placa;
    }

    @Override
    public Locacao getLocacao() {
        return this.locacao;
    }

    @Override
    public Categoria getCategoria() {
        return this.categoria;
    }

    @Override
    public Marca getMarca() {
        return this.marca;
    }

    @Override
    public Estado getEstado() {
        return this.estado;
    }

    @Override
    public void devolver(){
        this.estado = Estado.DISPONIVEL;
    }

    @Override
    public void vender() {
        this.estado = Estado.VENDIDO;
    }

    @Override
    public void locar(int dias, Calendar data, Cliente cliente){
        if(!Estado.VENDIDO.equals(this.estado)){
                    this.estado = Estado.LOCADO;
                    double valor = this.getValorDiariaLocacao()*dias;
                    Locacao locacao = new Locacao(cliente,dias,data,valor);
                    this.locacao = locacao;
                }
    }

    public double getValorDeCompra() {
        return valorDeCompra;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }
    
}
