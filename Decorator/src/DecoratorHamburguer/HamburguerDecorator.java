package DecoratorHamburguer;

public abstract class HamburguerDecorator extends Hamburguer {

    Hamburguer hburguer;

    public HamburguerDecorator(Hamburguer hamburguer) {
        this.hburguer = hamburguer;
    }

    public String getNome() {
        return hburguer.getNome() + " + " + nome;
    }

    public double getPreco() {
        return hburguer.getPreco() + preco;
    }
}
