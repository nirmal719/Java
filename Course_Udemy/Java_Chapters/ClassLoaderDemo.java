import java.lang.ClassLoader;

public class ClassLoaderDemo{
	public static void main(String [] args){
		try{
			Class cl = Class.forName("ClassLoaderDemo");
			ClassLoader cls = cl.getClassLoader();
			for (int i = 0; i < 10; i++)
				System.out.println(cls);
			}catch(ClassNotFoundException cnfe){
				cnfe.printStackTrace();
			}
	}
}