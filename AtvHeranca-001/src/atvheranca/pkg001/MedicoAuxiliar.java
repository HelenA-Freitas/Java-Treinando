/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvheranca.pkg001;

/**
 *
 * @author Helen
 */
public class MedicoAuxiliar extends Medico{
    
    public MedicoAuxiliar(String crm, String nome, int idade, double salario) {
        super(crm, nome, idade, salario);
    }
    
    @Override
    public void medicoAposentado(){
        if(this.getIdade()>=60){
            System.out.println("Médico aposentado!");
        }else{
            System.out.println("Médico não aposentado!");
        }
    
    }
    
}
