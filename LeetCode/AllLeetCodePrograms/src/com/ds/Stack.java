package com.ds;

public interface Stack<T> {
	public int size();
	
	public boolean isEmpty();
	
	public void push(T ele);
	
	public T pop();
	
	public T peek();
}
