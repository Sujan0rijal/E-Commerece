/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author GP65
 */
public class Volleyball extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form java
     */
    public Volleyball() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jersey = new javax.swing.JButton();
        ball_text = new javax.swing.JLabel();
        ball = new javax.swing.JButton();
        shoe_text = new javax.swing.JLabel();
        shoe = new javax.swing.JButton();
        Bagpack_text = new javax.swing.JLabel();
        pad_text = new javax.swing.JLabel();
        Net_text = new javax.swing.JLabel();
        Bagpack = new javax.swing.JButton();
        Knee_pad = new javax.swing.JButton();
        sock = new javax.swing.JButton();
        jersey_text = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        Name = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        jLabel10.setText("jLabel10");

        jLabel1.setText("jLabel1");

        jLabel12.setText("jLabel12");

        jLabel13.setText("jLabel13");

        jLabel3.setIcon(new javax.swing.ImageIcon("src/view/photo/volleyball/table_tennis_back.jpg")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Volleyball");
        setIconImage(new ImageIcon("c/src/view/volleyball/Volleyball_logo.jpg").getImage());

        jPanel1.setLayout(null);

        jersey.setBackground(new java.awt.Color(255, 255, 255));
        jersey.setText("Jersey");
        jersey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jerseyActionPerformed(evt);
            }
        });
        jPanel1.add(jersey);
        jersey.setBounds(60, 190, 73, 23);

        ball_text.setIcon(new javax.swing.ImageIcon("src/view/photo/volleyball/Volleyball_ball.jpg")); // NOI18N
        jPanel1.add(ball_text);
        ball_text.setBounds(270, 80, 110, 110);

        ball.setText("Ball");
        ball.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ballActionPerformed(evt);
            }
        });
        jPanel1.add(ball);
        ball.setBounds(300, 190, 49, 23);

        shoe_text.setIcon(new javax.swing.ImageIcon("src/view/photo/volleyball/Volleyball_shoe.jpg")); // NOI18N
        jPanel1.add(shoe_text);
        shoe_text.setBounds(480, 110, 130, 60);

        shoe.setText("Shoes");
        jPanel1.add(shoe);
        shoe.setBounds(510, 190, 70, 23);

        Bagpack_text.setIcon(new javax.swing.ImageIcon("src/view/photo/volleyball/Volleyball_bagpack.jpg")); // NOI18N
        jPanel1.add(Bagpack_text);
        Bagpack_text.setBounds(50, 250, 80, 100);

        pad_text.setIcon(new javax.swing.ImageIcon("src/view/photo/volleyball/Volleyball_kneepad.jpg")); // NOI18N
        jPanel1.add(pad_text);
        pad_text.setBounds(270, 250, 120, 100);

        Net_text.setIcon(new javax.swing.ImageIcon("src/view/photo/volleyball/Volleyball_net.jpg")); // NOI18N
        jPanel1.add(Net_text);
        Net_text.setBounds(480, 260, 140, 90);

        Bagpack.setText("Bagpack");
        jPanel1.add(Bagpack);
        Bagpack.setBounds(50, 360, 80, 23);

        Knee_pad.setText("Knee Pad");
        jPanel1.add(Knee_pad);
        Knee_pad.setBounds(290, 360, 90, 23);

        sock.setText("Net");
        jPanel1.add(sock);
        sock.setBounds(510, 360, 70, 23);

        jersey_text.setIcon(new javax.swing.ImageIcon("src/view/photo/volleyball/Volleyball_jersey.jpg")); // NOI18N
        jPanel1.add(jersey_text);
        jersey_text.setBounds(30, 80, 130, 110);

        Back.setBackground(new java.awt.Color(255, 0, 51));
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("Back");
        Back.addActionListener(this);

        jPanel1.add(Back);
        Back.setBounds(0, 50, 73, 23);

        Name.setIcon(new javax.swing.ImageIcon("src/view/photo/volleyball/Volleyball_banner.jpg")); // NOI18N
        jPanel1.add(Name);
        Name.setBounds(130, 0, 400, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon("src/view/photo/volleyball/Volleyball_background.jpg")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 660, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>

    private void jerseyActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void ballActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Volleyball.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Volleyball.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Volleyball.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Volleyball.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Volleyball().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton Back;
    private javax.swing.JButton Bagpack;
    private javax.swing.JLabel Bagpack_text;
    private javax.swing.JButton Knee_pad;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Net_text;
    private javax.swing.JButton ball;
    private javax.swing.JLabel ball_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jersey;
    private javax.swing.JLabel jersey_text;
    private javax.swing.JLabel pad_text;
    private javax.swing.JButton shoe;
    private javax.swing.JLabel shoe_text;
    private javax.swing.JButton sock;

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Back){
            new Dashboard().setVisible(true);
            dispose();
        }
    }
    // End of variables declaration
}