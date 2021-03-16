public class MinutesToYearsDaysCalculator {
    // write your code here
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else{
            long years =  minutes/525600;
            long days =  minutes/1440;
			long numberOfDays = days % 365;
            System.out.println(minutes+" min = "+years+" y and "+numberOfDays+" d");
        }
    }
	public static void main(String [] args){
		printYearsAndDays(1440);
		printYearsAndDays(561600);
		printYearsAndDays(1051200);
	}
}