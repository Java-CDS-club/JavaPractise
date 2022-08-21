//Write a Java program to input any alphabet and check whether it is vowel or consonant 

package com.conditionalassignments;

import java.util.Scanner;

public class AssignmentSwitch3 {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character: ");
		ch = sc.next().charAt(0);
		
		switch(ch)
		{
		case 'a':
		{
			System.out.println("Its Vowel");
			break;
		}
		case 'e':
		{
			System.out.println("Its Vowel");
			break;
		}
		case 'i':
		{
			System.out.println("Its Vowel");
			break;
		}		
		case 'o':
		{
			System.out.println("Its Vowel");
			break;
		}
		case 'u':
		{
			System.out.println("Its Vowel");
			break;
		}		
		case 'A':
		{
			System.out.println("Its Vowel");
			break;
		}		
		case 'E':
		{
			System.out.println("Its Vowel");
			break;
		}
		case 'I':
		{
			System.out.println("Its Vowel");
			break;
		}		
		case 'O':
		{
			System.out.println("Its Vowel");
			break;
		}
		case 'U':
		{
			System.out.println("Its Vowel");
			break;
		}
		default:
		{
			System.out.println("Its Consonant");
		}
		
		}
		sc.close();

	}

}
