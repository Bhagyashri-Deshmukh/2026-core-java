package javaa.array.multidimensional;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array = new int [2][3];
		
		array[0][0] = 20;
		array[0][1] = 30;
		array[0][2] = 40;
		
		array[1][0] = 50;
		array[1][1] = 60;
		array[1][2] = 70;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
