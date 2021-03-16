import java.nio.*;
import java.nio.file.*;

public class OpenFile{
	public static void main(String [] args){
		try{
			Path p1 = Paths.get("Directory\\test.txt");
			Files.open(p1);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}