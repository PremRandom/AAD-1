package newPackage;
import java.util.LinkedList;
public class lljc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<Integer>();
		System.out.println(ll);
		ll.addFirst(10);
		System.out.println(ll);
		ll.add(20);
		System.out.println(ll);
		ll.addLast(50);
		System.out.println(ll);
		ll.add(1, 78);
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		ll.remove(1);
		System.out.println(ll);
		ll.clear();
		System.out.println(ll);
		

	}

}
