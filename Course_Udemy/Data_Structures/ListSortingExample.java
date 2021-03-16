class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}
class SortingList{
	Node head;
	// Node tail = null;
	public void insertInList(int number){
		Node newNode = new Node(number);
		Node temp = head;
		if(head == null){
			head = newNode;
			// tail = newNode;
			return;
		}
		newNode.next = null;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newNode;
		return;
	}
	public void listSorting(){
		Node temp = head;
		Node ahead = null;
		int demo = 0;
		if(head == null){
			return;
		}else{
			while(temp != null){
				ahead = temp.next;
				while(ahead != null){
					if(temp.data > ahead.data){
						demo = temp.data;
						temp.data = ahead.data;
						ahead.data = demo;
					}
					ahead = ahead.next;
				}
				temp = temp.next;
			}
		}
		
	}
	public void removeDuplicates(){
		Node temp = head;
		Node ahead = null;
		while(temp != null){
			ahead = temp.next;
			while(ahead != null){
				if(temp.data == ahead.data){
					temp.next = ahead.next;
				}
				ahead = ahead.next;
			}
			temp = temp.next;
		}
	}
	public void display(){
		if(head == null){
			System.out.println("Empty list");
			return;
		}
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}
public class ListSortingExample{
	public static void main(String [] args){
		SortingList sort = new SortingList();
		sort.insertInList(15);
		sort.insertInList(5);
		sort.insertInList(3);
		sort.insertInList(12);
		sort.insertInList(5);
		sort.insertInList(4);
		sort.insertInList(3);
		sort.insertInList(3);
		System.out.println("Original List: ");
		sort.display();
		sort.listSorting();
		System.out.println("\n"+"Sorted List: ");
		sort.display();
		sort.removeDuplicates();
		System.out.println("\n"+"List after removing the duplicates: ");
		sort.display();
	}
}