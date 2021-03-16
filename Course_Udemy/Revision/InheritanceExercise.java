class Super{
	int index = 1;
}
class B extends Super{
	B(int index){
		index = index;
	}
}
public class InheritanceExercise{
	public static void main(String [] args){
		B obj = new B(10);
		System.out.println(obj.index);
	}
}