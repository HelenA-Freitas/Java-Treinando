/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvconsulta.pkg0904;

/**
 *
 * @author Helen
 */
public class Consulta {
    public Cliente cliente;
    public Exame exame;
    public Medico medico;

    public Consulta(Cliente cliente, Exame exame, Medico medico) {
        this.cliente = cliente;
        this.exame = exame;
        this.medico = medico;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Exame getExame() {
        return exame;
    }
    public void setExame(Exame exame) {
        this.exame = exame;
    }

    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    
}


