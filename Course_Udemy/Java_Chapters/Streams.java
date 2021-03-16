import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Streams{
	public static void main(String [] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int j = Integer.parseInt(br.readLine());
			System.out.println(j);
		} catch(IOException ie){
			ie.printStackTrace();
		}
	}
}