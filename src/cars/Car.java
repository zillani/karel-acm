package cars;

public class Car {
	
	String model;
	int dimensions;
	String color;
	
	
	public static int getDimension() {
		return 123;
	}
	public static String getmodel() {
		getDimension();
		return "Mustang";
	}
	
	public static void main(String []args) {
		getmodel();
	}
	
}
