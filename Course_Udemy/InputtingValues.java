import java.io.*;

public class InputtingValues{
	public static void main(String [] args){
		
		try(BufferedReader obj = new BufferedReader(new InputStreamReader(System.in)))
		{
		char c = (char)obj.read();
		System.out.println(c);
		}catch(IOException ie){
			ie.printStackTrace();
		}
	}
}