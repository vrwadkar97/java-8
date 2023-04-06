package com.static_methods;
/*Static methods:-From version 1.8 java included static methods in an Interface.
   So, these methods can be called from the implementing classes or even classes that doesn't implement the interface also.
   Static methods can be called to the classes by using Interface Object reference directly.
   
   From java version 1.8 onwards we can declare Main method into interface.
   
   The use of static methods in interface is to avoid loading the class for a method which doesnt't have any class object.
   So instead of calling method using class name we can declare such methods inside an interface and called
   wherever required using interface name. 
   
   Generally we define static methods inside an interface for utility purpose.
   so these methods can be treated as utility methods.
   
   Additionally as we don't require to load the class as it improves the performance.
  
    */
public interface Int_1 {
	
	 static void getData() {
		System.out.println("Hii from Inter_1 static"); 
	} 
	 

}
