package com.hb.TP;

public class ThreadTest implements Runnable {
	 private int i;
	 ThreadTest(int i) {
		 i = i; 
	 }
	 
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		System.out.println("Fabien "+i);
	}

}
