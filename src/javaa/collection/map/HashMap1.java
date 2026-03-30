package javaa.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Neha", 25);
		hashMap.put("Pinki", 35);
		hashMap.put("Kiran", 45);
		
		for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			
			System.out.println("Key is : "+entry.getKey()+", value is: "+entry.getValue());
		}
	}

}
