/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * 
 */
public class JOptionpane {
    public static Connection getCon(){
        try{ Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Jobportal?useSSL=false","root","admin");
        return con;
    }
        catch(Exception e){
            return null;
        }
    }
}
