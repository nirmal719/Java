public class SecondsAndMinutes{
	public static void main(String [] args){
		getDurationString(62,20);
	}
	public static void getDurationString(int minutes, int seconds){
		if(minutes < 0){
			if(seconds >= 0 && seconds <= 59){
				System.out.println("Invalid Value");
			}
		}else{
			int hour = minutes/60;
			int minute = minutes % 60;
			System.out.print(hour+ "h "+minute+ "m "+seconds+"s ");
		}
	}
	public static void getDurationString(int seconds){
		if(seconds < 0){
			System.out.println("Invalid Value");
		}
	}

}