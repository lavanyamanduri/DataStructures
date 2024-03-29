package com.Bridgelabz;

public class Stack<T> {
	LinkedList<T> stack = new LinkedList<T>();
	public static int top = 0;

	
	public void push(T data) {

		stack.add(data);
		top++;

	}

	/**
	 * Purpose: pop the element from stack
	 * 
	 * @return returns data which is popped
	 */
	public void pop() {

		if (isEmpty()) {
			System.out.println("Stack is underflow");
		} else {
			stack.deleteAtEnd();
			top--;

		}

	}

	/**
	 * Purpose: show top element of stack
	 * 
	 * @return returns top data
	 */

	public T peek() {
		if (!isEmpty()) {
			T data;
			data = (T) stack.get(top);
			return data;
		}
		return null;

	}

	/**
	 * Purpose: check stack is empty or not
	 * 
	 * @return return true if empty else true
	 */
	public boolean isEmpty() {

		return stack.isEmpty();
	}

	/**
	 * Purpose: check stack is full or not (not applicable in linked list)
	 * 
	 * @return return true if full else true
	 */
	/*
	 * public boolean isFull() {
	 * 
	 * return top == stack.length; }
	 */

	/**
	 * Purpose: show stack values
	 */
	public void show() {
		/*
		 * for (Object num : stack) { System.out.print(num + " "); }
		 * System.out.println();
		 */
		stack.show();
	}

	/**
	 * Purpose: method for showing list of stack without spaces
	 */
	public void showStackWithoutSpace() {
		stack.showListWithoutSpaces();
	}

	
	public String returnStackWithoutSpaces() {
		return stack.returnListInString();
	}

	/**
	 * Purpose: check size of stack
	 * 
	 * @return return the top value
	 */
	public int size() {
		return top;
	}
}
