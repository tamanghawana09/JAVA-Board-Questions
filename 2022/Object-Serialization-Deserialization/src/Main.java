import java.io.*;
class Student implements Serializable{
    private String name;
    private int age;
    private String major;
    public Student(String name, int age, String major){
        this.age = age;
        this.major = major;
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }
}
public class Main {
    private static final String filePath = "student.ser";
    public void run(){
        //create an object to serialize
        Student student = new Student("Hawana Tamang", 20, "Computer Science");
        //serializing the object
        serializeObject(student,filePath);
        //deserializing the object
        Student deserializedStudent = (Student) deserializeObject(filePath);

        System.out.println("Deserialized Student:");
        System.out.println("Name: " + deserializedStudent.getName());
        System.out.println("Age: " + deserializedStudent.getAge());
        System.out.println("Major: " + deserializedStudent.getMajor());
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.run();

    }
    private static void serializeObject(Student student, String filePath){
        try(ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream(filePath))){
            objectOutput.writeObject(student);
            System.out.println("Object serialized and saved to" + filePath);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    private static Student deserializeObject(String filePath){
        try(ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(filePath))){
            Student student = (Student) objectInput.readObject();
            System.out.println("Object deserialized from " + filePath);
            return student;
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
            return null;
        }
    }
}