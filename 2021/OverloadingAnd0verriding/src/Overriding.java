import javax.crypto.spec.PSource;

class Animal{
    public void makeSound(){
        System.out.println("Animal makes sound");
    }
}
class cow extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Cow makes mooo sound");
    }
}
class dog extends cow{
    @Override
    public void makeSound() {
        System.out.println("Dog barks while making sound");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal obj = new Animal();
        dog obj1 = new dog();
        cow obj2 = new cow();
        obj.makeSound();
        obj1.makeSound();
        obj2.makeSound();
    }
}
