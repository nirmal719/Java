import java.io.*;

public class ReadFile{
	public static void main(String [] args){
		int i;
		FileInputStream fin = null;
		if(args.length != 1){
			System.out.println("Usage Command:");
			return;
		}
		try
		{
			fin = new FileInputStream(args[0]);
			do
			{
				i = fin.read();
				if(i != -1){
					System.out.println((char)i);
				}
			}while(i != -1);
		}catch(IOException ioe){
			System.out.println("An error occured");
		}finally {
			try{
				if(fin != null){
					fin.close();
				}
			}catch(IOException ioee){
				ioee.printStackTrace();
			}
		}	
	}
}