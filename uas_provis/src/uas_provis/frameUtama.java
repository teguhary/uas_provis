/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_provis;

import form.fpelanggan;
import java.awt.Dimension;


/**
 *
 * @author Arvin Rizky
 */
public class frameUtama extends javax.swing.JFrame {

    /**
     * Creates new form frameUtama
     */
    public frameUtama() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelutama = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mfile = new javax.swing.JMenu();
        medit = new javax.swing.JMenu();
        sbpelanggan = new javax.swing.JMenuItem();
        sbmember = new javax.swing.JMenuItem();
        mabout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelutamaLayout = new javax.swing.GroupLayout(panelutama);
        panelutama.setLayout(panelutamaLayout);
        panelutamaLayout.setHorizontalGroup(
            panelutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        panelutamaLayout.setVerticalGroup(
            panelutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        mfile.setText("File");
        jMenuBar1.add(mfile);

        medit.setText("Edit");

        sbpelanggan.setText("Data Pelanggan");
        sbpelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbpelangganActionPerformed(evt);
            }
        });
        medit.add(sbpelanggan);

        sbmember.setText("Data Member");
        medit.add(sbmember);

        jMenuBar1.add(medit);

        mabout.setText("About");
        jMenuBar1.add(mabout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelutama)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelutama)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sbpelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbpelangganActionPerformed
        // TODO add your handling code here:
       panelutama.removeAll();
       panelutama.repaint();
       fpelanggan plg = new fpelanggan();
       
       Dimension lutama = this.getSize();
       Dimension lplg = plg.getSize();
       
       plg.setLocation(lutama.width/2-lplg.width/2,lutama.height/2-lplg.height/2);
       panelutama.add(plg);
       plg.setVisible(true);
    }//GEN-LAST:event_sbpelangganActionPerformed

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
            java.util.logging.Logger.getLogger(frameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mabout;
    private javax.swing.JMenu medit;
    private javax.swing.JMenu mfile;
    private javax.swing.JDesktopPane panelutama;
    private javax.swing.JMenuItem sbmember;
    private javax.swing.JMenuItem sbpelanggan;
    // End of variables declaration//GEN-END:variables
}
