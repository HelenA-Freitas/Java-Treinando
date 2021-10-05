/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv01.pkg3003;

/**
 *
 * @author Helen
 */
public class Veiculo {
    String marca;
    String modelo;
    String cor;
    double valordiaria;

    public Veiculo(String marca, String modelo, String cor, double valordiaria) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.valordiaria = valordiaria;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValordiaria() {
        return valordiaria;
    }
    public void setValordiaria(double valordiaria) {
        this.valordiaria = valordiaria;
    }
    
    
}
