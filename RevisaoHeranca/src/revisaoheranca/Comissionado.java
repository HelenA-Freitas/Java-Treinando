/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaoheranca;


public class Comissionado extends Empregado {
    private double totalVenda;
    private double taxaComissao;

    public Comissionado(double totalVenda, double taxaComissao, String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
        this.totalVenda = totalVenda;
        this.taxaComissao = taxaComissao;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }
    
    @Override
    public void vencimento() {
        super.vencimento(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
