package com.interfacep;

public class PrintingPress {

	public static void main(String[] args) {
		Edit e = new Magzine();
		e.read();
		e.write();
		e.update();
		System.out.println("------------------------");
		e = new NewsPaper();
		e.read();
		e.update();
		System.out.println("--------------------------");
		Book b = new Book(101,"C++","Balguru",800);
		System.out.println(b);
		b.published("Language");
		
		Magzine m = new Magzine(101,"C","Dennis Ritchie",800);
		System.out.println(m);
		m.published("Programming");
		

	}

}
