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
public abstract class Empregado {
    private String nome;
    private String sobrenome;
    private String cpf;

    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf + '}';
    }

    public Empregado(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void vencimento(){
    
    }
}
