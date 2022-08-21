package com.innerclass;

abstract class ClubHouse{
	abstract public void conductGames();
}

interface Decorate{
	void makeDecoration();
}


public class Society {
	int sRid;
	String sName,sAddress;
	Society(){}
	Society(int sRid,String sName,String sAddress)
	{
		this.sRid = sRid;
		this.sName = sName;
		this.sAddress = sAddress;
	}
	public void showSocietyDetails()
	{
		System.out.println("Society Register Id : "+sRid);
		System.out.println("Society Name : "+sName);
		System.out.println("Society Address : "+sAddress);
	}
	
	class Flat{
		int fNo;
		String fOwnerName;
		Flat(){}
		Flat(int fNo,String fOwnerName)
		{
			this.fNo = fNo;
			this.fOwnerName = fOwnerName;
		}
		public void showFlatDetails()
		{
			showSocietyDetails();
			System.out.println("Flat No : "+fNo);
			System.out.println("Flat Owner Name is : "+fOwnerName);
		}
	}
	

	
	public void playGames()
	{
//		ClubHouse a = new ClubHouse()
		new ClubHouse()
		{
			public void conductGames()
			{
				System.out.println("Games conducted..");
			}
		}.conductGames();
		//a.conductGames();
	}
	
	
	public void performTask()
	{
		Decorate d = new Decorate()
//		new Decorate()
		{
			public void makeDecoration()
			{
				System.out.println("Decoration completed");
				makeClubHouseReady();
			}
			public void makeClubHouseReady()
			{
				System.out.println("Club house ready..");
			}
		};//.makeDecoration();
		d.makeDecoration();
	}
	
	
	
	public static void main(String args[]) {
		Society  s = new Society();
//		s.playGames();
		s.performTask();
	}

}
