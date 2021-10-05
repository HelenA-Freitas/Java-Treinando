/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist001;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Helen
 */
public class ArrayList001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Alunos> alunos = new ArrayList<>();
        
        Alunos aluno1 = new Alunos("Helen","helen@gmail.com", 18);
        Alunos aluno2 = new Alunos("Lucas","lucas@gmail.com", 18);
        Alunos aluno3 = new Alunos("Alicia","alicia@gmail.com",18);
        Alunos aluno4 = new Alunos("Palloma","palloma@gmail.com",18);
        Alunos aluno5 = new Alunos("Sidney","sidney@gmail.com",44);
        
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno5);
        
        for(Alunos a: alunos){
            System.out.println(a);
        }
            
   
    }
    
}
