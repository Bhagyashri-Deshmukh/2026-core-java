package javaa.collection.map;

import java.util.HashMap;

public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm1 = new HashMap<Integer,String>();
		HashMap<Integer, String> hm2 = new HashMap<>();
		
		hm1.put(1, "One");
		hm1.put(2, "Two");
		hm1.put(3, "Three");
		hm1.put(4, "Four");
		
		hm2.put(1, "One");
		hm2.put(2, "Two");
		hm2.put(3, "Three");
		hm2.put(4, "Four");
		
		System.out.println("Mappings of hash map 1 are : "+hm1);
		
		System.out.println("Mappings of hash map 2 are : "+hm2);
	}

}
