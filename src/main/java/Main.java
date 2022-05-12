import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        String filepath = "D:\\вуз\\2\\java\\lab4_maven\\src\\main\\resources\\foreign_names_1.csv";

        Employees empl = new Employees();
        empl.setReader(new CSVreader());

        empl.readEmployees(filepath);

        List<Employee> employees = empl.getEmployees();

        if(employees != null)
        {
            for(Employee employee : employees)
                if(employee.getDepartmentID() == 65)
                    System.out.println(employee.toString());
        }
        else
           System.out.println("Error while reading!");
    }
}
