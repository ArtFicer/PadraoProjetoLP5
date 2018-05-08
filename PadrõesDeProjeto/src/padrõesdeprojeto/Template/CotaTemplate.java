package padrõesdeprojeto.Template;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public abstract class CotaTemplate {

    public abstract String getTipo();

    public String getDadosCota() {

        return "Cota" + getTipo();// + getInstituicaoOrigem();
    }

}
