
package decorator;


public class Queijo extends CoquetelDecorator {

	public Queijo(Coquetel umCoquetel) {
		super(umCoquetel);
		nome = "Refrigerante";
		preco = 1.0;
	}

}