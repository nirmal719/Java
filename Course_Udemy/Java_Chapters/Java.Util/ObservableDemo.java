import java.util.*;

class Watcher implements Observer{
	public void update(Observable obserobj, Object arg){
		System.out.println("update() called, count is "+((Integer)arg).intValue());
	} 
}
class BeingWatched extends Observable{
	void counter(int period){
		for(; period >= 0; period--){
			setChanged();
			notifyObservers(new Integer(period));
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				System.out.println("Sleep interrupted");
			}
		}
	}
}
public class ObservableDemo{
	public static void main(String [] args){
		BeingWatched observed = new BeingWatched();
		Watcher observer = new Watcher();
		observed.addObserver(observer);
		observed.counter(5);
	}
}