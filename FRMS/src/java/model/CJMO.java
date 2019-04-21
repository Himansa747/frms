/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import static model.LoginValidator.userAccountType;

/**
 *
 * @author Januka
 */
public class CJMO extends JMO {

    static PreparedStatement ps;
    static PreparedStatement ps1;

    public static void addJMO(String name, String username, String password, String email, String contactNumber, String accType , String sl) {
        String sql = "INSERT INTO JMO (name, username, password, email, contactNumber, accountType, slValue) VALUES (?,?,?,?,?,?,?)";

        DbConnect conn = new DbConnect();

        try {
            ps = DbConnect.dbConnect().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, username);
            ps.setString(3, password);
            ps.setString(4, email);
            ps.setString(5, contactNumber);
            ps.setString(6, accType);
            ps.setString(7, sl);

            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

     public static void addPolice(String na, String una, String pass, String mail, String tel, String pid, String accty , String station , String sl) {
        String sql = "INSERT INTO policeofficer(name, username, password, email, contactNumber, ID_Num, accountType,station,slValue) VALUES (?,?,?,?,?,?,?,?,?)";

       // DbConnect conn = new DbConnect();

        try {
            ps = DbConnect.dbConnect().prepareStatement(sql);

            ps.setString(1, na);
            ps.setString(2, una);
            ps.setString(3, pass);
            ps.setString(4, mail);
            ps.setString(5, tel);
            ps.setString(6, pid);
            ps.setString(7, accty);
            ps.setString(8, station);
            ps.setString(9, sl);

            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }


    public static void addRegistrar(String name, String userName, String password, String email, String pNumber, String ID, String accType , String slValue) {
        String sql = "INSERT INTO REGISTRAR(name, username, password, email, contactNumber, ID_Num, accountType , slValue) VALUES (?,?,?,?,?,?,?,?)";

        DbConnect conn = new DbConnect();

        try {
            ps = DbConnect.dbConnect().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, userName);
            ps.setString(3, password);
            ps.setString(4, email);
            ps.setString(5, pNumber);
            ps.setString(6, ID);
            ps.setString(7, accType);
            ps.setString(8, slValue);

            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void main(String[] args) {
        addRegistrar("janu", "hhhg", "sdds", "sss", "dsddss", "www", "www" , "a" );
    }
}