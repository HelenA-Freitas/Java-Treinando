/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv01.pkg0203;

/**
 *
 * @author Helen
 */
public class Pessoa {
    
    String nome;
    int idade;
    
    
    String maisvelha( Pessoa x, Pessoa y){
        String z;
        
        if(x.idade>y.idade){
            z = x.nome;
        } else {
            z = y.nome;
        }
        return z;
    }
    }
