// import java.io.IOException;

class IRReader{
	public static void process(){
		System.out.print("Data Reader ");
	}
}
class CardReader extends IRReader{
	public static void process(){
		/* try{
			System.out.print("Card Reader ");
			// throw new IOException();
		}catch(Exception e){
			System.out.print("Exception 1");
		} */
		System.out.print("Checking");
	}
}
public class Challenge39{
	public static void main(String [] args){
		IRReader reader = new CardReader();
	/* 	try{
			reader.process();
		}catch(Exception e){
			System.out.print("exception");
		} */
		reader.process();
		CardReader cdr = new CardReader();
		cdr.process();
	}
}