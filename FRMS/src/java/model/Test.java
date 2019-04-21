/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author TOSHIBA
 */
public class Test {
    
    public static void main(String[] args) throws SQLException {
//         Vector<String> myVector = new Vector<String>();
//         myVector.add("Lahiru");
//         myVector.add("Chandima");
//         
//         for(int i = 0 ; i < myVector.size() ; i++){
//             System.out.println(myVector.get(i));
//         }

   Connection  connection = DbConnect.dbConnect();
   Statement statement;
                                    statement = connection.createStatement();
                                    String sql = "SELECT bodyHarmType FROM mlefbodyharm WHERE mlefid='8'";
                                    ResultSet resultSet;
                                    resultSet = statement.executeQuery(sql);
                                    String s = "1";
                                    while (resultSet.next()) { 
                                        resultSet.getString(1);
                                    }
                                        
    }
            
}
