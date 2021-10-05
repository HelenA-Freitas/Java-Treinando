/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01.pkg0903;

/**
 *
 * @author Helen
 */
public class Funcionario {
    String nome;
    double salariobruto;
    double imposto;
    double salarioliquido;
    
    void salliquido(){
        this.salarioliquido= this.salariobruto-this.imposto;
    }
    double aumento(double x){
        return this.salariobruto+(this.salariobruto*x)/100;
    }
    
}
