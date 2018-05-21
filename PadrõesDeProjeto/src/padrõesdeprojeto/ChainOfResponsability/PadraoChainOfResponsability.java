package padrõesdeprojeto.ChainOfResponsability;

import java.awt.BorderLayout;

public class PadraoChainOfResponsability {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArmaduraCabeca cabeca = new ArmaduraCabeca(null);
        ArmaduraPernas pernas = new ArmaduraPernas(cabeca);
        ArmaduraPeito peito = new ArmaduraPeito(pernas);
        ArmaduraPe pe = new ArmaduraPe(peito);
        
        System.out.println(pe.confirmarArmadura(new Material(RolMaterial.getInstance().getTipoMaterialAco())));
        System.out.println(pe.confirmarArmadura(new Material(RolMaterial.getInstance().getTipoMaterialBronze())));
        System.out.println(pe.confirmarArmadura(new Material(RolMaterial.getInstance().getTipoMaterialMadeira())));
        System.out.println(pe.confirmarArmadura(new Material(RolMaterial.getInstance().getTipoMaterialOuro())));
        System.out.println(pe.confirmarArmadura(new Material(RolMaterial.getInstance().getTipoMaterialPrata())));
        
    }
    
}
