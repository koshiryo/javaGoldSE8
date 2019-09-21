package exam151to166;

public class Exam166 {

    static class MyThread implements Runnable {

        private String src[] = {"A", "B", "C"};
        private int count = 0;                      // line n1

        public synchronized void run() {
            while (count < src.length) {
                System.out.println(src[count]);
                count++;
            }
        }
    }

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);
        t1.start();
        t2.start();
    }

}