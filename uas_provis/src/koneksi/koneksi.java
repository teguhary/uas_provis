/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Arvin Rizky
 */
public class koneksi {
    Connection koneksi;
    
    public static Connection Koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            String db_connection = "mysql";
            String db_host = "localhost";
            String db_name = "db10118375rental";
            String db_username = "root";
            String db_password = "";
            Connection koneksi = DriverManager.getConnection("jdbc:"+ db_connection +"://"+ db_host +"/"+ db_name +"", ""+db_username+"", ""+ db_password +"");
            
            return koneksi;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
            return null;
        }

    }
}
