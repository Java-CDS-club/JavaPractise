/*	WAP to have Department class created with id, name . 
 	Student class has roll, name and
	Department object should have id and name.
	Assign and print individual values in main method
*/

package com.assignmentoncontainment;

class Department{
	private int dId;
	private String dName;
	
	public int getDId()
	{
		return dId;
	}
	public void setDId(int dId)
	{
		this.dId = dId;
	}
	
	public String getDName()
	{
		return dName;
	}
	public void setDName(String dName)
	{
		this.dName = dName;
	}
	
	public String toString()
	{
		return "\nDepartment id : "+dId+"\nDepartment Name : "+dName;
	}
}

class Student{
	private int roll;
	private String sName;
	Department dpt;
	
	public int getRoll()
	{
		return roll;
	}
	public void setRoll(int roll)
	{
		this.roll = roll;
	}
	
	public String getSName()
	{
		return sName;
	}
	public void setSName(String sName)
	{
		this.sName = sName;
	}
	
	public Department getDpt()
	{
		return dpt;
	}
	public void setDpt(Department dpt)
	{
		this.dpt = dpt;
	}
	
	public String toString()
	{
		return "Student Roll no : "+roll+"\nStudent Name : "+sName+dpt;
	}
}


public class Assignment1 {
	
	public static void main(String[] args) {
				
		Department d = new Department();
		d.setDId(1);
		d.setDName("Computer");
		
		
		Student s = new Student();
		s.setRoll(101);
		s.setSName("RK");
		s.setDpt(d);
		System.out.println(s);
		
	}

}
