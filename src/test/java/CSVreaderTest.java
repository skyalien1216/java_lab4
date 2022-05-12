import org.junit.Assert;

class CSVreaderTest {
    @org.junit.jupiter.api.Test
    void readEmptyFile() {
        CSVreader csv = new CSVreader();
        Assert.assertNull(csv.read(""));
    }
}