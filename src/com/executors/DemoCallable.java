package com.executors;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoCallable {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		
		 Future<Integer> future = executorService.submit(()->{
			System.out.println("inside Lambda - Thread name:" + Thread.currentThread().getName());
			return 1000;
		});
		 
		int ans;
		
		try {
			ans = future.get();
			 System.out.println("ans:-" + ans);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<Callable<String>> callables = Arrays.asList(() -> "Tasks1", () -> "Tasks2",
		() -> "Java", 
		() -> "Callabale", () -> "Tasks2", () -> "Tasks3");
		
		try {
			executorService.invokeAll(callables).stream().map(fut -> {
				try {
					return fut.get();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
			}).forEach(System.out::println);;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		executorService.shutdown();
	}

}
