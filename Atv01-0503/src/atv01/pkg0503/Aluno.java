/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv01.pkg0503;

/**
 *
 * @author Helen
 */
public class Aluno {
    String nome;
    int matricula;
    double nota1, nota2, media;
    
    void calcularmedia(Aluno x){
    x.media=(x.nota1+x.nota2)/2;
}
    double maiornota(double x, double y){
        double z;
        if(x>y){
            z=y;
        }else{
            z=y;
        }
        return z;
    }
    Aluno maiormedia(Aluno x, Aluno y){
        Aluno z;
        if(x.media>y.media){
            z=x;
        }else{
            z=y;
        }
        return z;
    }
        String maiormedia2(Aluno x, Aluno y){
        String z;
        if(x.media>y.media){
            z=x.nome;
        }else{
            z=y.nome;
        }
        return z;
    }
    
}
