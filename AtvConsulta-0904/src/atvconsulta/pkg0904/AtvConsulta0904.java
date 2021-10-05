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
public class AtvConsulta0904 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Helen","Freitas",12345,17,"F");
        Cliente c2 = new Cliente("Lucas","Jesus",60789,18,"M");
        
        Exame e1 = new Exame("Raio-x", 001);
        Exame e2 = new Exame("Mamografia", 002);
        Exame e3 = new Exame("Ultrassonografia", 003);
        Exame e4 = new Exame("Ressonância", 004);
 
        Medico m1 = new Medico("Fabiana", 45698,"docfabi@gmail.com");
        Medico m2 = new Medico("Luis", 284756, "docluis@gmail.com");
        
        Consulta con1 = new Consulta(c1,e2,m1);
        Consulta con2 = new Consulta(c2,e4,m2);
        
        System.out.println("Cliente: "+con1.getCliente().getNome()+" - "+con1.getExame().getNome()+" - "+con1.getMedico().getNome());
        System.out.println("Cliente: "+con2.getCliente().getNome()+" - "+con2.getExame().getNome()+" - "+con2.getMedico().getNome());
       
    }
    
}
