package thread;

public class SharedObj {
	
	private int counter = 0;
	
	public int inc() {
		return this.counter++;
	}
	
	
	public int get() {
		return this.counter;
	}
}
