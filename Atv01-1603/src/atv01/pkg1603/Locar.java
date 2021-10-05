/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv01.pkg1603;

/**
 *
 * @author Helen
 */
public class Locar {
    public String cliente;
    public String data;
    public int dias;
    public String modelo;
    public double valor;

    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public int getDias() {
        return dias;
    }
    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public Locar(String cliente, String data, int dias, String modelo, double valor) {
        this.cliente = cliente;
        this.data = data;
        this.dias = dias;
        this.modelo = modelo;
        this.valor = valor;
    }
    
    public double vtotal(){
        double x;
        x = this.dias*this.valor;
        return x;
    }
    
    
}
