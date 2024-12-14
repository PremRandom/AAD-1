package newPackage;
import java.util.ArrayDeque;
public class queuejc {
	public static void main(String args[]) {
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		System.out.println(q);
		System.out.println(q.isEmpty());
		q.add(10);
		System.out.println(q);
		q.add(27);
		q.add(12);
		q.add(45);
		q.add(75);
		System.out.println(q);
		System.out.println(q.isEmpty());
		q.poll();
		System.out.println(q);
		q.remove();
		System.out.println(q);
		System.out.println(q.size());
		q.clear();
		System.out.println(q);
	}

}
