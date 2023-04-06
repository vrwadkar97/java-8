package com.lambda_multi_threading;

public class A {
	//so here we have used lambda expression to call the run() method of Runnable interface with its implementation.

	public static void main(String[] args) throws InterruptedException {
		Runnable r=()->{  
			for(int x=1;x<=10;x++) {
				System.out.println("Hii from child thread");
			}
		};
		
		Thread thread=new Thread(r);
		thread.start();
		
		thread.join();
		
		for(int x=1;x<=5;x++) {
			System.out.println("Hii from Main thread");
		}

	}

}
