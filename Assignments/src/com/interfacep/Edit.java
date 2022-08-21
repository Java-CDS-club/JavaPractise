package com.interfacep;

public interface Edit {
	void read();
	void update();
	default void write() {
		System.out.println("Writing..");
	}

}

class Magzine extends Book implements Edit{
	Magzine(){}
	Magzine(int bId,String bName, String authorName,float price)
	{
		super(bId,bName,authorName,price);	
	}
	public void read()
	{
		System.out.println("Reading magzine");
	}
	
	public void update()
	{
		System.out.println("Some changes in article");
	}
	
	public void write()
	{
		System.out.println("Writing Magzing..");
	}
}

class NewsPaper implements Edit{
	public void read()
	{
		System.out.println("Reading newspaper");
	}
	public void update()
	{
		System.out.println("Some chnages in news");
		write();
	}
}

class Book{
	int bId;
	String bName,authorName;
	float price;
	
	Book(){}
	Book(int bId,String bName,String authorName,float price)
	{
		this.bId = bId;
		this.bName = bName;
		this.authorName = authorName;
		this.price = price;
	}
	
	public void published(String publicatiom)
	{
		System.out.println("Publication : "+publicatiom);
	}
	
	public String toString()
	{
		return "Id : "+bId+"\nName : "+bName+"\nAuthor Name : "+authorName+"\nPrice : "+price;
	}
}


