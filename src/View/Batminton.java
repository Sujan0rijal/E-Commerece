package View;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Batminton extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form Batminton
     */
    public Batminton() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Backbutton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);
         //Added button listner
         jButton1.addActionListener(this);
         jButton2.addActionListener(this);
         jButton3.addActionListener(this);
         jButton4.addActionListener(this);
         jButton5.addActionListener(this);

        jLabel2.setIcon(new javax.swing.ImageIcon("src//view//photo//Batminton//18.jpg")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 150, 100, 120);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("BUY");
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 320, 110, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon("src//view//photo//Batminton//a6.jpg")); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(660, 160, 120, 110);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 204));
        jButton2.setText("BUY");
        jPanel1.add(jButton2);
        jButton2.setBounds(160, 320, 120, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon("src//view//photo//Batminton//03.jpg")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(330, 150, 100, 120);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 204));
        jButton3.setText("BUY");
        jPanel1.add(jButton3);
        jButton3.setBounds(320, 320, 120, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon("src//view//photo//Batminton//05.jpg")); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(480, 150, 120, 120);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 204));
        jButton4.setText("BUY");
        jPanel1.add(jButton4);
        jButton4.setBounds(490, 320, 110, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon("src//view//photo//Batminton//09.jpg")); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(160, 150, 120, 110);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 204));
        jButton5.setText("BUY");
        jPanel1.add(jButton5);
        jButton5.setBounds(670, 320, 110, 30);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(null);

        Backbutton.setBackground(new java.awt.Color(153, 153, 153));
        Backbutton.setForeground(new java.awt.Color(0, 0, 153));
        Backbutton.setText("Back");
        Backbutton.addActionListener(this);
        jPanel2.add(Backbutton);
        Backbutton.setBounds(733, 10, 70, 20);

        jLabel5.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("HAMRO KHELKUD");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 10, 210, 24);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 820, 40);

        jLabel8.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 164, 191));
        jLabel8.setText("BATMINTON");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(280, 60, 210, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Racket");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 290, 70, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Kit Bag");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(190, 290, 70, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Shuttlecock");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(340, 290, 90, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("Shoes");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(510, 290, 70, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setText("Othe rEquipments");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(670, 290, 110, 20);

       

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("src//view//photo//Batminton//a2.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-1, -6, 820, 470);
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

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
            java.util.logging.Logger.getLogger(Batminton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Batminton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Batminton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Batminton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Batminton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton Backbutton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==Backbutton){
            new Dashboard().setVisible(true);
            dispose();
        }
        if (e.getSource()==jButton1){
            JOptionPane.showConfirmDialog(null,"do you want to print the bill");
            System.out.print("button 1");
        }
        if (e.getSource()==jButton2){
            JOptionPane.showConfirmDialog(null,"do you want to print the bill");
        }
        if (e.getSource()==jButton3){
            JOptionPane.showConfirmDialog(null,"do you want to print the bill");
        }
        if (e.getSource()==jButton4){
            JOptionPane.showConfirmDialog(null,"do you want to print the bill");
        }
        if (e.getSource()==jButton5){
            JOptionPane.showConfirmDialog(null,"do you want to print the bill");
        }
    }

    // End of variables declaration
}
