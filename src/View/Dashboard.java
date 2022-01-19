package View;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.red;
import static java.awt.Color.white;


public class Dashboard  extends JFrame implements ActionListener {
    JLabel sports;

    JButton button_cricket,button_football,button_basketball,button_tabletennis,button_golf, button_volleyball;


    Dashboard()
    {
        //Adding background image
        ImageIcon img = new ImageIcon("src/view/MicrosoftTeams-image.png");
        JLabel Lbl_icon = new JLabel();
        ImageIcon imgg = new ImageIcon("src/view/MicrosoftTeams-image.png");
        Lbl_icon.setIcon(imgg);
        Lbl_icon.setBounds(0,0,600,400);

        //Setting lable in the panel
        sports = new JLabel("SPORTS");
        sports.setBounds(250,0,120,60);
        sports.setFont(new Font("Arial",Font.BOLD,21));
        sports.setForeground(Color.cyan);




        //Setting Button in the panel

        button_cricket= new JButton("Cricket");
        button_cricket.setBounds(20,50,140,40);
        button_cricket.setForeground(Color.BLACK);
        button_cricket.setFont(new Font("Arial",Font.BOLD,15));

        button_football = new JButton("Football");
        button_football.setBounds(400,50,140,40);
        button_football.setForeground(Color.BLACK);
        button_football.setFont(new Font("Arial",Font.BOLD,15));

        button_basketball = new JButton("Basketball");
        button_basketball .setBounds(20,150,140,40);
        button_basketball .setForeground(Color.BLACK);
        button_basketball .setFont(new Font("Arial",Font.BOLD,15));

        button_tabletennis = new JButton("Table Tennis");
        button_tabletennis.setBounds(400,150,140,40);
        button_tabletennis.setForeground(Color.BLACK);
        button_tabletennis.setFont(new Font("Arial",Font.BOLD,15));

        button_golf = new JButton("Golf");
        button_golf.setBounds(20,250,140,40);
        button_golf.setForeground(Color.BLACK);
        button_golf.setFont(new Font("Arial",Font.BOLD,15));

        button_volleyball = new JButton("Volleyball");
        button_volleyball.setBounds(400,250,140,40);
        button_volleyball.setForeground(Color.BLACK);
        button_volleyball.setFont(new Font("Arial",Font.BOLD,15));



        //Creating frame
        setTitle("Hamro Khelkud");
        setBounds(0,0,600,400);
        setIconImage(new ImageIcon("src/view/sports.png").getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setBackground(white);

        //Creating panel in the frame a
        JPanel panel = new JPanel();
        panel.setBackground(white);
        panel.setBounds(0,0,600,400);
        panel.setLayout(null);
        //Adding lable in the panel
        panel.add(sports);


        //Adding button in panel
        panel.add(button_cricket);
        panel.add(button_football);
        panel.add(button_basketball);
        panel.add(button_golf);
        panel.add(button_tabletennis);
        panel.add(button_volleyball);


        button_cricket.addActionListener(this);
        button_football.addActionListener(this);
        button_basketball.addActionListener(this);
        button_golf.addActionListener(this);
        button_tabletennis.addActionListener(this);
        button_volleyball.addActionListener(this);

        //Adding image
        panel.add(Lbl_icon);
        //add(Lbl_icon);




        setLayout(null);
        setVisible(true);
        add(panel);



    }

    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button_cricket){
            new Dashboard().setVisible(true);
            dispose();
        }
        if (e.getSource() == button_football){
            new Dashboard().setVisible(true);
            dispose();
        }

        if (e.getSource() == button_basketball){
            new Dashboard().setVisible(true);
            dispose();
        }
        if (e.getSource() == button_tabletennis){
            new Dashboard().setVisible(true);
            dispose();
        }
        if (e.getSource() == button_golf){
            new Dashboard().setVisible(true);
            dispose();
        }
        if (e.getSource() == button_volleyball){
            new Dashboard().setVisible(true);
            dispose();
        }
    }
}
