import java.io.*;

public class Challenge48{
	static void doA() throws IndexOutOfBoundsException{
		System.out.print("a");
		if(true)
			throw new IndexOutOfBoundsException();
	}
	/* static void doB(){
		System.out.print("b");
		if(false)
			throw new FileNotFoundException();
	} */
	public static void main(String [] args){
		try{
			doA();
			// doB();
		}/* catch(IOException e){
			System.out.print("c");
		} */
		catch(IndexOutOfBoundsException ie){
			System.out.print("i");
		}
		finally{
			System.out.print("d");
		}
		System.out.print("f");
	}
}