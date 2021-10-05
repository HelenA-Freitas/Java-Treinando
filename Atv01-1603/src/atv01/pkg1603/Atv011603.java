/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv01.pkg1603;

/**
 *
 * @author Helen
 */
public class Atv011603 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locar l1 = new Locar("Helen", "17/03/21", 15, "Jeep", 300.00);
        
        System.out.println("Cliente: "+l1.getCliente()+" - Data: "+l1.getData()+" - Modelo: "+l1.getModelo());
        System.out.println("\nCliente: "+l1.getCliente()+" - Modelo: "+l1.getModelo()+" - Valor total da locação: "+l1.vtotal());
        
    }
    
}
