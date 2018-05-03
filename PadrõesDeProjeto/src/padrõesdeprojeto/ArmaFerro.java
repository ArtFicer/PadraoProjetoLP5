package padrõesdeprojeto;

public class ArmaFerro implements Arma {

    private TipoArma tipoArma;

    public ArmaFerro(TipoArma tipoArma) {
        this.tipoArma = tipoArma;
    }

    @Override
    public String toString() {
        return tipoArma + " De Ferro";
    }

    @Override
    public TipoArma getTipoArma() {
        return tipoArma;
    }

}
