package com.thread;

public class Mythread1 extends Thread {
	
	@Override
    public void run() {
		System.out.println("In run method, name:  : " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		System.out.println("In main method, name: " + Thread.currentThread().getName());
		Thread t = new Mythread1();
		//t.run();
		t.start();

	}

}
