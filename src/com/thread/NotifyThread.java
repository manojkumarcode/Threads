package com.thread;

public class NotifyThread extends Thread {
	
	public static int total = 0;
	private int x,y;
	
	public NotifyThread(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	

	@Override
	public void run() {

		System.out.println("In run method, name:  : " + Thread.currentThread().getName());
		synchronized (this) {
			total = x+y;
			notify();
		}
		
	}


}
