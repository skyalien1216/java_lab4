import java.util.Objects;

public class Department {
    private int id;
    private char Name;

    public Department(int id, char name) {
        this.id = id;
        Name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return getId() == that.getId() && Name == that.Name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), Name);
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
