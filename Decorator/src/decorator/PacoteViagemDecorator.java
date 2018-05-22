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
public abstract class PacoteViagemDecorator extends PacoteViagem{
    
    PacoteViagem pacoteViagem;
    
    public PacoteViagemDecorator(PacoteViagem pacoteViagem){
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
