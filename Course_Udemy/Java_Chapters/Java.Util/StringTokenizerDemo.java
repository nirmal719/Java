import java.util.StringTokenizer;

public class StringTokenizerDemo{
	public static void main(String [] args){
		StringTokenizer str = new StringTokenizer("Nirmal Kumar");
		System.out.println(str);
		StringTokenizer str1 = new StringTokenizer("MorningNirmalHowAreYou + ThingsareNotPrettyWell",",");
		System.out.println(str1);
		StringTokenizer str2 = new StringTokenizer("HowareThingsGoingHere",";",true);
		System.out.println(str2);
		while(str1.hasMoreTokens()){
			String key = str1.nextToken();
			// String value = str.nextToken();
			System.out.print(key+ " ");
		}
	}
}