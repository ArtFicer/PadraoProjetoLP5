//Classe Factory. Fabrica de Objetos.
package padrõesdeprojeto;

public class FerreiroFerro implements Ferreiro{

    public Arma fabricar(TipoArma tipoArma) {
        return new ArmaFerro(tipoArma);
    }
}
