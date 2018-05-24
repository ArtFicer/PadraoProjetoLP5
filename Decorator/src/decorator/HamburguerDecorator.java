package decorator;

public abstract class HamburguerDecorator extends Hamburguer {

    Hamburguer pacoteViagem;

    public HamburguerDecorator(Hamburguer hamburguer) {
        this.pacoteViagem = hamburguer;
    }

    @Override
    public String getDuracao() {
        return descricao;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
