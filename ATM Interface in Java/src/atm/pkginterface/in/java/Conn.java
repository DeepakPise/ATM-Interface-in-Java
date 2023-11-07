
package atm.pkginterface.in.java;

import java.sql.*;

// This is connnection class to connect with database
//steps
//Register the Driver
//Create Connection
//Create Statement
//Execute Query
//Closed Connection
public class Conn {  
    
    Connection c;
    Statement s;
    public Conn(){
        try{
            // Register the Driver :- Java doing automatically using classpath;
            c=DriverManager.getConnection("jdbc:mysql:///atminterface","root","1947");  //Create Connection
            s= c.createStatement(); //Create Statement
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
