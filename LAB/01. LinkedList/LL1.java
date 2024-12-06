package iter;



class Node {
	int data;
	Node next = null;
	
	public Node(int data) {
		this.data = data;
	}	
}


class SLL{
	Node Head;
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if (Head==null) {
			Head = newNode;
		} else {
			Node curr = Head;
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = newNode;
		}
	}
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = Head;
		Head = newNode;
	}
		
	public void display(){
		if(Head == null) {
			System.out.println("List empty");
			return;
		}
		Node curr = Head;
		while(curr.next!=null) {
			System.out.print(curr.data + " -> ");
			curr = curr.next;
		}
		System.out.println(curr.data + " -> null");
	}
	
	public void delFirst() {
		if(Head == null) {
			System.out.println("List empty");
			return;
		}
		System.out.println(Head.data);
		Head = Head.next;
	}
	
	public void delLast() {
		if(Head == null) {
			System.out.println("List empty");
			return;
		}
		Node curr = Head;
		Node secCurr = curr.next;
		while(secCurr.next!=null) {
			curr = curr.next;
			secCurr = secCurr.next;
		}
		System.out.println(secCurr.data);
		curr.next = null;		
	}

}


public class LL1 {

	public static void main(String[] args) {
		SLL list = new SLL();
		
		list.addFirst(43);
		list.display();
		list.addFirst(29);
		list.display();
		list.addLast(678);
		list.display();
		list.addFirst(123);
		list.display();
		list.addLast(678578);
		list.display();
		list.delFirst();
		list.display();
		list.delLast();
		list.display();

	}

}
