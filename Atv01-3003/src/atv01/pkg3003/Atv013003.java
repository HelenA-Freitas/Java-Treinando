/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv01.pkg3003;

/**
 *
 * @author Helen
 */
public class Atv013003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Helen",12345,"helenam@gmail.com");
        Veiculo v1 = new Veiculo("Jeep","Renegade","Branco",650.00);
        Locacao l1 = new Locacao(c1,"30/03/21",7,v1);
        
        l1.dadosLocacao();
        System.out.println("Valor total da locação: R$"+l1.valorLocacao());
    }
    
}
