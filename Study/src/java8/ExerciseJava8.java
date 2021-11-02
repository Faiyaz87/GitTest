package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ExerciseJava8 {

	public static void main(String[] args) {
		List<Person> list = Arrays.asList(
				new Person("Faiyaz", "Ahmed", 33),
				new Person("Dollar", "Ahmed", 29),
				new Person("Alfaz", "Ahmed", 28),
				new Person("Aiyaz", "Ahmed", 2)
				);
		//list.forEach(per -> System.out.println(per));	

		list.stream()
		.filter(p -> p.getFname().startsWith("F"))
		.forEach(System.out::println);
		
		
		
		//list.forEach(per -> System.out.println(per));	
		
/*
		printList(list, p -> true);
		
		// Sort
		Collections.sort(list, (p1,p2) -> p1.getAge().compareTo(p2.getAge()));
		
		
		
		
		printList(list,p -> p.getFname().startsWith("A"));

*/
	}

	private static void printList(List<Person> list, Predicate<Person> condition) {
		System.out.println("--------------------------------------------");
		for (Person person : list) {
			if (condition.test(person)) {
				System.out.println(person.toString());
			}
			
		}
	}

}


