package com.lambda_multi_threading;

public class B {

	public static void main(String[] args) throws InterruptedException {
		Runnable r=()->{
			int y=5;
			for(int x=1;x<=10;x++) {
				System.out.print(x*y+" ");
			}
		};
		
		Thread thread=new Thread(r);
		thread.start();
		thread.join();
		
		System.out.println();
		
		int y=2;
		for(int x=1;x<=10;x++) {
			System.out.print(x*y+" ");
		}

	}

}
