package padrõesdeprojeto.ChainOfResponsability;

public class ArmaduraPernas extends Armadura{
        public ArmaduraPernas(Armadura superior){
        listaMaterial.add(RolMaterial.getInstance().getTipoMaterialAco());
        setArmaduraInicial(superior);
    }
    
    public String getDescricaoItem(){
        return "Calças de Aco";
    }
}
