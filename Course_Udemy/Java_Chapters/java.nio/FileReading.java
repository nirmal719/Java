import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class FileReading{
	public static void main(String [] args){
		Path filePath = null;
		int count;
		try{
			filePath = Paths.get("C:\\Users\\Nirmal.Kumar3\\OneDrive - EY\\Desktop\\demo.txt");
		}catch (InvalidPathException ne){
			System.out.println("Path not found "+ne);
			return;
		}
		try(SeekableByteChannel sbc = Files.newByteChannel(filePath)){
			ByteBuffer buf = ByteBuffer.allocate(128);
			do{
				count = sbc.read(buf);
				if(count != -1){
					buf.rewind();	
				}
					for(int i = 0; i< count; i++){
						System.out.print((char)buf.get());
					}
			}while(count != -1);
			System.out.println();
		}catch(IOException ie){
			System.out.println("I/O Exception: "+ie);
		}
	}
}

