import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url ="jdbc:mysql://localhost:3306/students";
        String User = "root";
        String Password = "secret";
        Connection conn = DriverManager.getConnection(url,User,Password);

        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM student-table");
        while(rs.next()){
            int id = rs.getInt("Id");
            String name = rs.getString("Name");
            String address = rs.getString("Address");
            int contactNo = rs.getInt("Contact No");

            System.out.println("Id: " + id + "Name: " + name + "Address: " + address + "Contact No: " + contactNo );
            conn.close();
        }

    }
}