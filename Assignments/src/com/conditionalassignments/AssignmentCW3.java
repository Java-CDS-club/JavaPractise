//write a java program to find maximum of three numbers

package com.conditionalassignments;

import java.util.Scanner;

public class AssignmentCW3 {

	public static void main(String[] args) {
		int no1,no2,no3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		no1 = sc.nextInt();

		System.out.println("Enter Second Number: ");
		no2 = sc.nextInt();
		
		System.out.println("Enter Three Number: ");
		no3 = sc.nextInt();
		
		String msg = no1>no2&&no1>no3?"no1 is Maximum":(no2>no3)?"no2 is Maximum":"no3 is Maximum";
		System.out.println(msg);		
		sc.close();
		}

}
