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
public class MedicoCirurgiao extends Medico {
    
    public MedicoCirurgiao(String crm, String nome, int idade, double salario) {
        super(crm, nome, idade, salario);
    }
    
    @Override
    public void medicoAposentado(){
        if(this.getIdade()>=50){
            System.out.println("Médico aposentado!");
        }else{
            System.out.println("Médico não aposentado!");
        }
    }
    
    @Override
    public void medicoAposentadoria(){
        double aposentadoria;
        aposentadoria = (this.getSalario()*80/100)+800;
        System.out.println("Valor da aposentadoria: R$"+aposentadoria);
    }
    
}
