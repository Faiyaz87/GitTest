package java8;

public class LamdaFinction {

	public static void main(String[] args) {
		
		GrettingIntf greet = new GrettingHI();
		greet.perform();
		
		greet = ()-> System.out.println("Hello world from Lamda.");
		greet.perform();
		
	}

}
