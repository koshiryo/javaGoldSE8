package exam151to166;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exam161 {

	static class ThreadRunner implements Runnable{

		public void run() {
			System.out.print("Runnable");
		}
		
	}
	
	static class ThreadCaller implements Callable{

		public Object call() throws Exception {
			System.out.print("Callable");
			return "Callable";
		}
		
	}
	
	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();
		Runnable r1 = new ThreadRunner();
		Callable c1 = new ThreadCaller();
		// line n1    submit可以接受Runnable和Callable，并且有返回值，execute只能接受Runnable，而且没有返回值
		es.submit(r1);
		Future<String> f1 = es.submit (c1);
		es.shutdown();
	}

}