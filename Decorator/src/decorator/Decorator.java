//O padrão Decorator é utilizado quando precisa-se anexar responsabilidades dinamicamente 
//sem precisar de uma grande hierarquia de subclasses.

package decorator;

public class Decorator {

    public static void main(String[] args) {
		Coquetel meuCoquetel = new Cachaca();
		System.out.println(meuCoquetel.getNome() + " = "
				+ meuCoquetel.getPreco());

		meuCoquetel = new Refrigerante(meuCoquetel);
		System.out.println(meuCoquetel.getNome() + " = "
				+ meuCoquetel.getPreco());
	}

}
