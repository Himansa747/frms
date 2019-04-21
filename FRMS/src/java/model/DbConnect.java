/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author TOSHIBA
 */
public class DbConnect {
    
     private static Connection conn;

    public static Connection dbConnect() {

        try {System.out.println("Successfully Connected11");
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/frms", "root", "");
            System.out.println("Successfully Connected");
            
            return conn;
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    
  
    
}
