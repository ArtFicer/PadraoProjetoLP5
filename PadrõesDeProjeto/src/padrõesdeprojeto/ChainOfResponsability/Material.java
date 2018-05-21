package padrõesdeprojeto.ChainOfResponsability;

public class Material {
    private TipoMaterial tipoMaterial;
    
    
    public Material(TipoMaterial tipoMaterial){
    this.tipoMaterial = tipoMaterial;
    }

    public TipoMaterial getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoDocumento(TipoMaterial tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }
    
}




