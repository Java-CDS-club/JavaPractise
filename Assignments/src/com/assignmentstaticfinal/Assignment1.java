/*	Show 3 use of final - final class, final variable and final method*/

package com.assignmentstaticfinal;

final class Demo{
	final String s="Morning";
	public final void display()
	{
		System.out.println("Good "+s);
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.display();
	}
}
