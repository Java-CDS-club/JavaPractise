//Write a java to check character is Vowel or not

package com.conditionalassignments;

import java.util.Scanner;

public class AssignmentCW4 {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Character: ");
		ch = sc.next().charAt(0);
		
		if((ch == 'a')||(ch == 'A')||(ch == 'e')||(ch == 'E')||(ch == 'i')||(ch == 'I')||(ch == 'o')||(ch == 'O')||(ch == 'u')||(ch == 'U'))
		{
			System.out.println("Its Vowel");
		}
		else
		{
			System.out.println("Its Consonant");
		}
		sc.close();
	}

}
