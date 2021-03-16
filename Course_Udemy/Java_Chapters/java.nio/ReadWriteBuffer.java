import java.nio.*;
import java.nio.file.*;
import java.io.*;
import java.nio.channels.*;

public class ReadWriteBuffer{
	public static void main(String [] args){
		try(RandomAccessFile afile = new RandomAccessFile("Directory\\test.txt","rw"))
		{
		FileChannel inChannel = afile.getChannel();
		ByteBuffer buf = ByteBuffer.allocate(128);
		int bytesRead = inChannel.read(buf);
		while(bytesRead != -1){
			buf.flip();
		for(int i = 0; i < bytesRead; i++){
			System.out.print((char) buf.get());
		}
		buf.clear();
		bytesRead = inChannel.read(buf);
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	// afile.close();
}
}