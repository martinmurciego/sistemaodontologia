/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.classes;

import java.sql.SQLException;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author william
 */
public class Tarefa {
    private String tarefa;
    private String dia;
    private String horario;
    private String observacao;
    private String status;

    public Tarefa(){
    }

    public String getData() {
        return dia;
    }

    public void setData(String data) {
        this.dia = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public boolean inserindoTarefa(String tarefa, String dia, String horario, String observacao, String status){
         String insert = "INSERT INTO TAREFA VALUES ('" + tarefa +"','" + dia + "','" + horario + "','"
                + observacao + "','" + status + "')";

        br.conexao.Conexao conexao = new br.conexao.Conexao();

        try {
            conexao.inserirTarefa(insert);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Tarefa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
