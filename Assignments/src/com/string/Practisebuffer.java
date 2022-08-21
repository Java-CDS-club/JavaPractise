package com.string;


public class Practisebuffer {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder(" Good ");

		sb1.append("Morning");
		System.out.println("After append : " +sb1);

		
		StringBuffer sb2 = new StringBuffer("Good ");
		sb2.insert(1, "Night");
		System.out.println("After Insert : "+sb2);

	
		StringBuffer sb3 = new StringBuffer("Good");
		sb3.replace(1, 3, "Bye");
		System.out.println("After replace :" +sb3);
	
		
		StringBuffer sb4 = new StringBuffer("Good");
		sb4.delete(1, 3);
		System.out.println("After delete : " +sb4);
    
	
		StringBuffer sb5 = new StringBuffer("Good");
		sb5.reverse();
		System.out.println(" Reverse : " +sb5);

	}

}
