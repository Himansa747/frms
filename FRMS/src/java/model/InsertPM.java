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
public class InsertPM {

    static PreparedStatement ps;

    public static void addPM2(
            String SR,
            String Police,
            String Officer,
            String INQUEST,
            String Place,
            String Court,
            String Date,
            String CASE_No,
            String Name_of_Deceased,
            String Death_date,
            String Name_of_Medical,
            String Examination_date,
            String Name_of_request,
            String District,
            String Place_of_Exam,
            String Name_idendifier,
            String Examnination_locous,
            String External_Examination,
            String Height,
            String Age,
            String Sex,
            String Eyes_pupils,
            String Hair,
            String Tongue,
            String Tooth,
            String Sign,
            String Flaccidity,
            String Rigor_mortis,
            String Hypostasis,
            String Puterfaction,
            String Hand,
            String Openings,
            String Nose,
            String Urinary,
            String Anal,
            String Neck,
            String Soft_tissues,
            String Head,
            String Soft_parts,
            String Skull,
            String Membranes,
            String Brain_substance,
            String Blood_vasela_brain,
            String Spain_cord,
            String Thorax,
            String Soft_part_1,
            String Ribs,
            String Chest,
            String Pericardium,
            String Heart,
            String Coronary_vessels,
            String Large_blood,
            String Larynax,
            String Pleura,
            String Gullet,
            String Abdomen,
            String Organs,
            String Peritoneum,
            String Diaphragm,
            String Liver,
            String Spleen,
            String Stomach,
            String Duodenum,
            String Large_intenstines,
            String Pancreas,
            String Kidneys,
            String Supra_renal_glands,
            String Pelvis,
            String Urinary_bladder,
            String Generative_organs,
            String Blood_vessels,
            String Vertebrae,
            String Relevent_cause
    ) {

//        String sql = "INSERT INTO postmortem_report( SR ,  Police , Officer , INQUEST ,   Place , Court , Date , CASE_No , Name_of_Deceased , Death_date , Name_of_Medical , Examination_date , Name_of_request , District , Place_of_Exam , Name_idendifier , Examnination_locous , External_Examination , Height , Age , Sex , Eyes_pupils , Hair ,Tongue , Tooth , Sign , Flaccidity , Rigor_mortis , Hypostasis , Puterfaction , Hand , Openings , Nose , Urinary , Anal , Neck , Soft_tissues , Head , Soft_parts , Skull , Membranes ,Brain_substance , Blood_vasela_brain , Spain_cord , Thorax , Soft_part_1 , Ribs , Chest , Pericardium , Heart , Coronary_vessels , Large_blood , Larynax , Pleura , Gullet , Abdomen , Organs , Peritoneum , Diaphragm , Liver , Spleen , Stomach , Duodenum , Large_intenstines , Pancreas , Kidneys , Supra_renal_glands , Pelvis , Urinary_bladder , Generative_organs , Blood_vessels , Vertebrae , Relevent_cause) "
//                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        String sql = "INSERT INTO test( SR ,  Police , Officer, INQUEST, Place, Court, Date, CASE_No, Name_of_Deceased, Death_date, Name_of_Medical, Examination_date , Name_of_request, District, Place_of_Exam , Name_idendifier , Examnination_locous , External_Examination, Height , Age , Sex , Eyes_pupils , Hair ,Tongue , Tooth , Sign , Flaccidity , Rigor_mortis , Hypostasis , Puterfaction , Hand, Openings , Nose , Urinary , Anal , Neck , Soft_tissues , Head , Soft_parts , Skull , Membranes ,Brain_substance , Blood_vasela_brain , Spain_cord, Thorax , Soft_part_1 , Ribs , Chest , Pericardium , Heart , Coronary_vessels , Large_blood , Larynax , Pleura , Gullet, Abdomen , Organs , Peritoneum , Diaphragm , Liver , Spleen , Stomach , Duodenum , Large_intenstines , Pancreas , Kidneys , Supra_renal_glands , Pelvis , Urinary_bladder , Generative_organs , Blood_vessels , Vertebrae , Relevent_cause) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        DbConnect conn = new DbConnect();

        try {
            ps = DbConnect.dbConnect().prepareStatement(sql);

            ps.setString(1, SR);
            ps.setString(2, Police);
            ps.setString(3, Officer);
            ps.setString(4, INQUEST);
            ps.setString(5, Place);
            ps.setString(6, Court);     
            ps.setString(7, Date);
            ps.setString(8, CASE_No);
            ps.setString(9, Name_of_Deceased);
            ps.setString(10, Death_date);
            ps.setString(11, Name_of_Medical);
            ps.setString(12, Examination_date);
            ps.setString(13, Name_of_request);
            ps.setString(14, District);
            ps.setString(15, Place_of_Exam);
            ps.setString(16, Name_idendifier);
            ps.setString(17, Examnination_locous);
            ps.setString(18, External_Examination);
            ps.setString(19, Height);
            ps.setString(20, Age);
            ps.setString(21, Sex);
            ps.setString(22, Eyes_pupils);
            ps.setString(23, Hair);
            ps.setString(24, Tongue);
            ps.setString(25, Tooth);
            ps.setString(26, Sign);
            ps.setString(27, Flaccidity);
            ps.setString(28, Rigor_mortis);
            ps.setString(29, Hypostasis);
            ps.setString(30, Puterfaction);
            ps.setString(31, Hand);
            ps.setString(32, Openings);
            ps.setString(33, Nose);
            ps.setString(34, Urinary);
            ps.setString(35, Anal);
            ps.setString(36, Neck);
            ps.setString(37, Soft_tissues);
            ps.setString(38, Head);
            ps.setString(39, Soft_parts);
            ps.setString(40, Skull);
            ps.setString(41, Membranes);
            ps.setString(42, Brain_substance);
            ps.setString(43, Blood_vasela_brain);
            ps.setString(44, Spain_cord);
            ps.setString(45, Thorax);
            ps.setString(46, Soft_part_1);
            ps.setString(47, Ribs);
            ps.setString(48, Chest);
            ps.setString(49, Pericardium);
            ps.setString(50, Heart);
            ps.setString(51, Coronary_vessels);
            ps.setString(52, Large_blood);
            ps.setString(53, Larynax);
            ps.setString(54, Pleura);
            ps.setString(55, Gullet);
            ps.setString(56, Abdomen);
            ps.setString(57, Organs);
            ps.setString(58, Peritoneum);
            ps.setString(59, Diaphragm);
            ps.setString(60, Liver);
            ps.setString(61, Spleen);
            ps.setString(62, Stomach);
            ps.setString(63, Duodenum);
            ps.setString(64, Large_intenstines);
            ps.setString(65, Pancreas);
            ps.setString(66, Kidneys);
            ps.setString(67, Supra_renal_glands);
            ps.setString(68, Pelvis);
            ps.setString(69, Urinary_bladder);
            ps.setString(70, Generative_organs);
            ps.setString(71, Blood_vessels);
            ps.setString(72, Vertebrae);
            ps.setString(73, Relevent_cause);
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

//    public static void main(String[] args) {
//        InsertPM.addPM2(SR, Police, Officer);
//    }
}
