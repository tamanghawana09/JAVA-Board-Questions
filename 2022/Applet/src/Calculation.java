import java.applet.Applet;
import java.awt.*;

public class Calculation extends Applet {
    int x = 2;
    int y = 3;
    public void paint(Graphics g){
        super.paint(g);
        int result = calculateNumber(x,y);
        String output = x + "^" + y + " = " + result;
        g.drawString(output,10,20);
    }
    private int calculateNumber(int b, int e){
        int result = 1;
        for(int i=0;i<e;i++){
            result *= b;
        }
        return result;
    }


}
