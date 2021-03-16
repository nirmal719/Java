public class NthNodeFromLast{
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
		Node temp = head;
		Node newNode = new Node(d);
		if (temp == null){
			head = newNode;
			return;
		}
		newNode.next = null;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	public int listLength(){
		Node temp = head;
		int count = 0;
		while(temp != null){
			count += 1;
			temp = temp.next;
		}
		return count;
	}
	
	public void findNthNodeFromEnd(){
		Node temp = head;
		int iteration = listLength();
		int position =0;
		for (int i = 1; i <= (iteration - position) + 1;i++){
			temp = temp.next;
			System.out.print(temp.data + " " );
			position += 1;
		}
		//System.out.println("Finding the Nth node from last: " +temp.data);
	}
	
	/* public void display(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	} */
	
	public static void main(String [] args){
		NthNodeFromLast nthfml = new NthNodeFromLast();
		
		nthfml.insertList(10);
		nthfml.insertList(20);
		nthfml.insertList(30);
		nthfml.insertList(40);
		nthfml.insertList(50);
		
		nthfml.findNthNodeFromEnd();
	
	}
	

}