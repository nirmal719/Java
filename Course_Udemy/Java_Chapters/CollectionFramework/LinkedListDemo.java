import java.util.LinkedList;

public class LinkedListDemo{
	public static void main(String [] args){
		LinkedList <String> link = new LinkedList<String> ();
		link.add("F");
		link.add("B");
		link.add("D");
		link.add("E");
		link.add("C");
		link.addLast("Z");
		link.addFirst("A");
		link.add(1,"A2");
		System.out.println("Original contents of List: " +link);
		link.remove("F");
		link.remove(2);
		System.out.println("After deletion contents of List: " +link);
		link.removeFirst();
		link.removeLast();
		System.out.println("After second deletion contents of List: " +link);
		String val = link.get(2);
		link.set(2,val + "Changed");
		System.out.println("After get and set contents of List: " +link);
	}
}