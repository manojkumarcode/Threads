package com.thread;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("In run method:" + Thread.currentThread());

	}

	public static void main(String[] args) {
		Runnable runnable = new MyRunnable();
		// runnable.start(); //this is not available.

		Thread thread = new Thread(runnable);
		thread.start();
	}

}
