public class CheckingPalindromeInList{
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node (int d){
			data = d;
			next = null;
		}
	}
	
	public void insertAtFirst(int d){
		Node newNode = new Node(d);
		newNode.next = head;
		head = newNode;
	}
	
	public void palindromeCheck(){
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
		
	
	/* public void display(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}*/
	
	public static void main(String [] args){
		CheckingPalindromeInList chpil = new CheckingPalindromeInList();
		chpil.insertAtFirst(2);
		chpil.insertAtFirst(3);
		chpil.insertAtFirst(2);
		chpil.insertAtFirst(3);
		chpil.insertAtFirst(2);
		
		chpil.palindromeCheck();
		// chpil.display();
	}
}