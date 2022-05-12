import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReaderBuilder;

import java.io.FileReader;
import java.util.ArrayList;
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
            while( (line = csvReader.readNext()) != null)
            {
                try{
                    //id, name, gender, dOB, department, salary
                    employees.add(new Employee(Integer.parseInt(line[0]), line[1], line[2], line[3],
                            new Department(line[4].charAt(0), line[4].charAt(0)), Integer.parseInt(line[5])));
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
