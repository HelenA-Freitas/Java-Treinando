/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array001;

import javax.swing.JOptionPane;

/**
 *
 * @author Helen
 */
public class Array001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de notas que serão adicionadas:"));
        
        double[] notas = new double[qtd]; //criando uma array(vetor)
        
        for(int i=0;i<notas.length;i++){
            notas[i]=Double.parseDouble(JOptionPane.showInputDialog("Digite a nota "+(i+1)+" :"));
        }
        for(int i=0;i<notas.length;i++){
            System.out.println("Nota "+(i+1)+" : "+notas[i]);
        }
        
        
    }}

