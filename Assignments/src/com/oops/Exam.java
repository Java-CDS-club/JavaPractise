package com.oops;

public class Exam {
	public Semester calculateResult(Semester obj1,Semester obj2)
	{
		Semester finalResult = new Semester();
		finalResult.rollNo = obj1.rollNo;
		finalResult.marks1 = obj1.marks1+obj2.marks1;
		finalResult.marks2 = obj1.marks2+obj2.marks2;
		finalResult.marks3 = obj1.marks3+obj2.marks3;
				
		return finalResult;		
	}

	public static void main(String[] args) {
		Exam e = new Exam();
		
		Semester s1,s2;
		s1 = new Semester();
		s1.acceptDetails();
		s1.showDetails();
		
		s2 = new Semester();
		s2.acceptDetails();
		s2.showDetails();
		
		System.out.println("----------------------------");
		System.out.println("Final Result is: ");
		Semester res = e.calculateResult(s1,s2);
		res.showDetails();
		
		Semester.sc.close();	
	}
}
