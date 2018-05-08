/*
Padrões de Projeto Presentes no Código.

1- Factory (Sub-Classes de ferreiro são fabricas de objetos)
2- Strategy (Tendo a interface Ferreiro podemos ter sub-classes com comportamentos diferentes. Ausência de IFs)
3- State (O objeto arma altera o seu estado dependendo do parametro passado - que seria o tipo da arma)
4- Memento (Há o memento na funcionalidade de desfazer a ultima compra feita no ferreiro)
5- Facade (Facade realiza a criação dos escudos)
6- Template (Realiza a criação de cotas)
7- Observer (A cada modificação do inventario o personagem é notificado disso)
 */
package padrõesdeprojeto;

import java.util.ArrayList;
import java.util.Scanner;
import padrõesdeprojeto.Facade.EscudoFacade;
import padrõesdeprojeto.Memento.Memento;
import padrõesdeprojeto.Memento.Originator;
import padrõesdeprojeto.Memento.Caretaker;
import padrõesdeprojeto.Observer.Inventario;
import padrõesdeprojeto.Template.CotaAco;
import padrõesdeprojeto.Template.CotaCouro;
import padrõesdeprojeto.Template.CotaMalha;

public class Principal {

    public static void main(String[] args) {

        String entrada = "0";
        Arma arma = null;
        
        Inventario inventario = new Inventario();

        Personagem personagem = new Personagem(inventario);

        Personagem personagemCopia = new Personagem(inventario);

        ArrayList<String> lista = new ArrayList<String>();

        Principal p = new Principal();
        p.MenuPrincipal(personagem.getCarteira());

        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        //Inicializador do facade
        EscudoFacade escudoF = new EscudoFacade();

        while (!entrada.equals("9")) {

            if (!entrada.equals("0")) {
                p.MenuSecundario(personagem.getCarteira());
            }

            // Get estado carteira.
            originator.setState(personagemCopia);
            caretaker.addMemento(originator.save());

            Scanner scanner = new Scanner(System.in);
            entrada = scanner.nextLine();

            if (entrada.equals("1")) {
                Ferreiro ferreiroFerro = new FerreiroFerro();

                arma = ferreiroFerro.fabricar(TipoArma.ESPADA);
                inventario.setItens(arma.toString());
                arma = ferreiroFerro.fabricar(TipoArma.LANCA);
                inventario.setItens(arma.toString());
                arma = ferreiroFerro.fabricar(TipoArma.MACHADO);
                inventario.setItens(arma.toString());

                personagem.setCarteira(personagem.getCarteira() - 30);
                personagemCopia.setCarteira(personagem.getCarteira() + 30);
            }

            if (entrada.equals("2")) {
                Ferreiro ferreiroOuro = new FerreiroOuro();

                arma = ferreiroOuro.fabricar(TipoArma.ESPADA);
                inventario.setItens(arma.toString());
                System.out.println(arma.toString() + " criada.");
                inventario.setItens(arma.toString());
                lista.add(arma.toString());
                System.out.println(arma.toString() + " criada.");
                arma = ferreiroOuro.fabricar(TipoArma.MACHADO);
                lista.add(arma.toString());
                System.out.println(arma.toString() + " criada.");

                personagem.setCarteira(personagem.getCarteira() - 60);
                personagemCopia.setCarteira(personagem.getCarteira() + 60);
            }
            if (entrada.equals("3")) {
                System.out.println("\n1-Pouco Resistente #Custo 30 moedas."
                        + "\n2-Resistência Moderada #Custo 70 moedas."
                        + "\n3-Muito Resistente #Custo 100 moedas."
                        + "\n4-Voltar");
                entrada = scanner.nextLine();

                System.out.println("Você comprou com sucesso um Escudo do tipo ");

                if (entrada.equals("1")) {
                    escudoF.escudoKiteMadeiraBranco();
                    personagem.setCarteira(personagem.getCarteira() - 30);
                    personagemCopia.setCarteira(personagem.getCarteira() + 30);
                } else if (entrada.equals("2")) {
                    escudoF.escudoBucklerBronzePreto();
                    personagem.setCarteira(personagem.getCarteira() - 70);
                    personagemCopia.setCarteira(personagem.getCarteira() + 70);
                } else if (entrada.equals("3")) {
                    escudoF.escudoHeaderAcoOriginal();
                    personagem.setCarteira(personagem.getCarteira() - 100);
                    personagemCopia.setCarteira(personagem.getCarteira() + 100);
                } else {
                    break;
                }

            }
            if (entrada.equals("4")) {
                System.out.println("\n1-Pouco Resistente #Custo 20 moedas."
                        + "\n2-Resistência Moderada #Custo 35 moedas."
                        + "\n3-Muito Resistente #Custo 60 moedas."
                        + "\n4-Voltar");
                entrada = scanner.nextLine();

                System.out.println("Você comprou com sucesso uma ");

                if (entrada.equals("1")) {
                    //Inicializador Template
                    CotaCouro cota = new CotaCouro();
                    System.out.println(cota.getDadosCota());

                    personagem.setCarteira(personagem.getCarteira() - 20);
                    personagemCopia.setCarteira(personagem.getCarteira() + 20);
                } else if (entrada.equals("2")) {
                    //Inicializador Template
                    CotaMalha cota = new CotaMalha();
                    System.out.println(cota.getDadosCota());

                    personagem.setCarteira(personagem.getCarteira() - 35);
                    personagemCopia.setCarteira(personagem.getCarteira() + 35);
                } else if (entrada.equals("3")) {
                    //Inicializador Template
                    CotaAco cota = new CotaAco();
                    System.out.println(cota.getDadosCota());

                    personagem.setCarteira(personagem.getCarteira() - 60);
                    personagemCopia.setCarteira(personagem.getCarteira() + 60);
                } else {
                    break;
                }

            }

            if (entrada.equals("5")) {
                System.out.println("Você tem um " + inventario.getItens().toString());
            }

            if (entrada.equals("8")) {
                // Estado antigo carteira.
                personagem = originator.restore(caretaker.getMemento());
                System.out.println("Saldo atualizado: " + personagem.getCarteira());
                entrada = "9";
            }
        }
    }

    public void MenuPrincipal(float money) {
        System.out.println("\u001B[34m BEM-VINDO AO FERREIRO. O QUE DESEJA?");
        System.out.println("\u001B[33m Saldo:" + money + "moedas.");
        System.out.println("1-Fabricar armas de Ferro.  #Custo 30 moedas.");
        System.out.println("2-Fabricar armas de Ouro.   #Custo 60 moedas");
        System.out.println("3-Fabricar escudo           #Custo 30 à 100 moedas");
        System.out.println("4-Fabricar cota             #Custo 20 à 60 moedas");
        System.out.println("9-Sair.");
    }

    public void MenuSecundario(float money) {
        System.out.println("\n");
        System.out.println("\u001B[34m OTÍMA ESCOLHA!!DESEJA ALGO A MAIS?");
        System.out.println("\u001B[33m Saldo:" + money + "moedas.");
        System.out.println("1-Fabricar armas de Ferro.  #Custo 30 moedas.");
        System.out.println("2-Fabricar armas de Ouro.   #Custo 60 moedas");
        System.out.println("3-Fabricar escudo           #Custo 30 à 100 moedas");
        System.out.println("4-Fabricar cota             #Custo 20 à 60 moedas");
        System.out.println("5-Visualizar seu inventario.");
        System.out.println("8-Desfazer compra anterior e sair.");
        System.out.println("9-Sair.");
    }
}
