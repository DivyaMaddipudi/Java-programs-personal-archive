package com.leetcode.ds;

import java.util.LinkedList;
import java.util.Stack;

public class ValidParantheses_20 {
	
	public static boolean isValid(String s) {
		
		LinkedList<String> list = new LinkedList<>();
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(st.empty())
				st.push(s.charAt(i));
			else if(st.peek()== '(' && s.charAt(i) == ')')
				st.pop();
			else if(st.peek()== '{' && s.charAt(i) == '}')
				st.pop();
			else if(st.peek()== '[' && s.charAt(i) == ']')
				st.pop();
			else
				st.push(s.charAt(i));
		}
		return st.empty();
    }
	
	public static void main(String args[]) {
		String str = "(]";
		boolean isValid = isValid(str);
		System.out.println(isValid);
	}
}
