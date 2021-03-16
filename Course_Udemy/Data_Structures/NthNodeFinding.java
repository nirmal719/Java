import java.util.Scanner;

class Node {
	int data;
	Node next;
	
	Node(int d){
		data = d;
		next = null;
	}
}

class NthNodeOperations{
	Node head;
	
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
	}
	
	public int calculateLength(){
		Node temp = head;
		int length = 0;
		while(temp != null){
			temp = temp.next;
			length++;
		}
		return length;
	}
	
	public void nThNode(int n){
		Node temp = head;
		int position = 0;
		int size = calculateLength();
		if(n > size){
			System.out.println("check the entered value of n:");
			return;
		}else if(n == 0){
			System.out.println(head.data);
			return;
		}else{
			while(position < n && temp != null){
				temp = temp.next;
				position++;
			}
			System.out.println(temp.data);
		}
	
	}
	
	public void nThNodeFromEnd(int n){
		Node temp = head;
		int sizeList = calculateLength();
		int position = sizeList;
		if(n > sizeList){
			System.out.println("out of scope of list");
			return;
		}else{
			while(position-1 > n && temp != null){
				temp = temp.next;
				position--;
			}
			System.out.println(temp.data);
		}
	}
	
	public void display(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
	}
}

public class NthNodeFinding{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		NthNodeOperations nno = new NthNodeOperations();
		for(int i = 10; i <= 50; i+=10){
			nno.insertFromEnd(i);
		}
		System.out.println("enter value of n:");
		int nValue = sc.nextInt();
		nno.nThNode(nValue);
		nno.nThNodeFromEnd(nValue);
	}

}