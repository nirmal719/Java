public class IfElseLoopExercise{
	public static void main(String [] args){
		test(false, false);
	}
	static void test(boolean a, boolean b){
		if(a){
			System.out.println("A");
		}else if(a && b){
			System.out.println("A && B");
		}else{
			if (!b){
				System.out.println("!B");
			}else{
				System.out.println("None");
			}
		}
	}
}