

public class Employee {
    private int id;
    private String name;
    private String gender;
    private Department department;
    private int salary;
    private String dateOfBirth;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", department=" + department.toString() +
                ", salary=" + salary +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    public Employee(int id, String name, String gender, String dateOfBirth, Department department, int salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    public int getDepartmentID()
    {
        return this.department.getId();
    }
}
