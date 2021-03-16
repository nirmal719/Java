import java.io.*;

public class ReadStream{
	public static void main(String [] args){
		try{
			char ch;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter q to exit");
			do{
				ch = (char) br.read();
				System.out.println(ch);
			}while(ch != 'q');
		}catch(IOException ie){
			ie.printStackTrace();
		}
	}
}