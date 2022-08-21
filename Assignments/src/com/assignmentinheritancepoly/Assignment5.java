/*	Create class IPLTeam with method play.
	Create child classes of IPLTeam called as CSK, RCB.
	In main, call play from child class objects.
*/

package com.assignmentinheritancepoly;

class IPLTeam{
	public void play()
	{
		System.out.println("Match Started...");
	}
}

class CSK extends IPLTeam{
	public void play()
	{
		super.play();
		System.out.println("CSK playing...");
	}
}

class RCB extends IPLTeam{
	public void play()
	{
		super.play();
		System.out.println("RCB playing...");
	}
}



public class Assignment5 {

	public static void main(String[] args) {
		IPLTeam obj = new CSK();
		obj.play();
		obj = new RCB();
		obj.play();

	}

}
