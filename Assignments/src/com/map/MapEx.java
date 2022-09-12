package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		HashMap<String,String> mp = new HashMap<>();
		mp.put("Mr. Abc", "BJP");
		mp.put("Mr. Xyz", "NCP");
		mp.put("Mr. Ccc", "BJP");
		mp.put("Mr. Lll", "Shivsena");
		
		System.out.println(mp);
		
		HashMap<String,Integer> mp1 = new HashMap<>();
		Set<Entry<String,String>> entrySet = mp.entrySet();
		Iterator<Entry<String,String>> itr =entrySet.iterator();
		while(itr.hasNext())
		{
			Entry<String,String> e =itr.next();
			Integer val = mp1.getOrDefault(e.getValue(), 0);
			mp1.put(e.getValue(), val+1);
		}
	
		System.out.println(mp1);

	}

}
