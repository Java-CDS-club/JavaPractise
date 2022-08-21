/*	WAJP2 create a class Kid with method readBook() 
 	and another method readBook () with 2 parameters.
 	The method readBook here is over-loaded (same method name but different parameters) */

package com.assignmentinheritancepoly;

class Kid{
	
	public void readBook()
	{
		System.out.println("Book Reading");
	}
	
	public void readBook(String s,String s1)
	{
		System.out.println(s+" and "+s1+" both books are super");
	}
}

class BigKid extends Kid{
	public void readBook(String s,String s1)
	{
		super.readBook(s, s1);
		System.out.println(s+" "+s1+" Books finished..");
	}
}

public class AssignmentP1 {

	public static void main(String[] args) {
		Kid obj = new BigKid();
		obj.readBook();
		obj.readBook("Ramayan", "Mahabharat");

	}

}
