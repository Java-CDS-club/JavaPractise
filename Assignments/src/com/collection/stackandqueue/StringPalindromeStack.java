package com.collection.stackandqueue;

import java.util.Stack;

public class StringPalindromeStack {
	String s = "Good bye bye Good";
	String str[] = s.split(" ");
	String s1;
	
	public void createStack()
	{
		Stack<String> st = new Stack<>();
		for(int i=0;i<str.length;i++)
		{
			st.push(str[i]);
		}
		System.out.println(st);
		for(int i=0;i<st.size();i++)
		{
			s1+=st.pop();
			System.out.println(s1);
		}
//		System.out.println(s);
//		System.out.println(s1);
		if(s.equals(s1))
			System.out.println("Palindrome");
	}

	public static void main(String[] args) {
		StringPalindromeStack obj  = new StringPalindromeStack();
		obj.createStack();
		/*
		  	System.out.print("Enter any string:");
	        Scanner in=new Scanner(System.in);
	        String str = in.nextLine();
	        Stack<Character> s = new Stack<Character>();

	        for (int i = 0; i < str.length(); i++) {
	            s.push(str.charAt(i));
	        }

	        String rstring = "";

	        while (!s.isEmpty()) {
	            rstring = rstring+s.pop();
	        }

	        if (str.equals(rstring))
	            System.out.println("The input String is a palindrome.");
	        else
	            System.out.println("The input String is not a palindrome.");*/
		
	}

}
