
package decorator;


public class Queijo extends HamburguerDecorator {

	public Queijo(Hamburguer hamburguer) {
		super(hamburguer);
		nome = "Queijo";
		preco = 2.0;
	}

}