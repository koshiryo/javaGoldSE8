package exam1to50;

import java.util.concurrent.atomic.AtomicInteger;

public class Exam21 {

	static class MyThread implements Runnable {

		private static AtomicInteger count = new AtomicInteger(0);

		public void run() {
			int x = count.incrementAndGet();
			System.out.print(x + " ");
		}
	}

	public static void main(String[] args) throws Exception {
		Thread thread1 = new Thread(new MyThread());
		Thread thread2 = new Thread(new MyThread());
		Thread thread3 = new Thread(new MyThread());
		Thread[] ta = { thread1, thread2, thread3 };
		for (int x = 0; x < 3; x++) {
			ta[x].start();
		}
	}

}
