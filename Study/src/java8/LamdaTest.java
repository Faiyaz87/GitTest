package java8;

import java.util.function.BiFunction;

public class LamdaTest {

	public static void main(String[] args) {
	
		BiFunction<Integer,Integer,Integer> bb = (a, b) -> a*b;
		
		System.out.println(bb.apply(10, 56));
		
	}

}
