package java_basics_threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable processor1 = new MessageProcessor(2);
        executor.execute(processor1);

        Runnable processor2 = new MessageProcessor(7);
        executor.execute(processor2);

        Runnable processor3 = new MessageProcessor(4);
        executor.execute(processor3);

        Runnable processor4 = new MessageProcessor(15);
        executor.execute(processor4);

        executor.shutdown(); // Rejects any new tasks from being submitted. Gracefully shuts down the service

        /*while(!executor.isTerminated()){

        }*/
        executor.awaitTermination(10, TimeUnit.SECONDS);

        System.out.println("submitted all tasks...");
    }
}
