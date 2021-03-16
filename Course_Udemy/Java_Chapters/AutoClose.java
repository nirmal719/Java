import java.io.*;

public class AutoClose{
	public static void main(String [] args){
		int i;
		if(args.length != 1){
			System.out.println("Auto close the file");
		}
		try(var fin = new FileInputStream(args[0])){
			do{
				i = fin.read();
				if(i != -1){
					System.out.println((char)i);
				}
			}while(i != -1);
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}