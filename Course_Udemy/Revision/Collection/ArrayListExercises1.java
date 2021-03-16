import java.util.ArrayList;

public class ArrayListExercises1{
	public static void main(String [] args){
		ArrayList<String> s1 = new ArrayList<String>();
		s1.add("Red");
		s1.add("Yellow");
		s1.add("Blue");
		s1.add("Magenta");
		System.out.println(s1.size());
		for(String s2:s1){
			System.out.println(s2);
		}
	}

}