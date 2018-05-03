package padrõesdeprojeto;

public class ArmaOuro implements Arma {
    
    private TipoArma tipoArma;

    public ArmaOuro(TipoArma tipoArma) {
        this.tipoArma = tipoArma;
    }

    @Override
    public String toString() {
        return tipoArma + " De Ouro";
    }

    @Override
    public TipoArma getTipoArma() {
        return tipoArma;
    }
}
