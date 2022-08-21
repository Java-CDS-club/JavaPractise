package com.innerclass;

public class Bank {
	String bName,ifscCode;
	int x= 1000;
	Bank(){};
	Bank(String bName, String ifscCode)
	{
		this.bName = bName;
		this.ifscCode = ifscCode;
	}
	public void showBankDetails()
	{
		System.out.println(bName+" has IFSC code : "+ifscCode);
		Bank.RBIRules r = new Bank.RBIRules("Rs 1 to equivalent 80$");
		r.showRulesApplicable();
	}
	
	//Static Inner Class
	static class RBIRules{
		String rule;
		RBIRules(String rule)
		{
			this.rule = rule;
			System.out.println("RBI Rule initialized");
		}
		public void showRulesApplicable()
		{
			System.out.println(rule);
//			System.out.println(bName); // we can access only static variable of outer class in static inner class
		}
	}
	
	//Simple Inner Class
	class Locker{
		int lId,x=100;
		String lLocation;
		Locker(){}
		Locker(int iId, String lLocation)
		{
			this.lId = iId;
			this.lLocation = lLocation;
		}
		
		
		public void lockerInfo()
		{
			//int x= 10;
			//showBankDetails();
			System.out.println("Locker system id is : "+lId);
			System.out.println("Locker system available is available at loation : "+lLocation);
			
			System.out.println("Local : "+x);
			System.out.println("Locker: "+this.x);
			System.out.println("Bank : "+Bank.this.x);
		}
	}
	public static void main(String args[])
	{
		Locker lo = new Bank("BOI","BOI101").new Locker(1111,"D");
		lo.lockerInfo();
	}

}
