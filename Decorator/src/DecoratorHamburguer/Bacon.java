
package DecoratorHamburguer;


public class Bacon extends HamburguerDecorator {

	public Bacon(Hamburguer umHamburguer) {
        super(umHamburguer);
		nome = "Bacon";
		preco = 3.5;
	}

}