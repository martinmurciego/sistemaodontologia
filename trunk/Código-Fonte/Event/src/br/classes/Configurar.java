/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.classes;

/**
 *
 * @author william
 */
public class Configurar {
    private String maquina;
    private String instancia;
    private String usuario;
    private String senha;
    private int tempoEspera;

    public String getInstancia() {
        return instancia;
    }

    public void setInstancia(String instancia) {
        this.instancia = instancia;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }

    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void recuperandoDadosBanco(){

    }


}
