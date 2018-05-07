package padrõesdeprojeto.Template;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public abstract class CotaTemplate {

    private String nome;

    public abstract String getTipo();

    public String getDadosCota() {

        return "Cota: " + getNome() + " - Tipo: " + getTipo();// + getInstituicaoOrigem();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
