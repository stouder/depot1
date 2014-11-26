package com.hb.TP;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Test {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(new ThreadTest(i));
			// t.start();
		}

		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(5);

		ScheduledFuture<?> res = scheduler.schedule(new Thread(new ThreadTest(1)),2, TimeUnit.SECONDS);
		
		try {
			if (res.get() == null)
				scheduler.shutdown();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
