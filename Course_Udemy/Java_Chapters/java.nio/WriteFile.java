import java.nio.*;
import java.nio.file.*;
import java.util.*;

public class WriteFile{
	public static void main(String [] args){
		try{
			Path p1 = Paths.get("Directory\\test.txt");
			String content = "This is a text file";
			Files.write(p1,content.getBytes());
			System.out.println("File is written with string");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
