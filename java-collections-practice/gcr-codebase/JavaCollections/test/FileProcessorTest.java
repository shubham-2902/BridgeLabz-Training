import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.JUnit.FileProcessor;

import java.io.File;
import java.io.IOException;

class FileProcessorTest {

    private final String TEST_FILE = "testfile.txt";
    private FileProcessor processor = new FileProcessor();

    @AfterEach
    void cleanUp() {
        File file = new File(TEST_FILE);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello JUnit";

        processor.writeToFile(TEST_FILE, content);
        String result = processor.readFromFile(TEST_FILE);

        assertEquals(content, result);
    }

    @Test
    void testFileExistsAfterWrite() throws IOException {
        processor.writeToFile(TEST_FILE, "Data");
        assertTrue(processor.fileExists(TEST_FILE));
    }

    @Test
    void testReadNonExistingFileThrowsException() {
        assertThrows(IOException.class, () -> {
            processor.readFromFile("nofile.txt");
        });
    }
}