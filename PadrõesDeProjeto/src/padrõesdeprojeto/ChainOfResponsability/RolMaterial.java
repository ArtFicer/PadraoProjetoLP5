package padrõesdeprojeto.ChainOfResponsability;

public class RolMaterial {
    private static RolMaterial rolMaterial = new RolMaterial();
    private TipoMaterialAco tipoMaterialAco;
    private TipoMaterialBronze tipoMaterialBronze;
    private TipoMaterialMadeira tipoMaterialMadeira;
    private TipoMaterialOuro tipoMaterialOuro;
    private TipoMaterialPrata tipoMaterialPrata;
    
    private RolMaterial(){
        tipoMaterialAco = new TipoMaterialAco();
        tipoMaterialBronze = new TipoMaterialBronze();
        tipoMaterialMadeira = new TipoMaterialMadeira();
        tipoMaterialOuro = new TipoMaterialOuro();
        tipoMaterialPrata = new TipoMaterialPrata();
    }
    
    public static RolMaterial getInstance(){
        return rolMaterial;
    }

    public static RolMaterial getRolMaterial() {
        return rolMaterial;
    }

    public static void setRolMaterial(RolMaterial rolMaterial) {
        RolMaterial.rolMaterial = rolMaterial;
    }

    public TipoMaterialAco getTipoMaterialAco() {
        return tipoMaterialAco;
    }

    public void setTipoMaterialAco(TipoMaterialAco tipoMaterialAco) {
        this.tipoMaterialAco = tipoMaterialAco;
    }

    public TipoMaterialBronze getTipoMaterialBronze() {
        return tipoMaterialBronze;
    }

    public void setTipoMaterialBronze(TipoMaterialBronze tipoMaterialBronze) {
        this.tipoMaterialBronze = tipoMaterialBronze;
    }

    public TipoMaterialMadeira getTipoMaterialMadeira() {
        return tipoMaterialMadeira;
    }

    public void setTipoMaterialMadeira(TipoMaterialMadeira tipoMaterialMadeira) {
        this.tipoMaterialMadeira = tipoMaterialMadeira;
    }

    public TipoMaterialOuro getTipoMaterialOuro() {
        return tipoMaterialOuro;
    }

    public void setTipoMaterialOuro(TipoMaterialOuro tipoMaterialOuro) {
        this.tipoMaterialOuro = tipoMaterialOuro;
    }

    public TipoMaterialPrata getTipoMaterialPrata() {
        return tipoMaterialPrata;
    }

    public void setTipoMaterialPrata(TipoMaterialPrata tipoMaterialPrata) {
        this.tipoMaterialPrata = tipoMaterialPrata;
    }    
}