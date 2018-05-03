package padrõesdeprojeto.Memento;

import padrõesdeprojeto.Personagem;

public class Memento {
    
    private Personagem personagem;

    public Memento(Personagem personagem) {
        this.personagem = personagem;
    }

    public Personagem getState() {
        return personagem;
    }
}
