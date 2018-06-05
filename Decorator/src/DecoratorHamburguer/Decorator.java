//O padrão Decorator é utilizado quando precisa-se anexar responsabilidades dinamicamente 
//sem precisar de uma grande hierarquia de subclasses.
package DecoratorHamburguer;

public class Decorator {

    public static void main(String[] args) {
        Hamburguer meuHamburguer = new CheeseBacon();
        System.out.println(meuHamburguer.getNome()+ " = "
                + meuHamburguer.getPreco());
        meuHamburguer = new Bacon(meuHamburguer);
        System.out.println(meuHamburguer.getNome()+ " = "
                + meuHamburguer.getPreco());
        meuHamburguer = new Ovo(meuHamburguer);
        System.out.println(meuHamburguer.getNome()+ " = "
                + meuHamburguer.getPreco());
        meuHamburguer = new Queijo(meuHamburguer);
        System.out.println(meuHamburguer.getNome()+ " = "
                + meuHamburguer.getPreco());
        
        
    }

}
