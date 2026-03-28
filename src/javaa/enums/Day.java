package javaa.enums;

public enum Day {

	Monday{
		public String getNumber() {
			return "1 st day";
		}
	},
	
	Friday{
		public String getNumber() {
			return "5 th day";
		}
	};
	
	public abstract String getNumber();
}
