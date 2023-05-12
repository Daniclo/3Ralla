package com.tresenralla;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearBDRecords {
    public static void main(String[] args) {
        Connection con = null;
        try {
            String url = "jdbc:mysql://localhost:3306";
            String user = "root";
            String passwd = "daniel";
            con = DriverManager.getConnection(url, user, passwd);
            Statement s = con.createStatement();

            s.executeUpdate("delete database Records");
            s.executeUpdate("create database Records");
            s.executeUpdate("use Records");
            s.executeUpdate("create table Record(" +
                    "nombre varchar(35) not null primary key," +
                    "victorias int" +
                    ")");
            s.close();
            con.close();
        } catch (SQLException e) {
            System.out.println((e.getMessage()));
        }
    }
}