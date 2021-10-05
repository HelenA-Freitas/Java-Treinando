/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv01.pkg1203;

/**
 *
 * @author Helen
 */
public class Conta {
    String nome;
    int numero;
    double saldo;

    public Conta(String x, int y, double z) {
        this.nome = x;
        this.numero = y;
        this.saldo = z;
    }

     public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
  
    public void sacar(double x){
        double valor = this.getSaldo();
        valor-=x;
        this.setSaldo(valor);
    }

    public void depositar(double x){
        double valor = this.getSaldo();
        valor+=x;
        this.setSaldo(valor);
    }
    
    
}
