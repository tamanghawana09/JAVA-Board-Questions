import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student_in implements Serializable{
    private static final long serialVersionUTD =1L;
    String name;
    String className;
    String rollNo;
    Student_in(String name, String className, String rollNo){
        this.name = name;
        this.className = className;
        this.rollNo = rollNo;
    }

}
class Test_in{
    public void objectSerilization(Student_in student){
        try{
            FileOutputStream fos = new FileOutputStream("data.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(student);
            oos.close();
            fos.close();
            System.out.println("Serialized data is saved in data.ser");
        }catch(IOException e){

        }
    }

}
public class SerializationExample {
    public static void main(String[] args) {
        Student_in student = new Student_in("Hawana Tamang", "BIT", "5413");
        Test_in obj = new Test_in();
        obj.objectSerilization(student);
    }
}
