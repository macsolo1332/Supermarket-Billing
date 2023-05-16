/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;

/**
 *
 * @author Akash
 */
public class db {
    Connection con=null;
    PreparedStatement pst;
    public static Connection dbconnect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bms","root","root");
            return conn;
        } catch(Exception e){
            System.out.println(e);
            return null;
            
        }
    }  
    
}
