package com.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoExecutors {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		
		executorService.submit(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread name:" + Thread.currentThread().getName());
				
			}
		});
		
		executorService.submit(()->{
			System.out.println("inside Lambda - Thread name:" + Thread.currentThread().getName());
		});
		
		executorService.shutdown();
	}

}
