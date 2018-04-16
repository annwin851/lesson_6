package lesson_6.dao;

import lesson_6.domain.Department;

import java.sql.SQLException;
import java.util.Collection;

public interface DepartmentDao {
//insert
    Department create (int id, String name, String city) throws SQLException;
    //update
    Department update (int id, String name, String city);
    //delete
    void delete (int id);
    //select * from department
    Collection <Department> findAll();

    Department findById(int id);


}
