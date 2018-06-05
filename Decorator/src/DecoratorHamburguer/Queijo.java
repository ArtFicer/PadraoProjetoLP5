package DecoratorHamburguer;

public class Queijo extends HamburguerDecorator {

    public Queijo(Hamburguer umHamburguer) {
        super(umHamburguer);
        nome = "Queijo";
        preco = 2.0;
    }

}
