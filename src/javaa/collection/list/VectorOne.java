package javaa.collection.list;

import java.util.Vector;

public class VectorOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vector = new Vector<Integer>(2);
		
		System.out.println("Initial capacity : "+vector.capacity());
		
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);
		
		// vector doubles the capacity
		System.out.println("capacity after adding 5 element : "+vector.capacity());
	}

}
