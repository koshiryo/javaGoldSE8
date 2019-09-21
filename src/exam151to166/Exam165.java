package exam151to166;

public class Exam165 {

    static class MyClass implements Runnable {

        public int value;

        @Override
        public synchronized void run() {
            while (value < 100) {
                value++;
                System.out.println("value: " + value);
            }
        }
    }

    public static void main(String[] args) {
        MyClass mc = new MyClass();
        Thread a = new Thread(mc);
        a.start();
        Thread b = new Thread(mc);
        b.start();
    }

}