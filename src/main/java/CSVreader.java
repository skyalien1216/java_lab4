import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReaderBuilder;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVreader implements ReadStrategy {
    /**
     * Reads data from CSV file
     * @param filepath path of the file
     * @return list of read employees
     */
    @Override
    public List<Employee> read(String filepath) {
        if(filepath.equals(""))
            return null;

        List<Employee> employees = new ArrayList<>();
        try {
            FileReader filereader = new FileReader(filepath);
            CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
            com.opencsv.CSVReader csvReader = new CSVReaderBuilder(filereader)
                    .withCSVParser(parser)
                    .withSkipLines(1)
                    .build();

            String[] line;
            int i =0;
            while( (line = csvReader.readNext()) != null)
            {
                try{
                    int id = Integer.parseInt(line[0]);
                    int salary = Integer.parseInt(line[5]);
                    String name = line[1];
                    String gender = line[2];
                    String dob = line[3];
                    char dep = line[4].charAt(0);

                    if(name.equals("") || gender.equals("") || dob.equals("") || line[4].equals(""))
                        throw new Exception("Broken File");
                    employees.add(new Employee(id, name, gender, dob, new Department(dep, dep), salary));
                }
                catch (Exception e){
                    return null;
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return employees;
    }
}
