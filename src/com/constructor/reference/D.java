package com.constructor.reference;

public interface D {
	//We must match the argument of constructor of class C to the argument of this method.
	
	//here this method has String argument so constructor of the C class must have same type of argument i.e of String type
	public C get(String s);

}
