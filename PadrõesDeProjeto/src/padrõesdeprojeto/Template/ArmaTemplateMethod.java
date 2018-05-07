package padrõesdeprojeto.Template;


public class ArmaTemplateMethod {

  
    public static void main(String[] args) {
      
       CotaCouro a1 = new CotaCouro();
       a1.setNome("Machado");
      
       CotaMalha a2 = new CotaMalha();
       a2.setNome("Besta");
       
       System.out.println(a1.getDadosArma());
       
       System.out.println(a2.getDadosArma());
    }
    
}
