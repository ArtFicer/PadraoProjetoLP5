package padrõesdeprojeto.ChainOfResponsability;

public class ArmaduraPeito extends Armadura{
    public ArmaduraPeito(Armadura superior){
        listaMaterial.add(RolMaterial.getInstance().getTipoMaterialBronze());
    }
    
    public String getDescricaoItem(){
        return "Peitoral de Bronze";
    }
}
