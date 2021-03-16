class Node{
	int data;
	Node next;
	
	Node(int d){
		data = d;
		next = null;
	}
}

class ReverseList{
	Node head;
	public void insertFromStart(int number){
		Node newNode = new Node(number);
		if(head == null){
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
		return;
	}
	public void listReversal(){
		Node p1 = head;
		Node n1 = null;
		Node t1 = null;
		while(p1 != null){
			n1 = p1.next;
			p1.next = t1;
			t1 = p1;
			p1 = n1;
		}
		head = t1;
	}
	
	public void display(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
	}
}

public class ReversingTheList{
	public static void main(String [] args){
		ReverseList rl = new ReverseList();
		for(int i = 50; i >= 10; i-= 10){
			rl.insertFromStart(i);
		}
		rl.listReversal();
		rl.display();
	}
}