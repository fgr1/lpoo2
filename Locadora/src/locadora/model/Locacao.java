/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.model;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Locacao {

    private Cliente cliente;
    private int dias;
    private Calendar data;
    private double valor;
    private String placa;

    public Locacao(Cliente cliente, int dias, Calendar data, double valor, String placa) {
        this.cliente = cliente;
        this.dias = dias;
        this.data = data;
        this.valor = valor;
        this.placa = placa;
    }    

    Locacao(Cliente cliente, int dias, Calendar data, double valor) {
        this.cliente = cliente;
        this.dias = dias;
        this.data = data;
        this.valor = valor;
    }
    //Retorna o valor da locação.
    public double getValor(){
        return valor; 
    }

    public int getDias() {
        return dias;
    }

    public String getPlaca() {
        return placa;
    }

    public Calendar getData(){
        DateFormat formato = new SimpleDateFormat("yyyy/MM/dd ");
        Calendar Data = Calendar.getInstance();
        return Data;     
    }
    
    //Retorna o cliente da locação
    public Cliente getCliente() {
        return cliente;
    }
}
