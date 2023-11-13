package java_basics_producer_consumer_pattern;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Integer> questionList = new ArrayList<>();

        Thread t1 = new Thread(new Producer(questionList));

        Thread t2 = new Thread(new Consumer(questionList));

        // starting threads
        /*     Also comments       */
        t1.start();
        t2.start();


    }

}
