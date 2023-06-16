import java.util.Scanner;

class areaOfCircle{
    public double area(int r){
        double pie = 3.14;
        double result = pie*r*r;
        return result;
    }
}
public class Main extends areaOfCircle {
    public static void main(String[] args) {
        Main obj = new Main();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = input.nextInt();
        System.out.println("The area of circle is: " + obj.area(radius));

    }
}