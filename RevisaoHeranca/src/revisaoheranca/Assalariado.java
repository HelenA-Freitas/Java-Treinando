/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaoheranca;

/**
 *
 * @author Helen
 */
public class Assalariado extends Empregado{
    private double salario;

    public Assalariado(double salario, String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void vencimento() {
        super.vencimento(); //To change body of generated methods, choose Tools | Templates.
    } 
}