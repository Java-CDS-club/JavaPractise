package com.inheritance;

class Doctor{
	int dId;
	String dName;
}

class Patient extends Doctor{
	int pId;
	String disease;
	
	public void details(int dId,String dName,int pId,String disease)
	{
		this.dId = dId;
		this.dName = dName;
		this.pId = pId;
		this.disease = disease;
	}
	
	public String toString()
	{
		return "Doctor Id: "+dId+"\nDoctor Name:"+dName+"\nPatient id : "+
				pId+"\nDisease Name: "+disease;
	}
}

public class SingleInheritance2 {

	public static void main(String[] args) {
		Patient p = new Patient();
		p.details(01, "Mr. Joe", 101, "Migraine");
		System.out.println(p);

	}

}
