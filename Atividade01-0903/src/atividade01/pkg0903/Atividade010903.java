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
public class Atividade010903 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario f1=new Funcionario();
        f1.nome= "Helen";
        f1.salariobruto= 15000.00;
        f1.imposto= 800.00;
        
        f1.salliquido();
        System.out.println("Funcionário: "+f1.nome+" - Salário Líquido: "+f1.salarioliquido);
        f1.salariobruto=f1.aumento(10);
        f1.salliquido();
        System.out.println("Funcionário: "+f1.nome+" - Novo salário líquido: "+f1.salarioliquido);
    }
    
}
