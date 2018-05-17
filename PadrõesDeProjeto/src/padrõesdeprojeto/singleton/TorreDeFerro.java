//Garante que apenas um objeto seja criado
package padrõesdeprojeto.singleton;

public class TorreDeFerro {
    
    private static TorreDeFerro instancia = null;
    
    private TorreDeFerro(){
        
    }
    
    public static TorreDeFerro getInstancia(){
        if(instancia == null){
            System.out.println("Torre de Ferro Criada! ");
            instancia = new TorreDeFerro();            
        }
        return instancia;
    }    
}
