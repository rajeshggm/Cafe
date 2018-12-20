package Cafee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rajesh
 */

import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class connect {
    
    private Connection con;
    public Connection getConnection() throws ClassNotFoundException, SQLException
    {
        Class.forName("org.postgresql.Driver");
        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cafe","postgres","root");
        return con;
    }
    
}
