/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author TOSHIBA
 */
public class DeleteJMO {
    static PreparedStatement ps;

    public static void removeJMO(
            String username,
            String email,
            String NIC,
            String Doctor_ID
    ) throws SQLException{
    String sql = "DELETE FROM jmo WHERE NIC='NIC'";
     DbConnect conn = new DbConnect();

        try {
            ps = DbConnect.dbConnect().prepareStatement(sql);
                    } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
