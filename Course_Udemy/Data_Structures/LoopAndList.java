class Node{
	int data;
	Node next;
	
	Node(int d){
		data = d;
		next = null;
	}
}

class LoopInList{
	Node head;
	
	public void insertFromStart(int number){
		Node newNode = new Node(number);
		if(head == null){
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	public void display(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
	}
	
	public void loopDetector(){
		Node p1 = head;
		Node n1 = head;
		while(n1.next != null){
			p1 = p1.next;
			n1 = n1.next.next;
		}
		if(p1 == n1){
			System.out.println("loop detected:");
		}else{
			System.out.println("loop Not detected:");
		}
	}
}

public class LoopAndList{
	public static void main(String [] args){
		LoopInList lil = new LoopInList();
		for(int i = 50; i >= 10; i-=10){
			lil.insertFromStart(i);
		}
		lil.loopDetector();
	}
}