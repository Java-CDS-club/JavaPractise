/*	Create a class FinalDemo.
 	In class Final Demo, declare a member variable x of type int. Declare it as final. 
 	In main method, 
	a.	create an object of type FinalDemo. Try to change the value of x. 
	b.	Now declare and implement a method method2 and make it final. 
		Create a class FinalDemoChild which extends Final Demo.
		In FinalDemoChild, try to override the method method2
	c.	Now declare the class FinalDemoChild as final and
		try to extend the class FinalDemoChild
*/

package com.assignmentstaticfinal;

class FinalDemo{
	final int x=10;
	
	public final void method2()
	{
		System.out.println("Final method");
	}
}

final class FinalDemoChild extends FinalDemo{
	
	//Cannot override the final method from FinalDemo
//	public final void method2()
//	{
//		System.out.println("Final override method");
//	}
}

	//The type Demo cannot subclass the final class FinalDemoChild
//	class Demo extends FinalDemoChild{
//	
//	}


public class Assignment2 {

	public static void main(String[] args) {
		FinalDemo f = new FinalDemo();
		f.method2();
		//we cannot modify final variable
//		f.x=20;

	}

}
