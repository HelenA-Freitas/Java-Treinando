/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvcaderneta.pkg1304;

/**
 *
 * @author Helen
 */
public class AtvCaderneta1304 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Alunos a1 = new Alunos("Helen", 1284302,"helen@gmail.com");
       Turmas t1 = new Turmas("Desenvolvimento de Software","Vespertino",334455);
       Disciplinas d1 = new Disciplinas("DS","320H",10,9.5,9);
       
       Caderneta c1 = new Caderneta(a1,t1,d1);
       
        System.out.println("Aluno: "+c1.getAluno().getNome()+" - Matrícula: "+c1.getAluno().getMatricula());
        System.out.println("Curso: "+c1.getTurma().getCurso());
        System.out.println("Disciplina: "+c1.getDisciplina().getNome()+" - Média: "+c1.mediaFinal());
 
        
    }
    
}
