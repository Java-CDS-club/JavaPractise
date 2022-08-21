package com.string;

import java.util.Arrays;

public class SumEvenDigit {

	public static void main(String[] args) {
       int sum=0;
       String str="af234asd324";
       char ch[]=str.toCharArray();
       System.out.println(Arrays.toString(ch));
       for(int i=0;i<ch.length;i++)
       {
    	   if(Character.isDigit(ch[i]))   
    	   {
    		   if(ch[i]%2==0)
    		   {
    			   sum+=Integer.parseInt(String.valueOf(str.charAt(i)));
    		   }		
    	   }	
        }
        System.out.println(sum);
	}
}
