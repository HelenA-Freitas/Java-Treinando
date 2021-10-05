/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv01.pkg0203;

import javax.swing.JOptionPane;

/**
 *
 * @author Helen
 */
public class Atv010203 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        
        p1.nome = JOptionPane.showInputDialog("Digite o nome da primeira pessoa");
        p1.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da primeira pessoa"));
        
        p2.nome = JOptionPane.showInputDialog("Digite o nome da segunda pessoa");
        p2.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da segunda pessoa"));
        
        System.out.println("Pessoa mais velha: "+p1.maisvelha(p1, p2));
            
    }
    
}
