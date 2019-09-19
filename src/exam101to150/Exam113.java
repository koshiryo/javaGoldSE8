package exam101to150;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exam113 {
    static class R implements Runnable {

        @Override
        public void run() {
            System.out.println("Run...");
        }
    }

    static class C implements Callable<String> {

        @Override
        public String call() throws Exception {
            return "Call...";
        }
    }

    public static void main(String[] args) {
        ExecutorService es = Executors.newSingleThreadScheduledExecutor();
        es.execute(new R());									//line n1
        Future<String> f1 = es.submit(new C());					//line n2
        try {
            System.out.println(f1.get());
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        es.shutdown();
    }
}
