import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    static JFrame frame = new JFrame("Calculate");
    static JTextField tf = new JTextField();
    static JTextField tf2 = new JTextField();
    static JButton btn = new JButton();
    public  void layout(){
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBackground(Color.BLACK);
        frame.setVisible(true);
        frame.setLayout(null);

        tf.setBounds(10,10,300,40);
        tf.setBackground(Color.WHITE);
        tf.setForeground(Color.BLACK);
        frame.add(tf);

        tf2.setBounds(10,60,300,40);
        tf2.setBackground(Color.WHITE);
        tf2.setForeground(Color.BLACK);
        frame.add(tf2);

        btn.setBounds(10,120,100,40);
        btn.setBackground(Color.WHITE);
        btn.setBackground(Color.BLACK);
        btn.setText("Square");
        frame.add(btn);

        btn.addActionListener(this);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.layout();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn)
        {
            int num = Integer.parseInt(tf.getText());
            int result = num*num;
            tf2.setText(String.valueOf(result));
        }
    }
}