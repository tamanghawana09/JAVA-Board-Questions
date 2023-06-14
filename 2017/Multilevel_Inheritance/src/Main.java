class Shape{
    public void display(){
        System.out.println("Inside display");
        System.out.println("Inside shape class");
    }
}
class Rectangle extends Shape{
    public void area(){
        System.out.println("Inside the area");
        System.out.println("This is a sub class Rectangle");
    }
}
class Cube extends Rectangle{
    public void volume(){
        System.out.println("Inside volume");
        System.out.println("This is a sub class Cube");
    }
}


public class Main {
    public static void main(String[] args)
    {
        Cube cube = new Cube();
        cube.display();
        cube.area();
        cube.volume();
    }
}