import java.lang.Math;

public class SpeedConverter {
    // write your code here
    public static long toMilesPerHour(double kilometersPerHour){
      if(kilometersPerHour > 0){
		  long input = Math.round(kilometersPerHour);
		  double outcome = input * 0.621371;
          long result = Math.round(outcome);
            return result;
        }else if(kilometersPerHour < 0){
            return -1;
        }else if(kilometersPerHour == 0){
			return 0;
		}
        return -1;
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour > 0){
            long result = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour+" km/h = "+result+ " mi/h");
        }else if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else if(kilometersPerHour == 0){
			long zeroValue = toMilesPerHour(kilometersPerHour);
			System.out.println(kilometersPerHour+ " km/h = "+zeroValue+" mi/h");
		}
    }
	public static void main(String [] args){
		printConversion(0.0);
		printConversion(1.5);
		printConversion(10.25);
		printConversion(-5.6);
		printConversion(25.42);
		printConversion(75.114);
		printConversion(100.4);
	}
}