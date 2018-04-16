package lesson_6;

import java.sql.*;

public class JDBC {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
                } catch (ClassNotFoundException e) {
                   throw new RuntimeException(e);
                 }
         }

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/employees?serverTimezone=UTC&useSSL=false",
                                 "root",
                                "root"
                                );
             Statement statement = connection.createStatement()
                            ) {

            ResultSet result = statement.executeQuery("SELECT * FROM employee");
            while (result.next()) {
                int employeeId = result.getInt("employee_id");
                                String login = result.getString("login");
                                String name = result.getString("name");
                                String lastName = result.getString("last_name");
                                String email = result.getString("email");
                                int departmentId = result.getInt("department_id");


                System.out.println("employeeId: " + employeeId + ", login: " + login +
                                               ", name: " + name + ", lastName: " + lastName + ", email: " + email +
                                               ", departmentId: " + departmentId);
                               System.out.println();
                           }
        } catch (SQLException exc) {
                        throw new RuntimeException(exc);
                   }

                    }

        }