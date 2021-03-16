class A{
	List li = new List();
	li.i;

}



public class List{
	static Node head;
	
	static class Node{
		int data;
		Node next;
		private int i;
		
		Node(int d){
			data = d;
			next = null;
		}
		
		public void print(){
			System.out.println(i);
		
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
		return;
	}
	
	public void swapNodes(int x, int y){
		Node currX = head;
		Node prevX = null;
		while(currX != null && currX.data != x){
			prevX = currX;
			currX = currX.next;
		}
		
		Node currY = head;
		Node prevY = null;
		while(currY != null && currY.data != y){
			prevY = currY;
			currY = currY.next;
		}
		if (prevX == null){
			Node temp = currY.next;
			head = currY;
			currY.next = currX.next;
			prevY.next = currX;
			currX.next = temp;
		}
		else if(currY.next == null){
			prevX.next = currY;
			currY.next = currX.next;
			prevY.next = currX;
			currX.next = null;
		}
		else if (prevY == currX){
			Node temp2 = currY.next;
			prevX.next = currX.next;
			currY.next = currX;
			currX.next = temp2;
		}
		else if (prevX == currY){
			Node temp3 = currX.next;
			prevY.next = currX;
			currX.next = currY;
			currY.next = temp3;
		}
		else{
		Node temp1 = currY.next;
		prevX.next = currY;
		currY.next = currX.next;
		prevY.next = currX;
		currX.next = temp1;
		}
	}
	
	public void displayList(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
	
	}
	
	public static void main(String [] args){
		List list = new List();
		
		list.insertList(10);
		list.insertList(20);
		list.insertList(30);
		list.insertList(40);
		list.insertList(50);
		list.insertList(60);
		list.swapNodes(40,50);
		System.out.println("List after swapping adjacent nodes:");
		list.displayList();
		list.swapNodes(30,20);
		System.out.println("List after swapping second adjacent nodes: " );
		list.displayList();
		
	}
	
	
	
	
}