public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes > 0){
            int conversionRate = 1024;
            int MBValue = kiloBytes / conversionRate;
            int KbValue = kiloBytes % conversionRate;
            System.out.println(kiloBytes+ " KB = "+MBValue+" MB and "+KbValue+" KB");
        }else if(kiloBytes < 0 ){
            System.out.println("Invalid Value");
        }else if(kiloBytes == 0){
            System.out.println(kiloBytes+ " KB = 0 MB and 0 KB");
        }
    }
	public static void main(String [] args){
		printMegaBytesAndKiloBytes(2500);
		printMegaBytesAndKiloBytes(-1024);
		printMegaBytesAndKiloBytes(5000);
		printMegaBytesAndKiloBytes(0);
	}
}