/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Himansa
 */
public class MLR {

    static PreparedStatement ps;

//    public static void addMLR(String Serial_no,
//            String Form_num,
//            String Court,
//            String Date_of_Issue,
//            String Case_num,
//            String Station,
//            String Date_of_Trial,
//            String Name,
//            String Age,
//            String Sex,
//            String Address,
//            String Place_of_examination,
//            String Date_of_examination,
//            String Date_of_addmission,
//            String Time_of_admission,
//            String Date_of_discharge,
//            String Beadhead_num,
//            String Short_history,
//            String Injuries,
//            String Spcl_invst,
//            String Injuries_suff,
//            String non_grv,
//            String Blunt_wpn,
//            String Blunt_cut,
//            String Shrp_wpn,
//            String Shrp_stb,
//            String Firearms,
//            String Burns,
//            String Bites,
//            String Smelling_liquor,
//            String Infl_liquor,
//            String Name_of_Doctor,
//            String Designation,
//            String Date_of_report
//            ) 
//    {
//        String sql = "INSERT INTO mlrform (S_no,MLF_no,Mgs_court,Date_of_issue,Case_no,Police_station,Date_of_trial,Full_name,Age,Sex ,Addrs,pls_of_exm,Dte_of_exm,Time_of_exm,Date_of_dschrg,Bead_no,Short_History,Injuries,Special,Non_grv_inj,Injuries Sufficent In The Crse of Ntre to Cse D,Blunt_wpn,Cuts,Shrp_ins,Firearms,Burns,Bites,sml_lqr,inf_lqr,Name_of_doctor,Designation,Date) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
//
//        DbConnect conn = new DbConnect();
//
//        try {
//            ps = DbConnect.dbConnect().prepareStatement(sql);
//
//            ps.setString(1,Serial_no);
//            ps.setString(2,Form_num);
//            ps.setString(3,Court);
//            ps.setString(4,Date_of_Issue);
//            ps.setString(5,Case_num);
//            ps.setString(6,Station);
//            ps.setString(7,Date_of_Trial);
//            ps.setString(8,Name);
//            ps.setString(9,Age);
//            ps.setString(10,Sex);
//            ps.setString(11,Address);
//            ps.setString(12,Place_of_examination);
//            ps.setString(13,Date_of_examination);
//            ps.setString(14,Date_of_addmission);
//            ps.setString(15,Time_of_admission);
//            ps.setString(16,Date_of_discharge);
//            ps.setString(17,Beadhead_num);
//            ps.setString(18,Short_history);
//            ps.setString(19,Injuries);
//            ps.setString(20,Spcl_invst);
//            ps.setString(21,Injuries_suff);
//            ps.setString(22,non_grv);
//            ps.setString(23,Blunt_wpn);
//            ps.setString(24,Blunt_cut);
//            ps.setString(25,Shrp_wpn);
//            ps.setString(26,Shrp_stb);
//            ps.setString(27,Firearms);
//            ps.setString(28,Burns);
//            ps.setString(29,Bites);
//            ps.setString(30,Smelling_liquor);
//            ps.setString(31,Infl_liquor);
//            ps.setString(32,Name_of_Doctor);
//            ps.setString(33,Designation);
//            ps.setString(34,Date_of_report);
//        
//
//            ps.executeUpdate();
//
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//
//    }

//    public static void addMLR(String Serial_no, String Form_num, String Court, String Date_of_Issue, String Case_num, String Station, String Date_of_Trial, String Name, String Age, String Sex, String Address, String Place_of_examination, String Date_of_examination) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    public static void addMLR(String Serial_no,
            String Form_num,
            String Court,
            String Date_of_Issue,
            String Case_num,
            String Station,
            String Date_of_Trial,
            String Name,
            String Age,
            String Sex,
            String Address,
            String Place_of_examination,
            String Date_of_examination,
            String Date_of_addmission,
            String Time_of_admission,
            String Date_of_discharge,
            String Beadhead_num,
            String Short_history,
            String Injuries,
            String Spcl_invst,
            String Ginj1,
            String Lus1,
            String Rem1,
            String Ginj2,
            String Lus2,
            String Rem2,
            String Ginj3,
            String Lus3,
            String Rem3,
            String Ginj4,
            String Lus4,
            String Rem4,
            String Ginj5,
            String Lus5,
            String Rem5,
               
            
            String Injuries_suff,
            String non_grv,
            String Blunt_wpn,
            String Blunt_cut,
            String Shrp_wpn,
            String Shrp_stb,
            String Firearms,
            String Burns,
            String Bites,
            String Smelling_liquor,
            String Infl_liquor,
            String Name_of_Doctor,
            String Designation,
            String Date_of_report,
            String District
            
            ) 
    
    
    
    {
        String sql = "INSERT INTO mlrform (S_no, MLF_no, Mgs_court, Date_of_issue, Case_no, Station, Date_of_trial , Full_name ,Age , Sex , Addrs , pls_of_exm , Dte_of_exm , Date_of_addm , Time_of_addm , Date_of_dschrg ,Bead_no,Short_History,Injuries,Special,Ginj1,Lus1,Rem1,Ginj2,Lus2,Rem2,Ginj3,Lus3,Rem3,Ginj4,Lus4,Rem4,Ginj5,Lus5,Rem5,ISCNTCD,Non_grv_inj ,Blunt_wpn,Cuts ,Shrp_ins,Stabs ,Firearms,Burns ,Bites ,sml_lqr,inf_lqr ,Name_of_doctor,Designation,Date,District ) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                //,Date_of_issue,Case_no,Police_station,Date_of_trial,Full_name,Age,Sex ,Addrs,pls_of_exm,Dte_of_exm,Time_of_exm,Date_of_dschrg,Bead_no,Short_History,Injuries,Special,Non_grv_inj,Injuries Sufficent In The Crse of Ntre to Cse D,Blunt_wpn,Cuts,Shrp_ins,Firearms,Burns,Bites,sml_lqr,inf_lqr,Name_of_doctor,Designation,Date) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        DbConnect conn = new DbConnect();

        try {
            ps = DbConnect.dbConnect().prepareStatement(sql);

            ps.setString(1,Serial_no);
            ps.setString(2,Form_num);
            ps.setString(3,Court);
            ps.setString(4,Date_of_Issue);
            ps.setString(5,Case_num);
            ps.setString(6,Station);
            ps.setString(7,Date_of_Trial);
            ps.setString(8,Name);
            ps.setString(9,Age);
            ps.setString(10,Sex);
            ps.setString(11,Address);
            ps.setString(12,Place_of_examination);
            ps.setString(13,Date_of_examination);
            ps.setString(14,Date_of_addmission);
            ps.setString(15,Time_of_admission);
            ps.setString(16,Date_of_discharge);
            ps.setString(17,Beadhead_num);
            ps.setString(18,Short_history);
            ps.setString(19,Injuries);
            ps.setString(20,Spcl_invst);
            ps.setString(21,Ginj1);
            ps.setString(22,Lus1);
            ps.setString(23,Rem1);
            ps.setString(24,Ginj2);
            ps.setString(25,Lus2);
            ps.setString(26,Rem2);
            ps.setString(27,Ginj3);
            ps.setString(28,Lus3);
            ps.setString(29,Rem3);
            ps.setString(30,Ginj4);
            ps.setString(31,Lus4);
            ps.setString(32,Rem4);
            ps.setString(33,Ginj5);
            ps.setString(34,Lus5);
            ps.setString(35,Rem5);
            ps.setString(36,Injuries_suff);
            ps.setString(37,non_grv);
            ps.setString(38,Blunt_wpn);
            ps.setString(39,Blunt_cut);
            ps.setString(40,Shrp_wpn);
            ps.setString(41,Shrp_stb);
            ps.setString(42,Firearms);
            ps.setString(43,Burns);
            ps.setString(44,Bites);
            ps.setString(45,Smelling_liquor);
            ps.setString(46,Infl_liquor);
            ps.setString(47,Name_of_Doctor);
            ps.setString(48,Designation);
            ps.setString(49,Date_of_report);
             ps.setString(50,District);
//        

            ps.executeUpdate();

        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }

//       public static void addMLR2(String inj1,
//            String inj2,
//            String inj3,
//            String inj4,
//            String desc1,
//            String desc2,
//            String desc3,
//            String desc4
//           
//           ) 
//    
//    
//    
//    {
//        String sql = "INSERT INTO mlrinj (inj_no,Ntre) VALUES ((?,?),(?,?),(?,?),(?,?))";
//                //,Date_of_issue,Case_no,Police_station,Date_of_trial,Full_name,Age,Sex ,Addrs,pls_of_exm,Dte_of_exm,Time_of_exm,Date_of_dschrg,Bead_no,Short_History,Injuries,Special,Non_grv_inj,Injuries Sufficent In The Crse of Ntre to Cse D,Blunt_wpn,Cuts,Shrp_ins,Firearms,Burns,Bites,sml_lqr,inf_lqr,Name_of_doctor,Designation,Date) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
//
//        DbConnect conn = new DbConnect();
//
//        try {
//            ps = DbConnect.dbConnect().prepareStatement(sql);
//
//            ps.setString(1,inj1);
//            ps.setString(2,desc1);
//            ps.setString(3,inj2);
//            ps.setString(4,desc2);
//            ps.setString(5,inj3);
//            ps.setString(6,desc3);
//            ps.setString(7,inj4);
//            ps.setString(8,desc4);
//             ps.executeUpdate();
//
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//
//    }

    
    

    
    }

   


    

    
