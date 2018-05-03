package padrõesdeprojeto;

public enum TipoArma {

    ESPADA("Espada"), LANCA("Lança"), MACHADO("Machado"), UNDEFINED("");

    private String nome;

    TipoArma(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
