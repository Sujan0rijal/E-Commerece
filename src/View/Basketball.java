/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;

import javax.swing.JOptionPane;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

/**
 *
 * @author ASUS
 */
public class Basketball extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form Basketball
     */
    public Basketball() {
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Backbutton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("BUY");
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 220, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("src//view//photo//Basketball//3.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 90, 100, 100);

        jLabel4.setIcon(new javax.swing.ImageIcon("src//view//photo//Basketball//135.jpg")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(170, 80, 110, 120);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 204));
        jButton2.setText("BUY");
        jPanel1.add(jButton2);
        jButton2.setBounds(170, 220, 100, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("src//view//photo//Basketball//15.jpg")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(320, 70, 120, 130);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 204));
        jButton3.setText("BUY");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(330, 220, 100, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon("src//view//photo//Basketball//16.jpg")); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(490, 90, 100, 90);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 204));
        jButton4.setText("BUY");
        jPanel1.add(jButton4);
        jButton4.setBounds(490, 220, 100, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon("src//view//photo//Basketball//11.jpg")); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(250, 250, 110, 110);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 204));
        jButton5.setText("BUY");
        jPanel1.add(jButton5);
        jButton5.setBounds(240, 380, 110, 30);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(null);
        //Addding the action listner
        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        jButton3.addActionListener(this);
        jButton4.addActionListener(this);
        jButton5.addActionListener(this);
        Backbutton.setBackground(new java.awt.Color(153, 153, 153));
        Backbutton.setForeground(new java.awt.Color(0, 0, 153));
        Backbutton.setText("Back");
        Backbutton.addActionListener(this);
        Backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbuttonActionPerformed(evt);
            }
        });
        jPanel2.add(Backbutton);
        Backbutton.setBounds(530, 10, 70, 20);

        jLabel8.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("HAMRO KHELKUD");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 10, 220, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 610, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Jersey");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 200, 70, 20);

        jLabel7.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 108, 84));
        jLabel7.setText("BASKETBALL");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(210, 40, 220, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Shoes");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(190, 200, 70, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Ball");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(360, 200, 70, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("Net");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(520, 200, 60, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("Other Equipments");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(240, 350, 120, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setIcon(new javax.swing.ImageIcon("src//view//photo//Basketball//a5.jpg")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-1, -1, 610, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void BackbuttonActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(Basketball.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Basketball.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Basketball.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Basketball.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Basketball().setVisible(true);
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
            JOptionPane.showMessageDialog(null,"Check your bill");

                try{//creating file name
                    String file_name = "C:\\Users\\Dell\\Desktop\\Bill\\customerBill.pdf";
                    Document document = new Document();
                    PdfWriter.getInstance(document,new FileOutputStream(file_name));
                    document.open();
                    //Add the content
        
                    Paragraph para1 = new Paragraph("Customer Bill");
                    document.add(para1);
                    Paragraph para2 = new Paragraph("******************************************************************");
                    document.add(para2);
                    Paragraph para3 = new Paragraph("Customer name = Yankee");
                    document.add(para3);
                    Paragraph para4 = new Paragraph("                      ");
                    document.add(para4);
        
                    //Add table
                    PdfPTable table=new PdfPTable(3);
                    PdfPCell c1 = new PdfPCell(new Phrase("Product"));
                    table.addCell(c1);
        
                    c1 = new PdfPCell(new Phrase("Quantity"));
                    table.addCell(c1);
        
                    c1 = new PdfPCell(new Phrase("Price"));
                    table.addCell(c1);
        
                //column1
                   table.addCell("Jersey");
                   //Column2
                   table.addCell("1");
                   //Column3
                   table.addCell("1000");
             
        
                    document.add(table);
        
                    document.close();
                    
                }catch(Exception e1){
                    System.err.println(e1);
                }
            
        }
        if (e.getSource()==jButton2){
            JOptionPane.showMessageDialog(null,"Check your bill");
          
                try{//creating file name
                    String file_name = "C:\\Users\\Dell\\Desktop\\Bill\\customerBill.pdf";
                    Document document = new Document();
                    PdfWriter.getInstance(document,new FileOutputStream(file_name));
                    document.open();
                    //Add the content
        
                    Paragraph para1 = new Paragraph("Customer Bill");
                    document.add(para1);
                    Paragraph para2 = new Paragraph("******************************************************************");
                    document.add(para2);
                    Paragraph para3 = new Paragraph("Customer name = Yankee");
                    document.add(para3);
                    Paragraph para4 = new Paragraph("                      ");
                    document.add(para4);
        
                    //Add table
                    PdfPTable table=new PdfPTable(3);
                    PdfPCell c1 = new PdfPCell(new Phrase("Product"));
                    table.addCell(c1);
        
                    c1 = new PdfPCell(new Phrase("Quantity"));
                    table.addCell(c1);
        
                    c1 = new PdfPCell(new Phrase("Price"));
                    table.addCell(c1);
        
                //column1
                   table.addCell("Shoes");
                   //Column2
                   table.addCell("1");
                   //Column3
                   table.addCell("2000");
             
        
                    document.add(table);
        
                    document.close();
                    
                }catch(Exception e1){
                    System.err.println(e1);
                }
        }
        if (e.getSource()==jButton3){
            JOptionPane.showMessageDialog(null,"Check your bill");
           
                try{//creating file name
                    String file_name = "C:\\Users\\Dell\\Desktop\\Bill\\customerBill.pdf";
                    Document document = new Document();
                    PdfWriter.getInstance(document,new FileOutputStream(file_name));
                    document.open();
                    //Add the content
        
                    Paragraph para1 = new Paragraph("Customer Bill");
                    document.add(para1);
                    Paragraph para2 = new Paragraph("******************************************************************");
                    document.add(para2);
                    Paragraph para3 = new Paragraph("Customer name = Yankee");
                    document.add(para3);
                    Paragraph para4 = new Paragraph("                      ");
                    document.add(para4);
        
                    //Add table
                    PdfPTable table=new PdfPTable(3);
                    PdfPCell c1 = new PdfPCell(new Phrase("Product"));
                    table.addCell(c1);
        
                    c1 = new PdfPCell(new Phrase("Quantity"));
                    table.addCell(c1);
        
                    c1 = new PdfPCell(new Phrase("Price"));
                    table.addCell(c1);
        
                //column1
                   table.addCell("Ball");
                   //Column2
                   table.addCell("1");
                   //Column3
                   table.addCell("1000");
             
        
                    document.add(table);
        
                    document.close();
                    
                }catch(Exception e1){
                    System.err.println(e1);
                }
        }
        if (e.getSource()==jButton4){
            JOptionPane.showMessageDialog(null,"Check your bill");
                try{//creating file name
                    String file_name = "C:\\Users\\Dell\\Desktop\\Bill\\customerBill.pdf";
                    Document document = new Document();
                    PdfWriter.getInstance(document,new FileOutputStream(file_name));
                    document.open();
                    //Add the content
        
                    Paragraph para1 = new Paragraph("Customer Bill");
                    document.add(para1);
                    Paragraph para2 = new Paragraph("******************************************************************");
                    document.add(para2);
                    Paragraph para3 = new Paragraph("Customer name = Yankee");
                    document.add(para3);
                    Paragraph para4 = new Paragraph("                      ");
                    document.add(para4);
        
                    //Add table
                    PdfPTable table=new PdfPTable(3);
                    PdfPCell c1 = new PdfPCell(new Phrase("Product"));
                    table.addCell(c1);
        
                    c1 = new PdfPCell(new Phrase("Quantity"));
                    table.addCell(c1);
        
                    c1 = new PdfPCell(new Phrase("Price"));
                    table.addCell(c1);
        
                //column1
                   table.addCell("Net");
                   //Column2
                   table.addCell("1");
                   //Column3
                   table.addCell("1000");
             
        
                    document.add(table);
        
                    document.close();
                    
                }catch(Exception e1){
                    System.err.println(e1);
                }
        }
        if (e.getSource()==jButton5){
            JOptionPane.showMessageDialog(null,"Check your bill");
                try{//creating file name
                    String file_name = "C:\\Users\\Dell\\Desktop\\Bill\\customerBill.pdf";
                    Document document = new Document();
                    PdfWriter.getInstance(document,new FileOutputStream(file_name));
                    document.open();
                    //Add the content
        
                    Paragraph para1 = new Paragraph("Customer Bill");
                    document.add(para1);
                    Paragraph para2 = new Paragraph("******************************************************************");
                    document.add(para2);
                    Paragraph para3 = new Paragraph("Customer name = Yankee");
                    document.add(para3);
                    Paragraph para4 = new Paragraph("                      ");
                    document.add(para4);
        
                    //Add table
                    PdfPTable table=new PdfPTable(3);
                    PdfPCell c1 = new PdfPCell(new Phrase("Product"));
                    table.addCell(c1);
        
                    c1 = new PdfPCell(new Phrase("Quantity"));
                    table.addCell(c1);
        
                    c1 = new PdfPCell(new Phrase("Price"));
                    table.addCell(c1);
        
                //column1
                   table.addCell("Other Equipment");
                   //Column2
                   table.addCell("1");
                   //Column3
                   table.addCell("1000");
             
        
                    document.add(table);
        
                    document.close();
                    
                }catch(Exception e1){
                    System.err.println(e1);
                }
        }
    }
    // End of variables declaration
}
