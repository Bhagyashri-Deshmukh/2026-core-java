package javaa.innerClass.anonymousClass;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo = new Demo() {
			
			@Override
			public void dispaly() {
				super.dispaly();
			}
		};
		
		demo.dispaly();
	}

}
