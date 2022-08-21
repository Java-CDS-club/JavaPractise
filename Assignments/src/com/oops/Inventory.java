package com.oops;

//import java.util.Arrays;

public class Inventory {
	
	public void acceptDetails(Item s[])
	{
		s[0] = new Item(10000,"Mobile","nokia");
		s[1] = new Item(80000,"Laptop","Dell");
		s[2] = new Item(40000,"Desktop","Asus");
		s[3] = new Item(10000,"Headphone","Voat");
		s[4] = new Item(80000,"Charger","MI");
		//showItems(s);
		showSameCostItem(s);
	}
	
	public void showItems(Item arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].cost>2000)
			{
				System.out.println(arr[i]);
				System.out.println("___________________________________________________________________________________");

			}

		}
	}
	
	public void showSameCostItem(Item arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].cost==arr[j].cost)
				{
					System.out.println(arr[i]);
					System.out.println(arr[j]);
					System.out.println();
				}
			}

		}
	}
	

//	public void showDetail(Item obj)
//	{
//		System.out.println("Item id : "+obj.itemId);
//		System.out.println("Item Name : "+obj.itemName);
//		System.out.println("Supplier name : "+obj.suppName);
//		System.out.println("Item Price : "+obj.cost);
//	}	
	
	public static void main(String[] args) {		
		
		//Item i,i1;
		
//		i = new Item();
//		i.showItemDetails();
//		i.calculateBill(2);
//		Item.changeGst(0.30f);
		
		Item s[] = new Item[5];
		
		
		//System.out.println(Arrays.toString(s));
		
		Inventory o = new Inventory();
		o.acceptDetails(s);
		
		
		//i1 = new Item(50000,"LapTop","Dell");
		//System.out.println(i1);
//		i1.showItemDetails();
//		i1.calculateBill(5);
		
//		System.out.println("Total Item object Count is: "+Item.objectCnt);
				
		
		
		
		
		
		
		
		
		
//		i =new Item();
//		i.setItemId(101);
//		i.setItemName("Mobile");
//		i.setSuppName("SamSung");
//		i.setCost(10000);
//		
//		System.out.println("Item id is: "+i.getItemId());
//		System.out.println("Item Name is: "+i.getItemName());
//		System.out.println("Item Supplier Name is: "+i.getSuppName());
//		System.out.println("Item Cost is: "+i.getCost());
		
		
		
		
//		i.acceptItemDetails(1, "Clothes","ABC", 1000);
//		i.showItemDetails();
//		System.out.println("---------------------");
//		i1 =new Item();
//		i1.acceptItemDetails(2, "Machine","IGK", 2000);
//		i1.showItemDetails();
//		System.out.println("---------------------");
//		i2 = new Item();
//		i2.itemId = i.itemId;
//		i2.itemName = i.itemName;
//		i2.suppName = i.suppName;
//		i2.cost = i.cost;
//		i2.showItemDetails();
//		System.out.println("-----------------------");
//		i3=i1;
//		i3.showItemDetails();
//		
//		System.out.println("Hash code of i is:"+i.hashCode());
//		System.out.println("Hash code of i1 is:"+i1.hashCode());
//		System.out.println("Hash code of i2 is:"+i2.hashCode());
//		System.out.println("Hash code of i3 is:"+i3.hashCode());
//		
//		System.out.println("-----------------------------");
//		Inventory a = new Inventory();
//		a.showDetail(i);
	
	}
}
