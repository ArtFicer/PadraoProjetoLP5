/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrõesdeprojeto.Facade;

/**
 *
 * @author pe-ri
 */
public class EscudoFacade {
      private EscudoTipo escudoTipo;
      private EscudoMaterial escudoMaterial;
      private EscudoCor escudoCor;
   
      public EscudoFacade() {
          this.escudoTipo = new EscudoTipo();
          this.escudoMaterial = new EscudoMaterial();
          this.escudoCor = new EscudoCor();
      }
   
      public void escudoKiteMadeiraBranco() {
          escudoTipo.escudoTipoKite();
          escudoMaterial.escudoMaterialMadeira();
          escudoCor.escudoCorBranco();
          
      }
}
