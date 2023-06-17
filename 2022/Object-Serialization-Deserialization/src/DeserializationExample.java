import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Student_info implements Serializable{
    private static final long serialVersionUID = 1L;
    String name;
    String className;
    String rollNo;
    Student_info(String name, String className, String rollNo){
        this.className= className;
        this.name = name;
        this.rollNo = rollNo;
    }
}
class Test{
    public void objectDeserialization(){
        try{
            Student_info stu = null;
            FileInputStream fis = new FileInputStream("data.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            stu = (Student_info) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Name: " + stu.name);
            System.out.println("Class Name: " + stu.className);
            System.out.println("Roll No: " + stu.rollNo);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

public class DeserializationExample {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.objectDeserialization();
    }
}
