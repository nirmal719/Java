interface InsertArray{
	int displayArray(int n);
}
class ArrayOutput{
	public static int output(int a){
		int result = a*3;
		return result;
			
	}
}
public class StaticMethodReferences{
	public static int arrayPrinting(InsertArray ins, int b){
		return ins.displayArray(b);
	}
	public static void main(String [] args){
		int d = 5;
		int c = 0;
			 c = arrayPrinting(ArrayOutput::output,d);
		System.out.print("Displaying the output: "+ c + " " + d);
	}
}