
package decorator;


public class Bacon extends CoquetelDecorator {

	public Bacon(Coquetel umCoquetel) {
		super(umCoquetel);
		nome = "Refrigerante";
		preco = 1.0;
	}

}