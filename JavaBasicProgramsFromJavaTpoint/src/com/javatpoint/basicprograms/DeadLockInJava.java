package com.javatpoint.basicprograms;

public class DeadLockInJava {

	public static void main(String[] args) {
		final String resource1 = "Esmail Paltasingh";
		final String resource2 = "Prasanna Paltasingh";
		Thread t1 = new Thread() {
			public void run() {
			synchronized(resource1) {
				System.out.println("Thread1: Locked resource1");
				try {
					Thread.sleep(1000);
				}catch(Exception e) {
					System.out.println(e);
				}
				synchronized(resource2) {
					System.out.println("Thread1: Locked resource2");
				}
			}
		  }
		};
		
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized(resource2) {
					System.out.println("Thread2: locked resource2");
					try {
						Thread.sleep(1000);
					}catch(Exception e) {
						System.out.println(e);
					}
					
					synchronized(resource1) {
						System.out.println("Thread2: locked resource1");
					}
				}
			}
		};
		t1.start();
		t2.start();

	}

}
