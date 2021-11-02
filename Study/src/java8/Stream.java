package java8;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {

	public static void main(String[] args) {
		List<Integer> list2 = Arrays.asList();
		List<Integer> list = Arrays.asList(1,2,5,88,88,90,454);
		
		
		/*
		list.stream()
		.filter(i -> (i%2)==0 )
		.map(i -> i*88)
		.forEach(System.out::println);
		
		*/
		
		 List<Integer> res = list.stream().distinct().limit(5).collect(Collectors.toList());
		
		System.out.println(res);

		//.forEach(System.out::println);

	}

}
