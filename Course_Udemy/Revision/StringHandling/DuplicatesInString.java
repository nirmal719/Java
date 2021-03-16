public class DuplicatesInString{
	public static void main(String [] args){
		String s1 = "Tiara";
		char [] c = s1.toCharArray();
		int duplicates = 0;
		int numberOfOccurences = 0;
		char duplicatedLetter = '\u0000';
		for(int i = 0; i < s1.length(); i++){
			for (int j = i+1; j < s1.length(); j++){
				System.out.println(c[i] + " " +c[j]);
				if(c[i] == c[j]){
					duplicatedLetter = c[j];
					duplicates += 1;
				}
				numberOfOccurences = duplicates;
				break;
			}
		}
		if(duplicates > 0){
			System.out.println("characters are occured " +(numberOfOccurences+1)+ " number of times in the string and the duplicated letter is: '"+duplicatedLetter+ "'");
		}else{
			System.out.println("No character is duplicated");
		}
	}
}