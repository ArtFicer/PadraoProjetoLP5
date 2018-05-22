
package decorator;

public abstract class PacoteViagem {

    String nome;
    double preco, duracao;

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
