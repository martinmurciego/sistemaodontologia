/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author william
 */
public class Conexao {

    public void inserirTarefa() throws SQLException {

        Statement stmt;
        String string = "jdbc:jtds:sqlserver://localhost:1433/Event;instance=SQLEXPRESS;namedpipe=true";
        Connection con;


        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            e.getMessage();
        }

        con = DriverManager.getConnection(string);

        stmt = con.createStatement();
//        stmt.execute(instrucao);
        stmt.close();
        con.close();

    }

    public String inserindoConfiguracao(String maquina,String instancia,String usuario,String senha){

        String retorno = "";

        String buscandoInformacao = "SELECT ";

        return "";
    }

    public boolean testarConexao(String maquina,String instancia,String usuario,String senha) throws SQLException{

        Connection conectar;
        String string = "jdbc:jtds:sqlserver://" + maquina + ":1433/Event;instance=" + instancia + ";user=" + usuario + ";password=" + senha;

        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            e.getMessage();
        }

        try{
            conectar = DriverManager.getConnection(string);
            return true;
        }catch(SQLException e){
            e.getMessage();
        }

        return false;

    }
}
