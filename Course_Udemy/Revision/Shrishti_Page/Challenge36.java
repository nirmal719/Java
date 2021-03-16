import java.io.IOException;

class IRReader{
	public static void process() throws Exception{
		System.out.println("Data Reader");
		throw new Exception();

	}
}
class CardReader extends IRReader{
	public static void process() throws Exception{
		System.out.println("Data Reader");
		throw new IOException();

	}
}
public class Challenge36{
	public static void main(String [] args){
		IRReader reader = new CardReader();
		try{
			reader.process();
		}catch(IOException e){
			System.out.println("IOException");
		}catch(Exception e){
			System.out.println("Exception");
		}
	
	}

}