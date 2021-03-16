import java.io.*;

public class MainArgsExample{
	public static void main(String [] args){
		int i;
		FileInputStream fin;
		if(args.length != 1){
			System.out.println("Usage command");
			return;
		}
		try{
			fin = new FileInputStream(args[0]);
			do{
				i = fin.read();
				if(i != -1){
					System.out.println((char) i );
				}
			}while(i != -1);
		}catch(FileNotFoundException foe){
			System.out.println("file not found" +foe);
		}catch(IOException ioe){
			System.out.println("Input and output error" +ioe);
		}finally{
			try{
				fin = new FileInputStream(args[0]);
				if(fin != null){
					fin.close();
				}
			}catch(IOException ioee){
				ioee.printStackTrace();
			}
		}			
		/* if (args.length == 1){
			System.out.println("found");
		}else{
			System.out.println("Not found"+args.length);
		} */
	}
}