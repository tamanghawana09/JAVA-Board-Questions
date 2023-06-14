import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        //components
        JLabel north = new JLabel("North Region");
        JLabel south = new JLabel("South Region");
        JLabel east = new JLabel("East Region");
        JLabel west = new JLabel("West Region");
        JLabel center = new JLabel("Center Region");

        frame.setLayout(new BorderLayout());

        //adding components to the container
        frame.add(north, BorderLayout.NORTH);
        frame.add(south, BorderLayout.SOUTH);
        frame.add(east,BorderLayout.EAST);
        frame.add(west,BorderLayout.WEST);
        frame.add(center,BorderLayout.CENTER);

        frame.setVisible(true);
    }
}