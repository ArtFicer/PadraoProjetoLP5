
package decorator;


public class Ovo extends HamburguerDecorator {

	public Ovo(Hamburguer hamburguer) {
		super(hamburguer);
		nome = "Ovo";
		preco = 2.5;
	}

}