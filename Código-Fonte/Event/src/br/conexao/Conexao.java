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

    public void inserirTarefa(String instrucao) throws SQLException {

        Statement stmt;
        String insert;
        String string = "jdbc:jtds:sqlserver://localhost:1433/Event;instance=SQLEXPRESS;user=sa;password=daniele534126";
        Connection con;


        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            e.getMessage();
        }

        con = DriverManager.getConnection(string);

        stmt = con.createStatement();
        stmt.execute(instrucao);
        stmt.close();
        con.close();

    }
}
