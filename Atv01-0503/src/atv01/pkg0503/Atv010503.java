/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv01.pkg0503;

import javax.swing.JOptionPane;

/**
 *
 * @author Helen
 */
public class Atv010503 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno1=new Aluno();
        Aluno aluno2=new Aluno();
        Aluno rec=new Aluno();
        
        aluno1.matricula=Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira matrícula"));
        aluno1.nome=JOptionPane.showInputDialog("Digite o nome do primeiro aluno");
        aluno1.nota1=Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota de "+aluno1.nome));
        aluno1.nota2=Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota de "+aluno1.nome));
        
        aluno1.calcularmedia(aluno1);
        
        aluno2.matricula=Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda matrícula"));
        aluno2.nome=JOptionPane.showInputDialog("Digite o nome do segundo aluno");
        aluno2.nota1=Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota de "+aluno2.nome));
        aluno2.nota2=Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota de "+aluno2.nome));
        
        aluno2.calcularmedia(aluno2);
        
        System.out.println("Maior nota de "+aluno1.nome+" "+aluno1.maiornota(aluno1.nota1, aluno1.nota2));
        System.out.println("Maior nota de "+aluno2.nome+" "+aluno2.maiornota(aluno2.nota1, aluno2.nota2));
        
        rec = aluno1.maiormedia(aluno1, aluno2);
        System.out.println("Maior média: "+rec.media+" - "+rec.matricula+" - "+rec.nome+" - "+rec.nota1+" - "+rec.nota2);
        System.out.println("Aluno com maior média: "+aluno1.maiormedia2(aluno1, aluno2));
    }
    
}
