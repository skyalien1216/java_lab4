
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class CSVreaderTest {
    @org.junit.jupiter.api.Test
    void readEmptyFile() {
        CSVreader csv = new CSVreader();
        assertNull(csv.read(""));
    }

    @org.junit.jupiter.api.Test
    void readEmptyLine() {
        CSVreader csv = new CSVreader();
        assertNull(csv.read("D:\\vsu\\2\\java\\lab4_maven\\src\\main\\resources\\broken.csv"));
    }

    @org.junit.jupiter.api.Test
    void readLine() {
        CSVreader csv = new CSVreader();
        assertEquals(new Employee(28281, "Aahan", "Male", "15.05.1970", new Department('I', 'I'), 4800), csv.read("D:\\vsu\\2\\java\\lab4_maven\\src\\main\\resources\\foreign_names.csv").get(0));
    }
}