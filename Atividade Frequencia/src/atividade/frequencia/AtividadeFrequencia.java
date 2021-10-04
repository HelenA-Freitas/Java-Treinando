/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.frequencia;

import javax.swing.JOptionPane;

/**
 *
 * @author Helen
 */
public class AtividadeFrequencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Freq f1 = new Freq(JOptionPane.showInputDialog("Digite o nome"),JOptionPane.showInputDialog("Digite o sobrenome"),Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento")));
        
        f1.calcularidade();
        f1.calfreqmax();
        f1.calcularalvo();
        System.out.println("Idade: "+f1.getIdade()+" anos \nFrequência Máxima: "+f1.getFreqmax()+"\nFrequência Alvo: "+f1.getFreq1()+" - "+f1.getFreq2());
        
    }
    
}
