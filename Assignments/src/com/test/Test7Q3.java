/*	Institute has different courses . Each course contains different subjects.
 	Create list of different courses containing different subjects and display it.*/

package com.test;

import java.util.ArrayList;


class Institute{
	String course,subject;
	
	Institute(){}
	
	Institute(String course,String subject)
	{
		this.course = course;
		this.subject = subject;
	}
	
	public String toString()
	{
		return "Course : "+course+" Subject : "+subject+"\n";
	}
}

public class Test7Q3 {
	
	ArrayList<Institute> l = new ArrayList<>();
	
	public void addEle()
	{
		l.add(new Institute("BCA","Java,C,C++"));
		l.add(new Institute("MBA","ERP,Management"));
		l.add(new Institute("MCA","C,C++,SOA,MAD"));
		System.out.println(l);
	}

	public static void main(String[] args) {
		Test7Q3 obj = new Test7Q3();
		obj.addEle();

	}

}
