/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author macbookpro
 */
public class Koneksi {
    Connection koneksi;
    public static Connection Koneksi() {
        try {
            Connection koneksi = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/db_kontak", "root", "");
            return koneksi;
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "lost connection : "+e);
            return null;
        }
    }
    public static void main(String[] args) {
        Koneksi();
    }
}
