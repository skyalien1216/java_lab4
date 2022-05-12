import java.util.ArrayList;
import java.util.List;

public class Employees {

    private List<Employee> employees;
    private ReadStrategy reader;

    /**
     * Sets the strategy for reading
     * @param reader strategy
     */
    public void setReader(ReadStrategy reader) {
        this.reader = reader;
    }

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    /**
     * Reads employees with specified reader
     * @param filepath path to file
     */
    public void readEmployees(String filepath)
    {
        employees = reader.read(filepath);
    }
}
