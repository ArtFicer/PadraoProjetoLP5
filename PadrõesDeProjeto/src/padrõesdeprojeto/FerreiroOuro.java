//Classe Factory. Fabrica de Objetos.
package padrõesdeprojeto;

public class FerreiroOuro implements Ferreiro{
    
    public Arma fabricar(TipoArma tipoArma) {
        return new ArmaOuro(tipoArma);
    }
}
