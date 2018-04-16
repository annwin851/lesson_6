package lesson_6;
import java.sql.Connection;


public class SQL {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        {
        }
    }
}
