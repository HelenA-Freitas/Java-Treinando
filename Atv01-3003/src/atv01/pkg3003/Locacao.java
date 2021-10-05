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
public class Locacao {
    Cliente cliente;
    String data;
    int dias;
    Veiculo veiculo;
    
    public void dadosLocacao(){
        System.out.println("Cliente: "+this.getCliente().getNome());
        System.out.println("Data: "+this.getData());
        System.out.println("Modelo do carro: "+this.getVeiculo().getModelo());
        System.out.println("Cor: "+this.getVeiculo().getCor());
    }
    
    public double valorLocacao(){
        return this.getDias()*this.getVeiculo().getValordiaria();
    }

    public Locacao(Cliente cliente, String data, int dias, Veiculo veiculo) {
        this.cliente = cliente;
        this.data = data;
        this.dias = dias;
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public int getDias() {
        return dias;
    }
    public void setDias(int dias) {
        this.dias = dias;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    
    
}
