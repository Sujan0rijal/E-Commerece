import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class login extends JFrame implements ActionListener {
    JButton button_login,button_back;
    JLabel username,password,title;
    JTextField  textUsername;
    JPasswordField textPassword;
    JCheckBox checkBox;

    public login() {
        setTitle("Hamro Khelkud");
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setBackground(Color.black);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("src/sports.png").getImage());

        title = new JLabel("Hamro Khelkud");
        title.setFont(new Font("Monoid", Font.BOLD, 26));
        title.setBounds(150,5,200,40);
        add(title);

        button_back = new JButton("Back");
        button_back.setBackground(Color.red);
        button_back.setForeground(Color.white);
        button_back.setBounds(0,0,100,20);
        add(button_back);

        username = new JLabel("Username");
        username.setFont(new Font("Aerial", Font.BOLD, 14));
        username.setBounds(200,50,100,20);
        add(username);

        textUsername = new JTextField();
        textUsername.setBounds(200,80,100,20);
        add(textUsername);

        password = new JLabel("Password");
        password.setFont(new Font("Aerial", Font.BOLD, 14));
        password.setBounds(200,110,100,20);
        add(password);

        textPassword = new JPasswordField();
        textPassword.setBounds(200,140,100,20);
        add(textPassword);

        checkBox = new JCheckBox("show password");
        checkBox.setBounds(190,170,150,20);
        checkBox.setBackground(Color.lightGray);
        add(checkBox);

        button_login = new JButton("Login");
        button_login.setBounds(200,190,100,20);
        button_login.setBackground(Color.blue);
        button_login.setForeground(Color.white);
        add(button_login);

        setLayout(null);
        setVisible(true);
        setSize(600,400);
        getContentPane().setBackground(Color.lightGray);
        button_login.addActionListener(this);
        button_back.addActionListener(this);
        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    textPassword.setEchoChar((char) 0 );
                }
                else{
                    textPassword.setEchoChar('x');
                }

            }
        });
    }

    public static void main(String[] args) {
        login login = new login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(button_login)){
            dispose();
        }
        if(e.getSource().equals(button_back)){
            new Coverpage().setVisible(true);
            dispose();
        }

    }
}
