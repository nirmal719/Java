import java.util.*;

public class ArrayListCollection{
	public static void main(String [] args){
	try{
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.println("Initial arraylist size: "+arr.size());
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(60);
		System.out.println("arraylist elements: "+arr);
		System.out.println("after insertion arraylist size: "+arr.size());
		List<Integer> l = new ArrayList<>();
		l.add(109);
		l.add(2000);
		l.add(19920);
		arr.addAll(1,l);
		System.out.println(arr);
		Integer in = l.get(2);
		System.out.println(in);
		int num = l.indexOf(1992);
		System.out.println(num);
		int numl = l.lastIndexOf(19920);
		System.out.println(numl);
		try{
		ListIterator<Integer> lo = l.<Integer>listIterator(); 
		System.out.print("Values: ");
		while(lo.hasNext()){
			System.out.println(lo.next());
		}
		System.out.println("values backwards: ");
		while(lo.hasPrevious()){
			System.out.println(lo.previous());
		}
		l.set(2,100);
		System.out.println("after setting the value at 2nd index: "+l);
		try{
		ListIterator<Integer> lol = l.<Integer>listIterator(0);
			System.out.println(lol.next());
		}catch(IndexOutOfBoundsException ioe){
			System.out.println("Index is out of control.");
		}
		}catch(NullPointerException npe){
			npe.printStackTrace();
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}