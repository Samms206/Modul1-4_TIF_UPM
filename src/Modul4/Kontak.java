/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author macbookpro
 */
public class Kontak extends javax.swing.JFrame {

    /**
     * Creates new form Kontak
     */
    Connection conn = Koneksi.Koneksi();
    String jenkel = "";
    
    public Kontak() {
        initComponents();
        enable_false();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        eCari = new javax.swing.JTextField();
        eAlamat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ePerempuan = new javax.swing.JRadioButton();
        eLaki = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        eNotelp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ePekerjaan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_kontak = new javax.swing.JTable();
        eNama = new javax.swing.JTextField();
        btnHapus = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("==== KONTAK ====");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 740, -1));

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        getContentPane().add(eCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 310, 30));
        getContentPane().add(eAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 250, 30));

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel3.setText("Jenis Kelamin");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 30));

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel4.setText("Alamat");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));

        buttonGroup1.add(ePerempuan);
        ePerempuan.setText("Perempuan");
        getContentPane().add(ePerempuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, 30));

        buttonGroup1.add(eLaki);
        eLaki.setText("Laki-laki");
        getContentPane().add(eLaki, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, 30));

        jLabel5.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel5.setText("No Telepon");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 30));
        getContentPane().add(eNotelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 250, 30));

        jLabel6.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jLabel6.setText("Pekerjaan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 30));

        ePekerjaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ePekerjaanActionPerformed(evt);
            }
        });
        getContentPane().add(ePekerjaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 250, 30));

        tbl_kontak.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_kontak);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 420, 290));
        getContentPane().add(eNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 250, 30));

        btnHapus.setText("Hapus");
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 110, 40));

        btnCari.setText("Cari");
        getContentPane().add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 100, -1));

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 100, 40));

        btnEdit.setText("Edit");
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 110, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ePekerjaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ePekerjaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ePekerjaanActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        if ("Tambah".equals(btnTambah.getText())) {
            setEnabled();
            btnTambah.setText("Simpan");
        }else{
            Tambah();
        }
    }//GEN-LAST:event_btnTambahActionPerformed
    void enable_false(){
        eNama.setEnabled(false);
        eAlamat.setEnabled(false);
        eNotelp.setEnabled(false);
        ePekerjaan.setEnabled(false);
    }
    void setEnabled(){
        eNama.setEnabled(true);
        eAlamat.setEnabled(true);
        eNotelp.setEnabled(true);
        ePekerjaan.setEnabled(true);
    }
    void bersih(){
        eNama.setText("");
        eAlamat.setText("");
        eNotelp.setText("");
        ePekerjaan.setText("");
        jenkel="";
        buttonGroup1.clearSelection();
    }
    void Tambah(){
        if ("".equals(eNama.getText()) || "".equals(eAlamat.getText()) || "".equals(eNotelp.getText()) || "".equals(ePekerjaan.getText())) {
            JOptionPane.showMessageDialog(this, "Inputan masih kosong!!!");
        }else{
            if (eLaki.isSelected()) {
            jenkel = "Laki-laki";
            }else{
                jenkel = "Perempuan";
            }
            String sql = "INSERT INTO kontak (nama, jenkel, alamat, notelp, pekerjaan) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.setString(1, eNama.getText());
                preparedStatement.setString(2, jenkel);
                preparedStatement.setString(3, eAlamat.getText());
                preparedStatement.setString(4, eNotelp.getText());
                preparedStatement.setString(5, ePekerjaan.getText());
                preparedStatement.executeUpdate();
                JOptionPane.showMessageDialog(this, "Berhasil menambahkan Data!");
                btnTambah.setText("Tambah");
                bersih();
                enable_false();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Kontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kontak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField eAlamat;
    private javax.swing.JTextField eCari;
    private javax.swing.JRadioButton eLaki;
    private javax.swing.JTextField eNama;
    private javax.swing.JTextField eNotelp;
    private javax.swing.JTextField ePekerjaan;
    private javax.swing.JRadioButton ePerempuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_kontak;
    // End of variables declaration//GEN-END:variables
}
