/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Rushika
 */
public class DBconnection {
    
    public static Connection myConnection(){
        Connection connection = null;
        
        try {           
            connection = DriverManager.getConnection("jdbc:mysql://"
                    + "localhost:3306/employeedb","root","");
        }   
        catch (SQLException e) {
            e.printStackTrace();
        }
        
        return connection;
    }   
}


