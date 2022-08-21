package com.collection.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Assignment {
	

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<>();
		l.add(21);
		l.add(11);
		l.add(31);
		l.add(41);
		l.add(51);
		l.add(11);
		l.add(21);
		
		for(int i=0;i<l.size();i++)
		{
			System.out.print(l.get(i)+" ");
		}
		System.out.println();
		
		//3. WAP to append the specified element to the end of a linked list.
		l.add(61);
		System.out.println(l);
		
		//4. WAP to iterate through all elements in a linked list.
		System.out.println("Using Iterator : ");
		Iterator<Integer> itr = l.iterator();
		for(;itr.hasNext();)
		{
			Integer i = itr.next();
			System.out.print(i+" ");	
		}
		
		System.out.println();
		
		
		//5. WAP to iterate a linked list in reverse order.
		System.out.println("Reverse LinkedList : ");
		ListIterator<Integer> litr;
		for(litr=l.listIterator(l.size());litr.hasPrevious();)
		{
			Integer no = litr.previous();
			System.out.print(no+" ");
		}	
		
		System.out.println("\nUsing while :");
		ListIterator<Integer> litr1 = l.listIterator(l.size());
		while(litr1.hasPrevious())
		{
			Integer i = litr1.previous();
			if(i == 11)
			{
				litr1.add(111);
				//litr1.set(111);
			}
			System.out.print(i+" ");
		}
/*		
		//6. WAP to insert the specified element at the specified position in the linked list.
		l.add(2, 71);
		System.out.println("\n"+l);
		
		//7. WAP to insert elements into the linked list at the first and last position.
		System.out.println("After adding first and last index element : ");
		l.addFirst(01);
		l.addLast(81);
		System.out.println(l);
		
		//8. WAP to insert the specified element at the front of a linked list.
		//9. WAP to insert the specified element at the end of a linked list.
		l.offerFirst(100);
		l.offerLast(100);
		System.out.println(l);
		
		//10. WAP to get the first and last occurrence of the specified elements in a linked list.
		
		System.out.println("First occurence of 11 is : "+l.indexOf(11));
		System.out.println("Last occurence of 11 is : "+l.lastIndexOf(11));
		
		//11. WAP to display the elements and their positions in a linked list.
		System.out.println("Display Position and there Element : ");
		for(int i=0;i<l.size();i++)
		{
			System.out.print(i+" : "+l.get(i)+"|");
		}
		
		//12. WAP to remove a specified element from a linked list.
		l.remove(0);
		System.out.println("\nAfter removing specified index 0 : "+l);
		
		//13. WAP to remove first and last element from a linked list.
		l.removeFirst();
		l.removeLast();
		System.out.println("\n"+l);
		
		//14. WAP to remove all the elements from a linked list.
//		l.removeAll(l);
//		System.out.println(l);
		
		//15. WAP of swap two elements in a linked list.
		int x = l.indexOf(11);
		int y =l.indexOf(81);
		
		for(int i =0;i<l.size();i++)
		{
			if(i==x)
			{
				l.set(i, 81);
			}
			else if(i == y)
			{
				l.set(i, 11);
			}
		}
		
//		Collections.swap(l, x, y);
		System.out.println("After swapping 11 and 81 :");
		System.out.println(l);
		
		//16. WAP to shuffle the elements in a linked list.
		Collections.shuffle(l);
		System.out.println("After shuffle :"+"\n"+l);
		
		//17. WAP to join two linked lists.
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(null);
		l1.addAll(l);
		System.out.println("L1 : \n"+l1);
		
		//18. WAP to clone a linked list to another linked list.
		LinkedList<Integer>l2 = new LinkedList<>();
		Object o= l.clone();
		System.out.println("Integer : "+o);
		System.out.println("Clone copy : "+l1.clone());
		
		//19. WAP to remove and return the first element of a linked list.
		System.out.println("Remove and return first element : "+l.removeFirst());
		
		//20. WAP to retrieve but does not remove, the first element of a linked list.
		System.out.println("Retriev but does not remove first element : "+l.element());
		
		//21. WAP to retrieve but does not remove, the last element of a linked list.
		System.out.println("Retriev but does not remove last element : "+l.peekLast());
		
		//22. WAP to check if a particular element exists in a linked list.
		System.out.println("61 is present or not : "+l.contains(61));
		
		//23. WAP to convert a linked list to array list.
		ArrayList<Integer> al = new ArrayList<>();
		al.addAll(l);
		System.out.println("ArrayList : "+al);
		
		
		
		System.out.println("l : "+l);
		System.out.println("l1 : "+l1);
		System.out.println("l2 : "+l2);
		
		//24. WAP to compare two linked lists.
		for(Integer i : l1)
		{
			l2.add(l.contains(i)? 1 : 0);
		}
		System.out.println("Yes : 1 No : 0 "+l2);
		
		//25. WAP to test a linked list is empty or not.
		System.out.println("List l is Empty : "+l.isEmpty());
		
		//26. WAP to replace an element in a linked list.
		l.set(5, 31);
		System.out.println("After replacing 61 : "+l);
*/		
	}

}
