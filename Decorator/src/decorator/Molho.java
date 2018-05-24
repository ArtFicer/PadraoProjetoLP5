
package decorator;


public class Molho extends HamburguerDecorator {

	public Molho(Hamburguer hamburguer) {
		super(hamburguer);
		nome = "Molho";
		preco = 1.0;
	}

}