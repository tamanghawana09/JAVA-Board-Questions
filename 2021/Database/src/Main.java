import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url ="jdbc:mysql://localhost/Student-Details";
        String username = "root";
        String password = "0107";
        Connection conn = DriverManager.getConnection(url,username,password);

        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM Student-table");

        while(rs.next()){
            int id = rs.getInt("Id");
            String name = rs.getString("Name");
            String address = rs.getString("Address");

            System.out.println("Id: " + id + "Name: " + name + "Address: " + address);
        }

    }
}