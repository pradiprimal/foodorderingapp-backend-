package com.foodorderingapp.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection(){

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/foodorderingappdb","root","");
            return con;

        }catch(Exception e){

            e.printStackTrace();
        }
        return null;
    }
}
