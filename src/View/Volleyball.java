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
public class Volleyball extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form Volleyball
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Backbutton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          //Added button listner
          jButton1.addActionListener(this);
          jButton2.addActionListener(this);
          jButton3.addActionListener(this);
          jButton4.addActionListener(this);
          

        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("src//view//photo//volleyball//012.jpg")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 150, 120, 110);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("BUY");
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 330, 110, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon("src//view//photo//volleyball//013.jpg")); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(200, 150, 120, 110);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 153));
        jButton2.setText("BUY");
        jPanel1.add(jButton2);
        jButton2.setBounds(200, 330, 110, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon("src//view//photo//volleyball//014.jpg")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(380, 150, 130, 110);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 153));
        jButton3.setText("BUY");
        jPanel1.add(jButton3);
        jButton3.setBounds(400, 330, 110, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("src//view//photo//volleyball//17.jpg")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(570, 150, 150, 110);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 153));
        jButton4.setText("BUY");
        jPanel1.add(jButton4);
        jButton4.setBounds(600, 330, 100, 30);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(null);

        Backbutton.setBackground(new java.awt.Color(153, 153, 153));
        Backbutton.setForeground(new java.awt.Color(0, 0, 153));
        Backbutton.setText("Back");
        Backbutton.addActionListener(this);
        jPanel2.add(Backbutton);
        Backbutton.setBounds(650, 10, 73, 23);

        jLabel6.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("HAMRO KHELKUD");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 10, 210, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 770, 40);

        jLabel7.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 164, 191));
        jLabel7.setText("VOLLEYBALL");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(250, 50, 200, 60);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("Shoes");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 290, 70, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("Jersey");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(230, 290, 80, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setText("Knee Pads");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(410, 290, 80, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("Other Equipments");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(590, 290, 110, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon("src//view//photo//volleyball//10.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 740, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
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
    private javax.swing.JButton Backbutton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
            JOptionPane.showMessageDialog(null,"check your bill");
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
               table.addCell("shoes");
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
            JOptionPane.showMessageDialog(null,"check your bill");
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
               table.addCell("Jersery");
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
        if (e.getSource()==jButton3){
            JOptionPane.showMessageDialog(null,"check your bill");
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
               table.addCell("knee Pads");
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
