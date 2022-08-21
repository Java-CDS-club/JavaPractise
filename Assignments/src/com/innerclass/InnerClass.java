package com.innerclass;


public class InnerClass {

	public static void main(String[] args) {
		Bank b = new Bank("SBI","SBIN0000336");
		Bank.Locker l = b.new Locker(1010101,"Zp Road");
		l.lockerInfo();
		Bank.RBIRules r = new Bank.RBIRules("Initial value 75$");
		r.showRulesApplicable();
		
		Society s = new Society(1001,"Shivai","Dhule");
		Society.Flat f = s.new Flat(601,"Rk"); 
		f.showFlatDetails();

	}

}
