/**
 * 
 */
package mystack;

/**
 * @author Alex Yang, Angel Bravo
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		if (theStack == null) {
			return null;
			}
		T stack = theStack.val;
		theStack.val = theStack.next.val;
		theStack.next = theStack.next.next; 
		return stack;
	}

	public void push(T v) {
		if (theStack == null) {theStack = new MyNode<T>(v, null);}
			MyNode<T> stack = new MyNode<T>(theStack.val, theStack.next);
			MyNode<T> top = new MyNode<T>(v, stack);
			stack = top;
		
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		MyStack<Integer> intStack = new MyStack<>();
		// Push 1 and 2
		intStack.push(1);
		intStack.push(2);
		// Pop
		// Push 5
		intStack.push(5);
		
		// TODO To complete
		// Create a stack of Person
		MyStack<Person> personStack = new MyStack<>();
		// Push a person p1 with your name
		Person p1 = new Person("Alex", "Angel");
		personStack.push(p1);
		// Push a person p2 with my name
		Person p2 = new Person("Christelle", "Scharff");
		personStack.push(p2);
	}

}
