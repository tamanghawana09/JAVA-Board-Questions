import java.sql.*;

public class connectingDatabase {
    public static void main(String[] args){
      String url ="jdbc:mysql://localhost/employee-income";
      String username = "root";
      String password = "0107";
      try(Connection conn = DriverManager.getConnection(url,username,password)){
          Statement stm = conn.createStatement();
          ResultSet rs = stm.executeQuery("SELECT * FROM income_table");
          while(rs.next()){
              int id = rs.getInt("id");
              String name = rs.getString("name");
              String address = rs.getString("address");

              System.out.println("Id: " + id + "Name: " + name + "Address: " + address);
          }
      }catch(SQLException e) {
          System.out.println("Error: Unable to connect to the database");
      }


    }
}
