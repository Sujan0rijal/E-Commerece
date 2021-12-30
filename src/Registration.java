

import javax.swing.*;

import java.awt.*;

import static java.awt.Color.gray;


public class Registration  extends JFrame {
    JLabel LblName,LblEmail,LblPassword,LblConfirmPassword,Lblicon,LblReg;
    JTextField TxtName,TxtEmail,TxtPassword,TxtConfirmPassword;
    JButton Register_button;

    Registration()
    {
        //Adding background image
        ImageIcon img = new ImageIcon("src/sports.png");
        JLabel Lblicon = new JLabel();
        ImageIcon imgg = new ImageIcon("src/sports.png");
        Lblicon.setIcon(imgg);
        Lblicon.setBounds(0,0,400,400);



        //Setting lable in the panel
        LblReg = new JLabel("REGISTRATION");
        LblReg.setBounds(130,0,120,60);
        LblReg.setFont(new Font("Arial",Font.BOLD,15));
        LblReg.setForeground(Color.cyan);

        LblName = new JLabel("USERNAME");
        LblName.setBounds(20,40,120,30);
        LblName.setFont(new Font("Arial",Font.BOLD,15));
        LblName.setForeground((Color.cyan));


        LblEmail = new JLabel("EMAIL");
        LblEmail.setBounds(20,100,120,30);
        LblEmail.setFont(new Font("Arial",Font.BOLD,15));
        LblEmail.setForeground(Color.CYAN);


        LblPassword = new JLabel("PASSWORD");
        LblPassword.setBounds(20,160,120,30);
        LblPassword.setFont(new Font("Arial",Font.BOLD,15));
        LblPassword.setForeground(Color.cyan);


        LblConfirmPassword = new JLabel("CONFIRM PASSWORD");
        LblConfirmPassword.setBounds(20,220,170,30);
        LblConfirmPassword.setFont(new Font("Arial",Font.BOLD,15));
        LblConfirmPassword.setForeground(Color.cyan);


        //Setting text field in panel

        TxtName = new JTextField();
        TxtName.setBounds(20,70,200,30);
        TxtEmail = new JTextField();
        TxtEmail.setBounds(20,130,200,30);
        TxtPassword = new JTextField();
        TxtPassword.setBounds(20,190,200,30);
        TxtConfirmPassword = new JTextField();
        TxtConfirmPassword.setBounds(20,250,200,30);


        //Setting Button in the panel

        Register_button = new JButton("REGISTER");
        Register_button.setBounds(45,300,130,30);
        Register_button.setForeground(Color.cyan);
        Register_button.setFont(new Font("Arial",Font.BOLD,15));

        //

        //Creating frame
        setTitle("Registration");
        setBounds(0,0,600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setBackground(gray);

        //Creating panel in the frame a
        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setBounds(100,80,400,400);
        panel.setLayout(null);
        //Adding lable in the panel
        panel.add(LblName);
        panel.add(LblEmail);
        panel.add(LblPassword);
        panel.add(LblConfirmPassword);
        panel.add(LblReg);



        //Adding textfield in panel
        panel.add(TxtName);
        panel.add(TxtEmail);
        panel.add(TxtPassword);
        panel.add(TxtConfirmPassword);

        //Adding button in panel
        panel.add(Register_button);


        //Adding image
        panel.add(Lblicon);
        //add(Lblicon);


        setLayout(null);
        setVisible(true);
        add(panel);



    }

    public static void main(String[] args) {
        Registration registration = new Registration();
    }
}