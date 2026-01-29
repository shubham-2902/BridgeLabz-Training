import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.JUnit.TaskService;

import java.util.concurrent.TimeUnit;


class TaskServiceTest {

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTaskTimeout() throws InterruptedException {
        TaskService service = new TaskService();
        service.longRunningTask();
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void testLongRunningTaskPasses() throws InterruptedException {
        TaskService service = new TaskService();
        String result = service.longRunningTask();
        assertEquals("Task Completed", result);
    }
}