/*	WAP to find min character in character array. Means e.g.
 	arr[]=[‘A’, ‘D’, ‘E’, ‘x’, ‘z’, ‘R’],so min character is ‘A’.
*/

package com.assignmentonarrays;

public class Assignment17 {
	
	public void minChar(char a[])
	{
		char min = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Minimum character is : "+min);
	}

	public static void main(String[] args) {
		char c[] = {'A','D','E','x','z','R'};
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.println();
		
		Assignment17 o = new Assignment17();
		o.minChar(c);
	}

}
