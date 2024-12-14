package newPackage;
import java.util.Stack;
public class stackjc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<Integer>();
		System.out.println(s);
		System.out.println(s.isEmpty());
		s.push(10);
		System.out.println(s);
		s.push(2);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.isEmpty());
		s.push(40);
		s.push(54);
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.peek());
		

	}

}
