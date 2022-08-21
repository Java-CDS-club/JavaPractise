package com.interfacep;

interface Service{
	void provideService(String s);
}



public class LearnLambda {

	public static void main(String[] args) {
		Service ser = (String s)->System.out.println(s+" type service provided");
		ser.provideService("Courier");
		
		ser = (String s)->{
			System.out.println("Second object");
			System.out.println(s+" type service provided");
		};
		ser.provideService("Washing");

	}

}
