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
public class Caderneta {
    Alunos aluno;
    Turmas turma;
    Disciplinas disciplina;

    public Caderneta(Alunos aluno, Turmas turma, Disciplinas disciplina) {
        this.aluno = aluno;
        this.turma = turma;
        this.disciplina = disciplina;
    }

    public Alunos getAluno() {
        return aluno;
    }
    public void setAluno(Alunos aluno) {
        this.aluno = aluno;
    }

    public Turmas getTurma() {
        return turma;
    }
    public void setTurma(Turmas turma) {
        this.turma = turma;
    }

    public Disciplinas getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplinas disciplina) {
        this.disciplina = disciplina;
    }
    
    public double mediaFinal(){
        return (this.getDisciplina().getNota1()+this.getDisciplina().getNota2()+
                this.getDisciplina().getNota3())/3;
    }
    
    
    
}
