import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class StreamExamples{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(br.readLine());
		System.out.println(i);
	
	}

}