//observer incluso

package padrõesdeprojeto;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import padrõesdeprojeto.Observer.Inventario;

public class Personagem implements Observer{
    
    private float carteira;
    private Observable inventario;
    private int itemNovo;

    public int getItemNovo() {
        return itemNovo;
    }

    public void setItemNovo(int itemNovo) {
        this.itemNovo = itemNovo;
    }

    public Personagem(Observable inventario) {
        this.carteira = 1000;
        this.inventario = inventario;
        inventario.addObserver((java.util.Observer) this);
    }

    public Observable getInventario() {
        return inventario;
    }

    public void setInventario(Observable inventario) {
        this.inventario = inventario;
    }
    
    public float getCarteira() {
        return carteira;
    }

    public void setCarteira(float carteira) {
        this.carteira = carteira;
    }
    
    @Override
    public void update(Observable inventarioSubject, Object arg1) {
        if (inventarioSubject instanceof Inventario) {
            System.out.println("Inventario atualizado.");
        }
    }
}
