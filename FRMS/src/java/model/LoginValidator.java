/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DbConnect;

/**
 *
 * @author Lahiru Chandima
 */
public class LoginValidator {
    
    PreparedStatement ps , ps1;
    public ResultSet rs;
    
    public static String userAccountType ;
    public static String sessionID ;
    
    
    public boolean lgValidator(String uname , String password){
        String sql = "select * from jmo where username = ? and password = ?";
    
    DbConnect conn = new DbConnect();
    
    
        try {
            ps = DbConnect.dbConnect().prepareStatement(sql);
            ps.setString(1, uname);
            ps.setString(2, password);
            
            rs = ps.executeQuery();
            
            if(rs.next() == true){
                
                userAccountType = rs.getString("accountType");
                return true;
            }
            
            sql = "select * from policeofficer where username = ? and password = ?";  
            
            ps = DbConnect.dbConnect().prepareStatement(sql);
            ps.setString(1, uname);
            ps.setString(2, password);
            
            rs = ps.executeQuery();
            if(rs.next() == true){
                
                userAccountType = rs.getString("accountType");
                return true;
            }
                
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
        
    

}
