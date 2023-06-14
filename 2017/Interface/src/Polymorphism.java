interface Drawable{
    void draw();
}
class Circle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Drawing a Rectangle");
    }

}
public class Polymorphism {
    public static void main(String[] args) {
        Drawable shape1 = new Rectangle();
        Drawable shape2 = new Circle();
        shape1.draw();
        shape2.draw();
    }
}
