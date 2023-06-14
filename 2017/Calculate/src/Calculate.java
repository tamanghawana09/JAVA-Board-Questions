import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculate implements ActionListener {
    static JFrame frame = new JFrame("Calculate");
    static JLabel lbl1, lbl2,result;
    static JTextField tf1,tf2,tf3;
    static JButton btn1,btn2;

   public void layout(){
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);

        lbl1 = new JLabel();
        lbl1.setText("N1");
        lbl1.setBounds(10,10,100,40);
        frame.add(lbl1);

        lbl2 = new JLabel();
        lbl2.setText("N2");
        lbl2.setBounds(10,60,100,40);
        frame.add(lbl2);

        result = new JLabel();
        result.setText("Result");
        result.setBounds(10,110,100,40);
        frame.add(result);

        tf1 = new JTextField();
        tf1.setBounds(150,10,100,40);
        frame.add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(150,60,100,40);
        frame.add(tf2);

        tf3 =new JTextField();
        tf3.setBounds(150,110,100,40);
        frame.add(tf3);

        btn1 = new JButton("OK");
        btn1.setBounds(120,160,100,40);
        frame.add(btn1);
        btn1.addActionListener(this);

        btn2 = new JButton("EXIT");
        btn2.setBounds(250,160,100,40);
        frame.add(btn2);
        btn2.addActionListener(this);
    }

    public static void main(String[] args) {
        Calculate obj = new Calculate();
        obj.layout();
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn1){
            int num1 = Integer.parseInt(tf1.getText());
            int num2 = Integer.parseInt(tf2.getText());
            int num3 = num1 + num2;
            tf3.setText(String.valueOf(num3));
        }
        if(e.getSource() == btn2){
            System.exit(0);
        }
    }
}
