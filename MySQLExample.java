package lesson_6;
import java.sql.*;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class MySQLExample {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {


                try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/employees?createDatabaseIfNotExists=true&",
                "root",
                "root"

                 );
                Statement statement = connection.createStatement()


                ) {


                  ResultSet resultSet = statement.executeQuery("select * from employee");
                          while (resultSet.next()){
                              int employeeId = resultSet.getInt("id");
                              String login = resultSet.getNString("login");
                              String name = resultSet.getString("name");
                              String lastName = resultSet.getString("last_name");
                              String email = resultSet.getString("email");
                              int departmentId = resultSet.getInt("department_id");

                              System.out.println("Id:" + employeeId + ", login:" + login +
                                      ",name:" +  name + ",lastName:" + lastName +
                                      ",email" + email + ",department" + departmentId );
                          }

                }catch (SQLException e) {
                    throw new RuntimeException(e);
                }
    }
}