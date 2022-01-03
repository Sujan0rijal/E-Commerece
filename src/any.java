import javax.swing.*;
import java.awt.*;

public class any extends JFrame {

    JLabel label;

    public any(){
        setTitle("Sujan");
        setSize(600,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());

        setContentPane(new JLabel(new ImageIcon("D:\\vaccination card\\sujan.jpg")));
        setLayout(new FlowLayout());
        label = new JLabel();
        add(label);
        setSize(600,400);
    }

    public static void main(String[] args) {
        new any();
    }

}
