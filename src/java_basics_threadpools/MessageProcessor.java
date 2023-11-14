package java_basics_threadpools;

public class MessageProcessor implements Runnable {

    private int message;

    public MessageProcessor(int message) {
        this.message = message;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + " [RECEIVED] Message = " + message);
        respondToMessaeg(); // make the thread to sleep to simulate doing some work
        System.out.println(Thread.currentThread().getName() + " (DONE) Processing Message = " + message);
    }

    private void respondToMessaeg() {
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            System.out.println("Unable to process message " + message);
        }
    }
}
