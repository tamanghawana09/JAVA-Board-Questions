import java.sql.*;

public class Database {
    public static void main(String[] args) {
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           String url = "jdbc:mysql://localhost/Morang-Student";
           String username ="root";
           String password ="0107";
           Connection conn = DriverManager.getConnection(url,username,password);
           Statement stm = conn.createStatement();
           ResultSet rs = stm.executeQuery("SELECT * FROM Student-table");
           while(rs.next()){
               int ID = rs.getInt("Id");
               String name = rs.getString("name");
               String district = rs.getString("district");
               int age =rs.getInt("age");


               System.out.println("Id: " + ID + "Name: " + name + "District: " + district + "Age: " + age);
           }
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
