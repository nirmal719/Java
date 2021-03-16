import java.nio.*;
import java.nio.file.*;

public class CreatingFile{
	public static void main(String [] args){
		try{
			Path p1 = Paths.get("Directory\\test.txt");
			if(Files.exists(p1)){
				System.out.println("File already exists in the system");
			}else{
				Path createfile = Files.createFile(p1);
				System.out.println("File is created: "+createfile.toString());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}