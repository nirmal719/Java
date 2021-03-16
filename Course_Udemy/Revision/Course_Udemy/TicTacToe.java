import java.io.*;

public class TicTacToe{
	public static void main(String [] args){
		try(BufferedReader buf = new BufferedReader(new InputStreamReader(System.in)))
		{
			char enteredSymbol = '\u0000';
			int [] gameArray = new int[9];
			System.out.println("Enter 'X' or '0' to play");
			enteredSymbol = (char)buf.read();
			if(enteredSymbol == 'X' || enteredSymbol == '0'){
				do{
					
				}while(
			}
		}
	}
}