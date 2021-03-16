import java.nio.*;
import java.nio.file.*;

public class CreateDirectory{
	public static void main(String [] args){	
		Path p = null;
			try{
				p = Paths.get("C:\\Users\\Nirmal.Kumar3\\Downloads\\Codes\\Directory");
				if(Files.exists(p)){
					System.out.println("Directory already exists");
				}
				else{
					Path createdir = Files.createDirectory(p);
					System.out.println("Directory is created:"+createdir.toString());
				}
			}catch(Exception ie){
				ie.printStackTrace();
			}
		}
	}