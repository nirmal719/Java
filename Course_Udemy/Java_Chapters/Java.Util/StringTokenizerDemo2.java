import java.util.StringTokenizer;
import java.util.NoSuchElementException;

public class StringTokenizerDemo2{
	static String str = "title Java=: The Complete Reference," +
						"author=:Schildt," +
						"publisher=:McGraw-Hill," +
						"copyright=:2014,"+ 
						"Person=:who else";
	public static void main(String [] args){
		try{
			StringTokenizer token = new StringTokenizer(str,"=,");
			while(token.hasMoreTokens()){
				String key = token.nextToken();
				String value = token.nextToken();
				System.out.println(key + " "+value+ " "); 
			}
		}catch(NoSuchElementException nee){
			System.out.println("No such element found" );
		}
	}
}