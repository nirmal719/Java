public class Hello_World{
	void calcArea(int x){
		System.out.println("Square" +x*x);
	}
	void calcArea(int x, int y){
		System.out.println("Rect" +x*y);
	}
	public static void main(String num[]){
		Hello_World hw = new Hello_World();
		hw.calcArea(10);
		hw.calcArea(10, 20);
		hw.calcArea((int)10.5f);
	}
}