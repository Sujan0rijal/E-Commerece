import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Coverpage extends JFrame implements ActionListener {
    JButton button_login,button_signup;
    JLabel label,l1;


    public Coverpage() {


        setTitle("Hamro Khelkud");
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.black);
        setIconImage(new ImageIcon("src/sports.png").getImage());



        button_login = new JButton("Login");
        button_login.setBounds(400,20,100,20);
        button_login.setBackground(Color.blue);
        button_login.setForeground(Color.white);

        button_signup = new JButton("Sign up");
        button_signup.setBounds(500,20,100,20);
        button_signup.setBackground(Color.blue);
        button_signup.setForeground(Color.white);

        label = new JLabel("Hamro Khelkud");
        label.setBounds(200,250,200,20);
        label.setFont(new Font("Monoid", Font.BOLD, 24));
        label.setForeground(Color.MAGENTA);
        add(label);

        //add(One_frame);
        add(button_login);
        add(button_signup);

        setLayout(null);
        setVisible(true);
        setSize(600,400);

        button_login.addActionListener(this);
        button_signup.addActionListener(this);

    }
    public static void main(String[] args) {
        Coverpage coverpage = new Coverpage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(button_login)){
            new login().setVisible(true);
            dispose();
        }
        if (e.getSource().equals(button_signup)){
            new Registration().setVisible(true);
            dispose();
        }

    }
}
