package lesson_6.domain;

public class Department {

    private int departmentId;
    private String name;
    private String city;

    public Department (int department, String name, String city) {
        this.departmentId = departmentId;
        this.name = name;
        this.city = city;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}
