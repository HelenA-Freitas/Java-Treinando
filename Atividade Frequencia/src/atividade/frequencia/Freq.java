/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.frequencia;

/**
 *
 * @author Helen
 */
public class Freq {
    public String nome;
    public String sobrenome;
    public int anonasc;
    public int idade;
    public double freqmax;
    public double freq1;
    public double freq2;
    
    public void calcularidade(){
        int x;
        x=2020-this.getAnonasc();
        this.setIdade(x);
    }
    public void calfreqmax(){
        int x;
        x = 220-this.getIdade();
        this.setFreqmax(x);
    }
    public void calcularalvo(){
        double x, y;
        x = this.getFreqmax()/2;
        y = (this.getFreqmax()*85)/100;
        this.setFreq1(x);
        this.setFreq2(y);   
    }

    public Freq(String nome, String sobrenome, int anonasc) {
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
    
    public double getFreq1() {
        return freq1;
    }
    public void setFreq1(double freq1) {
        this.freq1 = freq1;
    }
    
    public double getFreq2() {
        return freq2;
    }
    public void setFreq2(double freq2) {
        this.freq2 = freq2;
    }
  
    
    
    
    
    
}
