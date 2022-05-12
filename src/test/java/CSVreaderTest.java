import org.junit.Assert;

class CSVreaderTest {
    @org.junit.jupiter.api.Test
    void readEmptyFile() {
        CSVreader csv = new CSVreader();
        Assert.assertNull(csv.read(""));
    }

    @org.junit.jupiter.api.Test
    void readEmptyLine() {
        CSVreader csv = new CSVreader();
        Assert.assertNull(csv.read("D:\\вуз\\2\\java\\lab4_maven\\src\\main\\resources\\broken.csv"));
    }
}