package java8;

public class RunnableLamda {
	
	public static void main(String[] args) {
		Thread th = new Thread(() -> {
			
			System.out.println("Inside diffrent thread.");
		
		});

		th.start();
	}

}
