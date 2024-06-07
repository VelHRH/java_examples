package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
    public static void main( String[] args ) throws SQLException, ClassNotFoundException
    {
        Class.forName("org.postgresql.Driver"); // optional

        String url = "jdbc:postgresql://localhost:5432/experiment";
        String user = "postgres";
        String password = "0000";
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("Connection established");
        
        Statement st = con.createStatement();

        String getAll = "SELECT * from student";
        ResultSet rs = st.executeQuery(getAll);
        
        while (rs.next()) {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getInt("marks"));
        }

        String addOne = "INSERT INTO student VALUES (?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(addOne);
        pst.setInt(1, 6);
        pst.setString(2, "Yuzuki");
        pst.setInt(3, 92);
        pst.execute();
         
        con.close();    
        System.out.println("Connection closed");
    }
}
