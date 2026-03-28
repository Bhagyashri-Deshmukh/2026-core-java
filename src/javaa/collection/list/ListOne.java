package javaa.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("Python");
		list.add("C");
		list.add("CPP");
		list.add("C");
		list.add(null);
		list.add(null);
		list.add(null);
		
		for(String s : list) {
			System.out.println(s);
		}
		
		list.add(1, "Java8");
		
		System.out.println(list);
		
		list.set(2, "Spring");
		
		System.out.println("\nNew List :");
		System.out.println(list);
		
		int i = list.indexOf("C");
		System.out.println("First occurence of c is : "+i);
		
		int j = list.lastIndexOf("C");
		System.out.println("Last index of c is : "+j);
		
		list.remove(3);
		
		System.out.println("\nAfter removing c :");
		System.out.println(list);
		
		String first = list.get(0);
		String second = list.get(1);
		
		System.out.println(first+" is first and second is : "+second);
	}

}
