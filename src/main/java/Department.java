
public class Department {
    private int id;
    private char Name;

    public Department(int id, char name) {
        this.id = id;
        Name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", Name=" + Name +
                '}';
    }
}
