public class ProcessBuilderDemo{
	public static void main(String [] args){
		try{
			ProcessBuilder pb = new ProcessBuilder("notepad" , "test");
			pb.start();
		}catch(Exception ie){
			ie.printStackTrace();
		}
	}
}