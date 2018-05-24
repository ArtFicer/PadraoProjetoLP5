/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Aluno
 */
public abstract class HamburguerDecorator extends Hamburguer{
    
    Hamburguer pacoteViagem;
    
    public HamburguerDecorator(Hamburguer pacoteViagem){
       this.pacoteViagem=pacoteViagem; 
    }
    
    @Override
    public double getDuracao() {
        return duracao;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
