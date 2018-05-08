package padrõesdeprojeto.Observer;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import padrõesdeprojeto.Arma;
import padrõesdeprojeto.Facade.EscudoFacade;
import padrõesdeprojeto.Template.CotaTemplate;

public class Inventario extends Observable {

    private String itens;
    private int versao;

    public int getVersao() {
        return versao;
    }

    public void setVersao(int versao) {
        this.versao = versao;
    }

    public String getItens() {
        return itens;
    }

    public void setItens(String itens) {
        this.itens = itens;
        setChanged();
        notifyObservers();
    }
}
