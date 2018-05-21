package padrõesdeprojeto.ChainOfResponsability;

public class ArmaduraPe extends Armadura{

    public ArmaduraPe(Armadura superior) {
        listaMaterial.add(RolMaterial.getInstance().getTipoMaterialMadeira());
        setArmaduraInicial(superior);
    }

    public String getDescricaoItem() {
        return "Coturno de Madeira";
    }
}
