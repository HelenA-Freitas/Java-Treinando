/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv01.pkg2603;

/**
 *
 * @author Helen
 */
public class Celular {
    public String marca;
    public String cor;
    public String modelo;
    public double valor;
    public Capa capa;
    
    public Celular(String marca, String cor, String modelo, double valor, Capa capa) {
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.valor = valor;
        this.capa = capa;
    }
    
    public double precoTotal(){
    return this.getValor()+this.getCapa().getPreço();
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
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

    public Capa getCapa() {
        return capa;
    }
    public void setCapa(Capa capa) {
        this.capa = capa;
    }
        
}
