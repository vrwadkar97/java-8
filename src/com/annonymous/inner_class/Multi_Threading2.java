package com.annonymous.inner_class;

public class Multi_Threading2 {

	public static void main(String[] args) throws InterruptedException {
		Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
		        int y=5;
				for(int x=1;x<=10;x++) {
					System.out.print(x*y+",");
				}
				
			}
		});
thread.start();
thread.join();
System.out.println();
int y=3;
for(int x=1;x<=10;x++) {
	System.out.print(x*y+",");
}
	}

}
