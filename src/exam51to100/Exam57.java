package exam51to100;

import java.util.concurrent.CyclicBarrier;

public class Exam57 {
    public static void main(String[] args) throws Exception {

        Master master = new Master();//line n2
        CyclicBarrier cb = new CyclicBarrier(1, master);
        Worker worker = new Worker(cb);
        worker.start();
    }

    static class Worker extends Thread {
        CyclicBarrier cb;

        public Worker(CyclicBarrier cb) {
            this.cb = cb;
        }

        @Override
        public void run() {
            try {
                cb.await();
                System.out.println("Worker…");
            } catch (Exception ex) {

            }
        }
    }

    static class Master implements Runnable { //line n1
        @Override
        public void run() {
            System.out.println("Master…");
        }
    }
}
