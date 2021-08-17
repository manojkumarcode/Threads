package com.thread;

public class DemoPriority extends Thread {

	@Override
	public void run() {

		System.out.println("In run method, name:  : " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		System.out.println("In main method, name: " + Thread.currentThread().getName());
		Thread thread = new DemoPriority();
		thread.setName("priority_thread");
		thread.setPriority(MAX_PRIORITY);
		// t.run();
		thread.start();
		System.out.println("At the end of main method, name: " + Thread.currentThread().getName());

	}

}
