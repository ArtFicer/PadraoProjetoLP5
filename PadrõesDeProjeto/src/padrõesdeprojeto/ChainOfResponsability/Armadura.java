package padrõesdeprojeto.ChainOfResponsability;
import java.util.ArrayList;

public abstract class Armadura {
    protected ArrayList listaMaterial = new ArrayList();
    private Armadura armaduraInicial;

    public Armadura getFuncionarioSuperior() {
        return armaduraInicial;
    }

    public void setArmaduraInicial(Armadura armaduraInicial) {
        this.armaduraInicial = armaduraInicial;
    }
    
    public abstract String getDescricaoItem();
    
    public String confirmarArmadura(Material materia){
        if(listaMaterial.contains(materia.getTipoMaterial())){
            return getDescricaoItem();
        }
        else {
            if(armaduraInicial != null){
                return armaduraInicial.confirmarArmadura(materia);
            }
            else {
                return "Item não comprado";
            }
        }
    }
    
}
