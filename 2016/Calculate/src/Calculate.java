import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculate implements ActionListener{
    static JFrame frame = new JFrame("Calculate");
    static JLabel lbl = new JLabel();
    static JLabel lbl2 = new JLabel();
    static JLabel lbl3 = new JLabel();
    static JLabel lbl4 = new JLabel();
    static JButton btn = new JButton();
    static JButton btn2 = new JButton();
    static JTextField tf1 = new JTextField();
    static JTextField tf2 = new JTextField();
    static JTextField tf3 = new JTextField();
    public static void main(String[] args){
        //this is for size of the frame and its layout
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  //it closes the whole operation while closing
        frame.setVisible(true);
        frame.setLayout(null);

        //this is for the label inside the frame
        lbl.setText("Calculate");
        lbl.setBounds(10,10,100,40);
        frame.add(lbl); //this code adds label in the frame

        lbl2.setText("First Number: ");
        lbl2.setBounds(10,60,100,40);
        frame.add(lbl2);

        lbl3.setText("Second Number: ");
        lbl3.setBounds(10,110,100,40);
        frame.add(lbl3);

        lbl4.setText("Result: ");
        lbl4.setBounds(10,160,100,40);
        frame.add(lbl4);

        tf1.setBounds(120,60,200,40);
        tf1.setBackground(Color.GRAY);
        tf1.setForeground(Color.WHITE);
        frame.add(tf1);

        tf2.setBounds(120,110,200,40);
        tf2.setBackground(Color.GRAY);
        tf2.setForeground(Color.WHITE);
        frame.add(tf2);

        tf3.setBounds(120,160,200,40);
        tf3.setBackground(Color.GRAY);
        tf3.setForeground(Color.WHITE);
        frame.add(tf3);

        Calculate obj = new Calculate();
        obj.button();       // making an object of the class Calculator for calling the function of calculator

    }
    public void button(){
        //this for adding button
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.WHITE);
        btn.setText("Add");
        btn.setBounds(50,250,100,30);
        frame.add(btn);
        btn.addActionListener(this);

        btn2.setBackground(Color.ORANGE);
        btn2.setForeground(Color.BLACK);
        btn2.setText("Subtract");
        btn2.setBounds(200,250,100,30);
        frame.add(btn2);
        btn2.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn)
        {
            int num1 = Integer.parseInt(tf1.getText());
            int num2 = Integer.parseInt(tf2.getText());
            int num3 = num1 + num2;
            tf3.setText(String.valueOf(num3));
        }
        if(e.getSource() == btn2){
            int n1 = Integer.parseInt(tf1.getText());
            int n2 = Integer.parseInt(tf2.getText());
            int n3 = n1 - n2;
            tf3.setText(String.valueOf(n3));
        }
    }
}
