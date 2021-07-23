package com.ds;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

public class ListStack<T> implements Iterable<T>, Stack<T> {

	LinkedList<Integer> list = new LinkedList<>();

	public ListStack() {
	}

	public ListStack(T firstEle) {
		push(firstEle);
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public void push(T ele) {
		list.addLast((Integer) ele);
	}

	public T pop() {
		if (isEmpty())
			throw new EmptyStackException();
		return (T) list.removeLast();
	}

	@Override
	public T peek() {

		if (isEmpty())
			throw new java.util.EmptyStackException();
		return (T) list.peekLast();
	}

	public int search(T ele) {
		return list.lastIndexOf(ele);
	}

	@Override
	public Iterator<T> iterator() {
		return (Iterator<T>) list.iterator();
	}

	public void printItems() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " in index " + i);
		}
	}

	public static void main(String args[]) {
		ListStack<Integer> listStack = new ListStack<>();
		listStack.push(5);
		listStack.push(7);
		listStack.push(3);
		System.out.println(listStack.peek() + " Peek element");
		listStack.printItems();
		listStack.pop();
		System.out.println("----------------After POP-----------------");
		listStack.printItems();
	}

}
