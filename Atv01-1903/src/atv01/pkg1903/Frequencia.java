/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv01.pkg1903;

/**
 *
 * @author Helen
 */
public class Frequencia {
    public String nome;
    public String sobrenome;
    public int anonasc;
    public int idade;
    public double freqmax;
    public double freqalvo1;
    public double freqalvo2;

    public Frequencia(String nome, String sobrenome, int anonasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.anonasc = anonasc;
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

    public int getAnonasc() {
        return anonasc;
    }
    public void setAnonasc(int anonasc) {
        this.anonasc = anonasc;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getFreqmax() {
        return freqmax;
    }
    public void setFreqmax(double freqmax) {
        this.freqmax = freqmax;
    }

    public double getFreqalvo1() {
        return freqalvo1;
    }
    public void setFreqalvo1(double freqalvo1) {
        this.freqalvo1 = freqalvo1;
    }

    public double getFreqalvo2() {
        return freqalvo2;
    }
    public void setFreqalvo2(double freqalvo2) {
        this.freqalvo2 = freqalvo2;
    }
    
    public void calcularidade(){
        int x;
        x = 2020-this.anonasc;
        this.setIdade(x);
    }
    
    
}
