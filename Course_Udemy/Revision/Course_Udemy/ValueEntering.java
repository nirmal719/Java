import java.io.*;

public class ValueEntering{
	public static void main(String [] args){
		try(BufferedReader buf = new BufferedReader(new InputStreamReader(System.in))){
			int [][] arr = new int [3][3];
			System.out.println("Enter the symbol: 'X' or '0' - ");
			char c = (char)buf.read();
			if(c == 'X' || c == '0'){
				for(int i = 0; i < 3; i++){
					for(int j = 0; j < 3; j++){
						arr[i][j] = c;
					}
				}
			}
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < 3; j++){
					System.out.print(arr[i][j]+ " ");
				}
			}
		}catch(IOException ie){
			System.out.println("Exception caught: "+ie);
		}
	}
}