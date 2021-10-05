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
public class Capa {
    String cor;
    String material;
    double preço;

    public Capa(String cor, String material, double preço) {
        this.cor = cor;
        this.material = material;
        this.preço = preço;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPreço() {
        return preço;
    }
    public void setPreço(double preço) {
        this.preço = preço;
    }
    
}
