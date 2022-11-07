
import java.sql.*;


public class DB {
    
     static Connection conn;
  
     
  public static Connection dbconnect(){
    
    try{
        //load the driver
        Class.forName("com.mysql.jdbc.Driver");
        
        //Creat a connection
        String url="jdbc:mysql://localhost:3306/connect";
        String user="root";
        String password="admin";
        conn=DriverManager.getConnection(url,user,password);
     }
    catch(Exception e){
        e.printStackTrace();
       
    }
return conn;
  }
}