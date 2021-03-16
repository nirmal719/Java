class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}
class SortedList{
	Node head;
	public void insertInList(int number){
		Node newNode = new Node(number);
		Node temp = head;
		if(head == null){
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
	public void sortingList(){
		Node temp = head;
		Node nextNode = null;
		int demo = 0;
		while(temp != null){
			nextNode = temp.next;
			while(nextNode != null){
				if(temp.data > nextNode.data){
					demo = temp.data;
					temp.data = nextNode.data;
					nextNode.data = demo;
				}
				nextNode = nextNode.next;
			}
			temp = temp.next;
		}
	
	}	
	public void display(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}
public class SortingALinkedList{
	public static void main(String [] args){
		SortedList sort = new SortedList();
		sort.insertInList(9);
		sort.insertInList(24);
		sort.insertInList(10);
		sort.insertInList(2);
		sort.insertInList(5);
		sort.insertInList(19);
		System.out.println("Original List: ");
		sort.display();
		sort.sortingList();
		System.out.println("\n"+"After sorting list: ");
		sort.display();
		
		
	}
}

