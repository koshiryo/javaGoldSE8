package exam101to150;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class Exam132 {
	public static void main(String[] args) {
		final List<String> list = new CopyOnWriteArrayList<>();
		final AtomicInteger ai = new AtomicInteger(0);
		final CyclicBarrier barrier = new CyclicBarrier(2, new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "+++++++" +list);
			}
		});
		Runnable r = new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(1000 * ai.incrementAndGet());
					System.out.println(Thread.currentThread().getName() + "********" + ai);
					list.add("X");
					System.out.println(Thread.currentThread().getName() + "********" + list);
					barrier.await();
				} catch (Exception ex) {

				}
			}
		};
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();

	}
}
