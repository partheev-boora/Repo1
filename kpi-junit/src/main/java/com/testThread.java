package com;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
public class testThread {
 public static void main(String a[]) {
	 Executor executor =Executors.newCachedThreadPool();
	 executor.execute(new Task());
	 ThreadPoolExecutor pool=(ThreadPoolExecutor)executor;
	 pool.shutdown();
 }
 static public class Task implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				Long duration=(long) (Math.random()*5);
				System.out.println("Running Task");
				TimeUnit.SECONDS.sleep(duration);
				System.out.println("Execution completed");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
}
}
