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
public class Turmas {
    String curso;
    String turno;
    int codigo;

    public Turmas(String curso, String turno, int codigo) {
        this.curso = curso;
        this.turno = turno;
        this.codigo = codigo;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
}
