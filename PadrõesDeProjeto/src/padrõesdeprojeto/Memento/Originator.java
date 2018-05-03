package padrõesdeprojeto.Memento;

import padrõesdeprojeto.Personagem;

public class Originator {
    
    private Personagem personagem;
  
    public void setState(Personagem personagem) {
        this.personagem = personagem;
    }

    public Memento save() {
        return new Memento(personagem);
    }
    public Personagem restore(Memento m) {
        return personagem = m.getState();
    }
}
