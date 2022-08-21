//Containtment aggregation using setter/constructor

package com.containment;

public class StayArrangments {

	public static void main(String[] args) {
//		OutHouse o = new OutHouse(1,50.50f);
//		Bungalow b = new Bungalow("Swarajya","RK",500.50f,o);

		OutHouse o = new OutHouse();
		o.setONo(101);
		o.setOArea(50f);
		
		Bungalow b = new Bungalow();
		b.setBName("Swarajya");
		b.setOwnerName("Rk");
		b.setArea(1000f);
		b.setOh(o);
		System.out.println(b);
	}
}
