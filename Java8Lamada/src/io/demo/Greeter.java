/**
 * 
 */
package io.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author Avinash
 *
 */
public class Greeter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String>stringList = new ArrayList<>();
		stringList.add("abcde");
		stringList.add("abefg");
		stringList.add("aefde");
		stringList.add("abefje");
		List<String>foundList = new ArrayList<>();
		String toFind = "ef";
		for(String s : stringList){
			if(s.contains(toFind)){
				foundList.add(s);
			}
		}
		//System.out.println(foundList);
		
		int number =10;
		Greeting  myLambdaexp = (number) -> System.out.println();
		myLambdaexp.perform(number);
//		List<Student> students = Arrays.asList(
//							new Student(9001, "Avinash", "Singh"),
//							new Student(9002, "Akash", "Singh"),
//							new Student(9003, "Ankit", "Tiwari")
//							);
//		//printConditionally(students,(Student s)->true);
//		printConditionally(students,(s)->s.getSecondName().startsWith("S"),s->System.out.println(s.getSecondName()));
//		printConditionally(students,(s)->s.getFirstName().startsWith("A"),s->System.out.println(s.getFirstName()));
		
		
		
	}
	public static void printConditionally(List<Student> list,Predicate<Student> predicate,Consumer<Student> consumer){
		for(Student s : list){
			if(predicate.test(s))
				consumer.accept(s);
		}
	}
}
