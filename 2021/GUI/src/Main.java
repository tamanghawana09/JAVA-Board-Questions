import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener{
    JFrame frame = new JFrame("Calculate");
    JTextField tf1 = new JTextField();
    JTextField tf2 = new JTextField();
    JTextField tf3 = new JTextField();
    JLabel lbl1 = new JLabel();
    JLabel lbl2 = new JLabel();
    JLabel lbl3 = new JLabel();
    JButton btn1 = new JButton();
    JButton btn2 = new JButton();

    public void layout(){
     frame.setSize(600,600);
     frame.setBackground(Color.BLACK);
     frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     frame.setVisible(true);
     frame.setLayout(null);

     lbl1.setBounds(10,10,100,30);
     lbl1.setText("First Number: ");
     frame.add(lbl1);

     lbl2.setBounds(10,50,100,30);
     lbl2.setText("Second Number: ");
     frame.add(lbl2);

     lbl3.setText("Result: ");
     lbl3.setBounds(10,100,100,30);
     frame.add(lbl3);

     tf1.setBounds(150,10,100,30);
     tf2.setBounds(150,50,100,30);
     tf3.setBounds(150,100,100,30);
     frame.add(tf1);
     frame.add(tf2);
     frame.add(tf3);

     btn1.setText("OK");
     btn1.setBackground(Color.BLUE);
     btn1.setForeground(Color.WHITE);
     btn1.setBounds(150,200,100,30);
     frame.add(btn1);
     btn1.addActionListener(this);

     btn2.setText("EXIT");
     btn2.setBackground(Color.RED);
     btn2.setForeground(Color.WHITE);
     btn2.setBounds(300,200,100,30);
     frame.add(btn2);
     btn2.addActionListener(this);

    }
    public static void main(String[] args) {
     Main obj = new Main();
     obj.layout();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn1){
            int num1 = Integer.parseInt(tf1.getText());
            int num2 = Integer.parseInt(tf2.getText());
            int result = num1*num2;
            tf3.setText(String.valueOf(result));
        }
        if(e.getSource() == btn2){
            System.exit(0);
        }
    }
}