/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programsqlite;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.table.DefaultTableModel;
import konfigurasi.Connect;
import konfigurasi.tengah;
import sun.awt.SunToolkit;
/**
 *
 * @author syaban
 */
public class frmLogin extends javax.swing.JFrame {
    private DefaultTableModel DftTabMode1;
    String bam_id;
    Connection conn = null;
    /**
     * Creates new form frmLogin
     */
    public frmLogin() {
//        this.setAlwaysOnTop(true);
        this.setResizable(true);
        this.setVisible(true);
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
         int xsize = (int) tk.getScreenSize().getWidth();
         int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        background11 = new programsqlite.background1();
        jbAgenda1 = new javax.swing.JButton();
        jbAgenda2 = new javax.swing.JButton();
        jbAgenda3 = new javax.swing.JButton();
        jbAgenda4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        background2 = new programsqlite.background();
        jPanel6 = new javax.swing.JPanel();
        jlMasukkanNim = new javax.swing.JLabel();
        jtMasukkanNim = new javax.swing.JTextField();
        jbHadir = new javax.swing.JButton();
        jlStatus = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtabTampil = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabbedPane2.setBackground(new java.awt.Color(0, 102, 102));
        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseClicked(evt);
            }
        });

        jbAgenda1.setBackground(new java.awt.Color(255, 153, 0));
        jbAgenda1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbAgenda1.setForeground(new java.awt.Color(255, 255, 255));
        jbAgenda1.setText("OPENING");
        jbAgenda1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbAgenda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgenda1ActionPerformed(evt);
            }
        });

        jbAgenda2.setBackground(new java.awt.Color(255, 153, 0));
        jbAgenda2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbAgenda2.setForeground(new java.awt.Color(255, 255, 255));
        jbAgenda2.setText("BIG CLASS 1");
        jbAgenda2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbAgenda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgenda2ActionPerformed(evt);
            }
        });

        jbAgenda3.setBackground(new java.awt.Color(255, 153, 0));
        jbAgenda3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbAgenda3.setForeground(new java.awt.Color(255, 255, 255));
        jbAgenda3.setText("BIG CLASS 2");
        jbAgenda3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbAgenda3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgenda3ActionPerformed(evt);
            }
        });

        jbAgenda4.setBackground(new java.awt.Color(255, 153, 0));
        jbAgenda4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbAgenda4.setForeground(new java.awt.Color(255, 255, 255));
        jbAgenda4.setText("CLOSING");
        jbAgenda4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbAgenda4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgenda4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout background11Layout = new javax.swing.GroupLayout(background11);
        background11.setLayout(background11Layout);
        background11Layout.setHorizontalGroup(
            background11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background11Layout.createSequentialGroup()
                .addGap(386, 386, 386)
                .addGroup(background11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jbAgenda1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                    .addComponent(jbAgenda2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jbAgenda3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jbAgenda4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(331, 331, 331))
        );
        background11Layout.setVerticalGroup(
            background11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background11Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jbAgenda1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAgenda2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAgenda3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAgenda4, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(150, 150, 150))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Admin", jPanel3);

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));

        jlMasukkanNim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlMasukkanNim.setForeground(new java.awt.Color(255, 255, 255));
        jlMasukkanNim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMasukkanNim.setText("Masukkan NIM Anda disini :");

        jtMasukkanNim.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtMasukkanNim.setForeground(new java.awt.Color(0, 153, 51));
        jtMasukkanNim.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtMasukkanNim.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtMasukkanNim.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jtMasukkanNimComponentAdded(evt);
            }
        });
        jtMasukkanNim.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jtMasukkanNimInputMethodTextChanged(evt);
            }
        });
        jtMasukkanNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMasukkanNimActionPerformed(evt);
            }
        });
        jtMasukkanNim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtMasukkanNimKeyTyped(evt);
            }
        });

        jbHadir.setBackground(new java.awt.Color(255, 204, 0));
        jbHadir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbHadir.setText("Hadir");
        jbHadir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbHadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbHadirMouseClicked(evt);
            }
        });
        jbHadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHadirActionPerformed(evt);
            }
        });

        jlStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlStatus.setForeground(new java.awt.Color(255, 255, 51));
        jlStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel6.setLocation(5, 100);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtMasukkanNim, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlMasukkanNim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jbHadir, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addGap(101, 101, 101))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jlMasukkanNim, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtMasukkanNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbHadir, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setForeground(new java.awt.Color(0, 102, 102));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel7.setSize(100, 100);

        jtabTampil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtabTampil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtabTampil.setForeground(new java.awt.Color(0, 153, 102));
        jtabTampil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "nim"
            }
        ));
        jScrollPane2.setViewportView(jtabTampil);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout background2Layout = new javax.swing.GroupLayout(background2);
        background2.setLayout(background2Layout);
        background2Layout.setHorizontalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(275, 275, 275)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(161, 161, 161))
        );
        background2Layout.setVerticalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(238, 238, 238))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background2Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(283, 283, 283))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Peserta", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
//        conn = Connect.ConnectDB();        
        JFrame form = new JFrame();
        form.setSize(400, 400);
        tengah posisi = new tengah(this);
       
    
        //panggil method koneksi
                
        java.sql.Connection koneksi = new Connect().ConnectDB();

        tampil_tabel();
//        tampil_combo();
//        disable_form();

    }//GEN-LAST:event_formWindowActivated

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowDeactivated

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void jbAgenda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgenda1ActionPerformed
        // TODO add your handling code here:
        bam_id = "001";
        JOptionPane.showMessageDialog(rootPane, "Anda berhasil mensetting bam_id=001");
    }//GEN-LAST:event_jbAgenda1ActionPerformed

    private void jTabbedPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MouseClicked
        // TODO add your handling code here:
        java.sql.Connection koneksi = new Connect().ConnectDB();
        tampil_tabel();

    }//GEN-LAST:event_jTabbedPane2MouseClicked

    private void jbAgenda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgenda2ActionPerformed
        // TODO add your handling code here:
        bam_id = "002";
        JOptionPane.showMessageDialog(rootPane, "Anda berhasil mensetting bam_id=002");        
    }//GEN-LAST:event_jbAgenda2ActionPerformed

    private void jbAgenda3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgenda3ActionPerformed
        // TODO add your handling code here:
        bam_id = "003";
        JOptionPane.showMessageDialog(rootPane, "Anda berhasil mensetting bam_id=003");        
    }//GEN-LAST:event_jbAgenda3ActionPerformed

    private void jbAgenda4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgenda4ActionPerformed
        // TODO add your handling code here:
        bam_id = "004";
        JOptionPane.showMessageDialog(rootPane, "Anda berhasil mensetting bam_id=004");
    }//GEN-LAST:event_jbAgenda4ActionPerformed

    private void jbHadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHadirActionPerformed
        // TODO add your handling code here:
        //        input_data();
        input_absen();
    }//GEN-LAST:event_jbHadirActionPerformed

    private void jbHadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbHadirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbHadirMouseClicked

    private void jtMasukkanNimKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMasukkanNimKeyTyped
        jlStatus.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMasukkanNimKeyTyped

    private void jtMasukkanNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMasukkanNimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMasukkanNimActionPerformed

    private void jtMasukkanNimInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jtMasukkanNimInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMasukkanNimInputMethodTextChanged

    private void jtMasukkanNimComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jtMasukkanNimComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMasukkanNimComponentAdded

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private programsqlite.background1 background11;
    private programsqlite.background background2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JButton jbAgenda1;
    private javax.swing.JButton jbAgenda2;
    private javax.swing.JButton jbAgenda3;
    private javax.swing.JButton jbAgenda4;
    private javax.swing.JButton jbHadir;
    private javax.swing.JLabel jlMasukkanNim;
    private javax.swing.JLabel jlStatus;
    private javax.swing.JTextField jtMasukkanNim;
    private javax.swing.JTable jtabTampil;
    // End of variables declaration//GEN-END:variables
    public void input_absen(){
        java.sql.Connection koneksi = new Connect().ConnectDB();
        try{
//            String sql="insert into absen(nim) values(?)";            
            String sql="insert into presensi(nim, bam_id) values(?,?)";
            java.sql.PreparedStatement stmt = koneksi.prepareStatement(sql);
            try{
                stmt.setString(1, jtMasukkanNim.getText());
                stmt.setString(2, bam_id);
                stmt.executeUpdate();
                jlStatus.setText("Nim berhasil disimpan..");
//                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
                jtMasukkanNim.setText("");
                tampil_tabel();
            }catch(SQLException se){
                JOptionPane.showMessageDialog(rootPane, "Data yang Anda inputkan telah terdaftar!");
                jtMasukkanNim.setText("");
            }stmt.close();
        }catch(Exception e){}
        
    }
    
    public void tampil_tabel(){
           Object[] Baris={"NIM Mahasiswa MPAI"};
           DftTabMode1 = new DefaultTableModel(null, Baris);
           jtabTampil.setModel(DftTabMode1);

           //panggil method koneksi
            java.sql.Connection koneksi = new Connect().ConnectDB();

           //untuk menampilkan di table
           try{
//               String sql="Select nim from absen order by nim asc";
               String sql="Select nim from presensi order by bam_id asc";
               java.sql.Statement stmt=koneksi.createStatement();
               java.sql.ResultSet rslt=stmt.executeQuery(sql);
               while(rslt.next()){
                   String nim=rslt.getString("nim");
                   String[] dataField={nim};
                   DftTabMode1.addRow(dataField);
               }
           }catch(Exception ex){}
    }
    
}
