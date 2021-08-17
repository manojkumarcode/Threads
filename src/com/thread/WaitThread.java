package com.thread;

public class WaitThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NotifyThread notifyThread = new NotifyThread(12, 12);
		notifyThread.start();
		
		
		try {
			synchronized(notifyThread) {
				notifyThread.wait();  // to use this I need to be owner of lock
			}
			System.out.println("total value: " + notifyThread.total);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}

}
