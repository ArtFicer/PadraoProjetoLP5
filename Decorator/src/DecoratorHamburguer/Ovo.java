package DecoratorHamburguer;

public class Ovo extends HamburguerDecorator {

    public Ovo(Hamburguer umHamburguer) {
        super(umHamburguer);
        nome = "Ovo";
        preco = 3.0;
    }

}
