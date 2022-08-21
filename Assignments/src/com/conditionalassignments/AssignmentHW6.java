/*Write a Java program to input electricity consumption unit and calculate totalelectricity billaccording to the given condition:
For first 50 units Rs. 0.50/unit 
For next 100 units Rs. 0.75/unit 
For next 100 units Rs. 1.20/unit 
For unit above 250 Rs. 1.50/unit 
An additional surcharge of 20% is added to the bill
 */

package com.conditionalassignments;

import java.util.Scanner;

public class AssignmentHW6 {

	public static void main(String[] args) {
		int units,bill = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the units: ");
		units = sc.nextInt();
		
		if(units<50)
		{
			bill = (int) (units*0.50);
		}
		else if(units<=150)
		{
			bill = (int) ((50*0.50)+(50*0.75)+((units-50)*0.75));
		}
		else if(units<=250)
		{
			bill = (int) ((50*0.50)+(100*0.75)+(50*1.20)+((units-100)*1.20));
		}
		else if(units>=250)
		{
			bill = (int) ((50*0.50)+(100*0.75)+(100*1.20)+((units-250)*1.50));
		}
		System.out.println(bill);
		int totalBill = (int) (bill + (bill*0.2)); 
		System.out.println("Your total bill is "+totalBill);
		sc.close();
		
	}

}
