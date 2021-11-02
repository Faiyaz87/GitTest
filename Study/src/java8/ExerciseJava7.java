package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ExerciseJava7 {

	public static void main(String[] args) {
		List<Person> list = Arrays.asList(
				new Person("Faiyaz", "Ahmed", 33),
				new Person("Aiyaz", "Ahmed", 2),
				new Person("Dollar", "Ahmed", 29),
				new Person("Alfaz", "Ahmed", 28)
				);
				
		 // print all 
		/*for (Person person : list) {
			System.out.println(person.toString());
		}*/
		
		
		// Sort
		/*list.sort(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge().compareTo(o2.getAge());
			}
			
		});*/
		
		
		
		
		printList(list,"A");


	}

	private static void printList(List<Person> list, String startsWith) {
		System.out.println("--------------------------------------------");
		for (Person person : list) {
			if (person.getFname().startsWith(startsWith)) {
				System.out.println(person.toString());
			}
			
		}
	}

}
