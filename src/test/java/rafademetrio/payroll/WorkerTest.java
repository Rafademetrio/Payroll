package rafademetrio.payroll;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import rafademetrio.payroll.model.Worker;
import rafademetrio.payroll.service.WorkerService;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class WorkerTest {

    @Autowired
    private WorkerService workerService;


    @Test
    public void verifyIfOnlyOneEmailIsSaved(){
        Worker worker1 = new Worker(null, "Jose", "jose@gmail.com","123123",12.4F,null);
        Worker worker2 = new Worker(null, "Joaquim", "jose@gmail.com","abc123", 20.4F,null);

        workerService.create(worker1);

        assertThrows(IllegalArgumentException.class, () -> {
            workerService.create(worker2);
        });

    }


}
