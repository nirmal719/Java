public class ReversingList{
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void insertList(int d){
		Node newNode = new Node(d);
		
		newNode.next = head;
		head= newNode;
		
	}
	
	public void listReversal() {
		Node curr = head;
		Node prev = null;
		Node next = null;
		
		while(curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		
	}
	
	public void display(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public static void main(String [] args){
		ReversingList rl = new ReversingList();
		
		rl.insertList(2);
		rl.insertList(3);
		rl.insertList(2);
		rl.insertList(3);
		rl.insertList(2);
		
		rl.listReversal();
		
		rl.display();
	
	
	}


}