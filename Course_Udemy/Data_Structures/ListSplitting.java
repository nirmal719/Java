class Node{
	int data;
	Node next;
	
	Node(int d){
		data = d;
		next = null;
	}
}

class SplittingList{
	Node head;
	Node head1;
	Node head2;
	
	public void insertFromEnd(int number){
		Node newNode = new Node(number);
		Node temp = head;
		if(temp == null){
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
	public int calculate_length_list(){
		int listLength = 0;
		Node temp = head;
		while(temp != null){
			temp = temp.next;
			listLength++;
		}
		return listLength;
	}
	public void splitList(){
		head1 = head;
		head2 = null;
		Node p1 = head;
		Node n1 = head;
		int listSize = calculate_length_list();
		if(listSize % 2 == 0){
			while(n1.next.next != null){
				p1 = p1.next;
				n1 = n1.next.next;
			}
			head2 = p1.next;
			p1.next = null;
		}else{
			Node t1 = null;
				while(n1.next != null){
					t1 = p1;
					p1 = p1.next;
					n1 = n1.next.next;
				}
			t1.next = null;
			head2 = p1.next;
			p1.next = null;
		}
	}
	public int calculate_length_first_list(){
		int length = 0;
		Node temp1 = head1;
		while(temp1 != null){
			temp1 = temp1.next;
			length++;
		}
		return length;	
	}
	public void reverseFirstList(){
		Node nextNode = null;
		Node currentNode = head1;
		Node previousNode = null;
		while(currentNode != null){
			nextNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}
		head1 = previousNode;
	}
	
	public boolean detectPalindrome(){
		Node temp1 = head1;
		Node temp2 = head2;
		int size = calculate_length_first_list();
		int counter = 0;
		while(temp1 != null && temp2 != null){
			if(temp1.data == temp2.data){
				counter++;
			}
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		if(counter == size){
			return true;
		}else{
			return false;
		}
	}
	
	public void displayFirstList(){
		Node temp1 = head1;
		System.out.println("Nodes in List1: ");
		while(temp1 != null){
			System.out.print(temp1.data+ " "+ "\n");
			temp1 = temp1.next;
		}
	}
	public void displaySecondList(){
		Node temp2 = head2;
		System.out.println("Nodes in List2: ");
		while(temp2 != null){
			System.out.print(temp2.data+ " ");
			temp2 = temp2.next;
		}
	}
}

public class ListSplitting{
	public static void main(String [] args){
		SplittingList sl = new SplittingList();
		sl.insertFromEnd(1);
		sl.insertFromEnd(2);
		sl.insertFromEnd(3);
		sl.insertFromEnd(3);
		sl.insertFromEnd(2);
		sl.insertFromEnd(1);
		//sl.insertFromEnd(1);
		sl.splitList();
		sl.reverseFirstList();
		boolean palindrome_check = sl.detectPalindrome();
		if(palindrome_check == true){
			System.out.println("Given list is Palindrome ");
		}else{
			System.out.println("Given list is not palindrome ");
		}
	}
}