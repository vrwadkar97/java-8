package com.annonymous.inner_class;

public class Multi_Threading {

	public static void main(String[] args) throws InterruptedException {
		Runnable r=new Runnable() {
			public void run() {
				int y=5;
				for(int x=1;x<=10;x++) {
					System.out.print(y*x+",");
				}
			}
		};
		
		Thread thread=new Thread(r);
		thread.start();
		
		thread.join();
		System.out.println();
		int y=2;
		for(int x=1;x<=10;x++) {
			System.out.print(y*x+",");
		}

	}

}
