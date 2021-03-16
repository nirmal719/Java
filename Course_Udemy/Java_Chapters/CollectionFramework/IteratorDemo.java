import java.util.*;

public class IteratorDemo{
	public static void main(String [] args){
		ArrayList <String> arr = new ArrayList<String> ();
		arr.add("F");
		arr.add("A");
		arr.add("B");
		arr.add("U");
		arr.add("O");
		arr.add("C");
		arr.add("D");
		System.out.print("original contents of arraylist: ");
		Iterator<String> itr = arr.iterator();
		while(itr.hasNext()){
			String element = itr.next();
			System.out.print(" " +element);
		}
		System.out.println();
		ListIterator<String> listr = arr.listIterator();
		while(listr.hasNext()){
			String element = listr.next();
			listr.set("+" + element);
		}
		Iterator<String> itr1 = arr.iterator();
		System.out.print("contents after modification: ");
		while(itr1.hasNext()){
			String element = itr1.next();
			System.out.print(" " +element);
		}
		System.out.println();
		System.out.print("elements in reverse order: ");
		while(listr.hasPrevious()){
			String element = listr.previous();
			System.out.print(" " +element);
		}
		System.out.println();
		
	}
}