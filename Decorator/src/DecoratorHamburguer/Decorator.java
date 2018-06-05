//O padrão Decorator é utilizado quando precisa-se anexar responsabilidades dinamicamente 
//sem precisar de uma grande hierarquia de subclasses.
package DecoratorHamburguer;

public class Decorator {

    public static void main(String[] args) {
        Hamburguer CBacon = new CheeseBacon();
        System.out.println(CBacon.getNome() + " = "
                + CBacon.getPreco());
        CBacon = new Bacon(CBacon);
        System.out.println(CBacon.getNome() + " = "
                + CBacon.getPreco());
        CBacon = new Ovo(CBacon);
        System.out.println(CBacon.getNome() + " = "
                + CBacon.getPreco());
        CBacon = new Queijo(CBacon);
        System.out.println(CBacon.getNome() + " = "
                + CBacon.getPreco());

        System.out.println("\n");

        Hamburguer CBurguer = new CheeseBurguer();
        System.out.println(CBurguer.getNome() + " = "
                + CBurguer.getPreco());
        CBurguer = new Bacon(CBurguer);
        System.out.println(CBurguer.getNome() + " = "
                + CBurguer.getPreco());
        CBurguer = new Ovo(CBurguer);
        System.out.println(CBurguer.getNome() + " = "
                + CBurguer.getPreco());
        CBurguer = new Queijo(CBurguer);
        System.out.println(CBurguer.getNome() + " = "
                + CBurguer.getPreco());

        System.out.println("\n");

        Hamburguer CEgg = new CheeseEgg();
        System.out.println(CEgg.getNome() + " = "
                + CEgg.getPreco());
        CEgg = new Bacon(CEgg);
        System.out.println(CEgg.getNome() + " = "
                + CEgg.getPreco());
        CEgg = new Ovo(CEgg);
        System.out.println(CEgg.getNome() + " = "
                + CEgg.getPreco());
        CEgg = new Queijo(CEgg);
        System.out.println(CEgg.getNome() + " = "
                + CEgg.getPreco());
    }

}
