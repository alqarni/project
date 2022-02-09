/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
     public Connection connection=null;
     public Connection getconConnection(){
        System.out.print("mysql Connection Testing\n");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost/surgical?UseUnicode=yes&characterEncoding=UTF-8","root","");
            System.out.println("Driver Registered\n");
            if (connection !=null){
               System.out.println("You Made It");}
            else{
               System.out.println("Failed");}
                }
        catch(ClassNotFoundException ex){
                System.out.println("Where is MySql Driver");
                ex.printStackTrace();
            }
        catch(SQLException e)
            {
            System.out.println("Connection Field");
            e.printStackTrace();
            }
        return connection;
     }
}

 

