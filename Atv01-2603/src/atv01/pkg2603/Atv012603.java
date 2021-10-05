/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv01.pkg2603;

/**
 *
 * @author Helen
 */
public class Atv012603 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Capa ca1=new Capa("Transparente", "Silicone", 65.00);
       Celular c1=new Celular("Samsung", "Preto", "S9", 2500.00, ca1);
       
        System.out.println("O valor total do celular "+c1.getMarca());
        System.out.println("com a capa "+c1.getCapa().cor+" de "+c1.getCapa().getMaterial());
        System.out.println("ficou de: R$"+c1.precoTotal());
    }
    
}
