package javaa.array.singledimentional;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array [] = new int[5];
		int count = 0;
		
		for(int i=0;i<array.length;i++) {
			array[i] = count ++;
		}
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
