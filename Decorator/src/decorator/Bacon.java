
package decorator;


public class Bacon extends HamburguerDecorator {

	public Bacon(Hamburguer umHamburguer) {
		super(umHamburguer);
		nome = "Bacon";
		preco = 2.0;
	}

}