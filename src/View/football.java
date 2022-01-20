
package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class
football extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form java
     */
    public football() {
        initComponents();
    }

    /*
     * This method is called from within the constructor to initialize the form.
     
     */
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jersey = new javax.swing.JButton();
        ball_text = new javax.swing.JLabel();
        ball = new javax.swing.JButton();
        shoe_text = new javax.swing.JLabel();
        football = new javax.swing.JLabel();
        shoe = new javax.swing.JButton();
        gloves_text = new javax.swing.JLabel();
        pad_text = new javax.swing.JLabel();
        sock_text = new javax.swing.JLabel();
        gloves = new javax.swing.JButton();
        pad = new javax.swing.JButton();
        sock = new javax.swing.JButton();
        jersey_text = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        pane = new javax.swing.JLabel();


        jLabel1.setIcon(new javax.swing.ImageIcon("src/view/photo/football/jersey.png")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel12.setText("jLabel12");

        jLabel13.setIcon(new javax.swing.ImageIcon("src/view/photo/football/f2.jpg")); // NOI18N
        jLabel13.setText("jLabel13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setTitle("Football");
        setIconImage(new ImageIcon("src/view/photo/football/football.png").getImage());

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

        ball_text.setIcon(new javax.swing.ImageIcon("src/view/photo/football/fb.jpg")); // NOI18N
        jPanel1.add(ball_text);
        ball_text.setBounds(270, 80, 140, 110);

        ball.setText("Ball");
        ball.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ballActionPerformed(evt);
            }
        });
        jPanel1.add(ball);
        ball.setBounds(300, 190, 49, 23);

        shoe_text.setIcon(new javax.swing.ImageIcon("src/view/photo/football/fs.jpg")); // NOI18N
        jPanel1.add(shoe_text);
        shoe_text.setBounds(450, 80, 170, 90);

        football.setIcon(new javax.swing.ImageIcon("src/view/photo/football/f.jpg")); // NOI18N
        football.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(football);
        football.setBounds(0, 0, 235, 50);

        shoe.setText("Shoes");
        jPanel1.add(shoe);
        shoe.setBounds(510, 190, 70, 23);

        gloves_text.setIcon(new javax.swing.ImageIcon("src/view/photo/football/fg.jpg")); // NOI18N
        jPanel1.add(gloves_text);
        gloves_text.setBounds(30, 230, 130, 130);

        pad_text.setIcon(new javax.swing.ImageIcon("src/view/photo/football/fp.jpg")); // NOI18N
        jPanel1.add(pad_text);
        pad_text.setBounds(270, 240, 120, 110);

        sock_text.setIcon(new javax.swing.ImageIcon("src/view/photo/football/js1.jpg")); // NOI18N
        jPanel1.add(sock_text);
        sock_text.setBounds(500, 230, 90, 130);

        gloves.setText("Gloves");
        jPanel1.add(gloves);
        gloves.setBounds(60, 360, 65, 23);

        pad.setText("Pads");
        jPanel1.add(pad);
        pad.setBounds(300, 360, 55, 23);

        sock.setText("Socks");
        jPanel1.add(sock);
        sock.setBounds(510, 360, 70, 23);

        jersey_text.setIcon(new javax.swing.ImageIcon("src/view/photo/football/fj.jpg")); // NOI18N
        jersey_text.setText("jLabel11");
        jPanel1.add(jersey_text);
        jersey_text.setBounds(40, 80, 110, 110);

        Back.setBackground(new java.awt.Color(255, 0, 51));
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("Back");
        Back.addActionListener(this);

        jPanel1.add(Back);
        Back.setBounds(0, 50, 73, 23);

        pane.setIcon(new javax.swing.ImageIcon("src/view/photo/football/f2.jpg")); // NOI18N
        jPanel1.add(pane);
        pane.setBounds(-60, 0, 730, 410);

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
            java.util.logging.Logger.getLogger(football.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(football.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(football.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(football.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new football().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton Back;
    private javax.swing.JButton ball;
    private javax.swing.JLabel ball_text;
    private javax.swing.JLabel football;
    private javax.swing.JButton gloves;
    private javax.swing.JLabel gloves_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jersey;
    private javax.swing.JLabel jersey_text;
    private javax.swing.JButton pad;
    private javax.swing.JLabel pad_text;
    private javax.swing.JLabel pane;
    private javax.swing.JButton shoe;
    private javax.swing.JLabel shoe_text;
    private javax.swing.JButton sock;
    private javax.swing.JLabel sock_text;

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Back){
            new Dashboard().setVisible(true);
            dispose();
        }
    }
    // End of variables declaration
}
