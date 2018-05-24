
package decorator;


public class Molho extends CoquetelDecorator {

	public Molho(Coquetel umCoquetel) {
		super(umCoquetel);
		nome = "Refrigerante";
		preco = 1.0;
	}

}