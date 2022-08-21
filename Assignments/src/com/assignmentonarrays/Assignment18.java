/*	WAP to find max character in character array. Means e.g. 
	arr[]=[‘A’, ‘D’, ‘E’, ‘x’, ‘R’, ‘Z’, ‘p’],so max character is ‘x’.
*/

package com.assignmentonarrays;

public class Assignment18 {
	
	public void maxChar(char a[])
	{
		char max = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Maximum character is : "+max);
	}
	
	public static void main(String[] args) {
		char c[] = {'A','D','E','x','R','Z','p'};
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.println();
		
		Assignment18 o = new Assignment18();
		o.maxChar(c);
	}

}
