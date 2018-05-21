package padrõesdeprojeto.ChainOfResponsability;

public class ArmaduraCabeca extends Armadura {

    public ArmaduraCabeca(Armadura superior) {
        listaMaterial.add(RolMaterial.getInstance().getTipoMaterialOuro());
        setArmaduraInicial(superior);
    }

    public String getDescricaoItem() {
        return "Capacete de Ouro";
    }

}
