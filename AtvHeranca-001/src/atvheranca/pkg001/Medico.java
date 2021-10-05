/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvheranca.pkg001;

/**
 *
 * @author Helen
 */
public class Medico {
    private String crm;
    private String nome;
    private int idade;
    private double salario;

    public Medico(String crm, String nome, int idade, double salario) {
        this.crm = crm;
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void medicoAposentado(){
        if(this.getIdade()>=55){
            System.out.println("Médico aposentado!");
        }else{
            System.out.println("Médico não aposentado!");
        }
    }
    
    public void medicoAposentadoria(){
        double aposentadoria;
        aposentadoria = this.getSalario()*80/100;
        System.out.println("Valor da aposentadoria: R$"+aposentadoria);
    }
    
}
