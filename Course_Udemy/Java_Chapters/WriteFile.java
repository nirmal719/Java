import java.io.*;

public class WriteFile{
	public static void main(String [] args){
		int i;
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		if(args.length != 2){
			System.out.println("Reading the file:");
			return;
		}
		try{
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream(args[1]);
			do{
				i = fin.read();
				if(i != -1){
					fout.write(i);
				}
			}while(i != -1);
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			try{
				if(fin != null){
					fin.close();
				}
			}catch(IOException ioee){
				ioee.printStackTrace();
			}
			try{
				if(fout != null){
					fout.close();
				}
			}catch(IOException ior){
					ior.printStackTrace();
				}
		}		
	}
}