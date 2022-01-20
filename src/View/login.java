package View;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.red;
import static java.awt.Color.white;


public class login  extends JFrame implements ActionListener {
    JLabel Username,Password,login;
    JTextField textusername,textpassword;
    JButton buttonlogin,button_back;
    JCheckBox checkBox;

    login()
    {
        //Adding background image
        ImageIcon img = new ImageIcon("src/view/photo/MicrosoftTeams-image.png");
        JLabel Lblicon = new JLabel();
        ImageIcon imgg = new ImageIcon("src/view/photo/MicrosoftTeams-image.png");
        Lblicon.setIcon(imgg);
        Lblicon.setBounds(0,0,600,400);



        //Setting lable in the panel
        login = new JLabel("LOGIN PAGE");
        login.setBounds(250,0,120,60);
        login.setFont(new Font("Arial",Font.BOLD,15));
        login.setForeground(Color.cyan);

        Username = new JLabel("USERNAME");
        Username.setBounds(200,100,120,30);
        Username.setFont(new Font("Arial",Font.BOLD,15));
        Username.setForeground((Color.cyan));


        Password = new JLabel("PASSWORD");
        Password.setBounds(200,160,120,30);
        Password.setFont(new Font("Arial",Font.BOLD,15));
        Password.setForeground(Color.cyan);


        //Setting text field in panel

        textusername = new JTextField();
        textusername.setBounds(200,130,200,30);
        textpassword = new JTextField();
        textpassword.setBounds(200,190,200,30);
        checkBox = new JCheckBox("Check password");
        checkBox.setBounds(200,220,100,30);


        //Setting Button in the panel

        buttonlogin = new JButton("LOGIN");
        buttonlogin.setBounds(215,300,130,30);
        buttonlogin.setForeground(Color.BLACK);
        buttonlogin.setFont(new Font("Arial",Font.BOLD,15));

        button_back = new JButton("Back");
        button_back.setForeground(white);
        button_back.setBackground(red);
        button_back.setBounds(0,0,100,20);
        add(button_back);        //

        //Creating frame
        setTitle("Hamro Khelkud");
        setBounds(0,0,600,400);
        setIconImage(new ImageIcon("src/view/photo/sports.png").getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setBackground(white);

        //Creating panel in the frame a
        JPanel panel = new JPanel();
        panel.setBackground(white);
        panel.setBounds(0,0,600,400);
        panel.setLayout(null);
        //Adding lable in the panel
        panel.add(Username);
        panel.add(Password);
        panel.add(login);
        panel.add(checkBox);



        //Adding textfield in panel
        panel.add(textusername);
        panel.add(textpassword);

        //Adding button in panel
        panel.add(buttonlogin);

        button_back.addActionListener(this);
        buttonlogin.addActionListener(this);

        //Adding image
        panel.add(Lblicon);
        //add(Lblicon);


        setLayout(null);
        setVisible(true);
        add(panel);



    }

    public static void main(String[] args) {
        new login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button_back){
            new Coverpage().setVisible(true);
            dispose();
        }
        if(e.getSource() == buttonlogin){
            JOptionPane.showMessageDialog(null,"login as " + textusername);
            dispose();
        }
    }
}
