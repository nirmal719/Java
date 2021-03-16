import java.util.*;

public class SpliteratorDemo{
	public static void main(String [] args){
		ArrayList<Integer> arrInt = new ArrayList<Integer>();
		arrInt.add(10);
		arrInt.add(20);
		arrInt.add(30);
		arrInt.add(40);
		arrInt.add(50);
		arrInt.add(1);
		Spliterator<Integer> split = arrInt.spliterator();
		//boolean isNext = split.tryAdvance(Consumer<Integer super T> action);
		System.out.print("The contents through Spliterator: " );
		split.forEachRemaining(System.out::println);
	}
}