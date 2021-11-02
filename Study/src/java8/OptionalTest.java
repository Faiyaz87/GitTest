package java8;

import java.util.Optional;
import java.util.Random;

public class OptionalTest {

	public static void main(String[] args) {
		System.out.println(">> "+testname().orElseGet( () ->  10000));

	}
	
	public static Optional<Integer> testname() {
		Random random = new Random();   
		int x = random.nextInt(50);
		Optional<Integer> rtnVal = Optional.of(x);

		return  rtnVal.filter( (v) ->  v <= 25);
		
		
	}

}
