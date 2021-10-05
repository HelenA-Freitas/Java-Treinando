/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv01.pkg1203;

import javax.swing.JOptionPane;

/**
 *
 * @author Helen
 */
public class Atv011203 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta c1=new Conta(JOptionPane.showInputDialog("Digite o nome"), Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta")), 15000.00);
        Conta c2=new Conta("Lucas", 5789, 15000.00);
        
        c1.sacar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja sacar")));
        System.out.println("Nome: "+c1.getNome()+"\nNúmero: "+c1.getNumero()+"\nSaldo:R$ "+c1.getSaldo());
        c1.depositar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja depositar")));
        System.out.println("\nNome: "+c1.getNome()+"\nNúmero: "+c1.getNumero()+"\nSaldo:R$ "+c1.getSaldo());
        
        c2.sacar(2000.00);
        System.out.println("\nNome: "+c2.getNome()+"\nNúmero: "+c2.getNumero()+"\nSaldo:R$ "+c2.getSaldo());
        c2.depositar(10000.00);
        System.out.println("\nNome: "+c2.getNome()+"\nNúmero: "+c2.getNumero()+"\nSaldo:R$ "+c2.getSaldo());
        
        
    }
    
}
