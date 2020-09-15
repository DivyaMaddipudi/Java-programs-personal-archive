/*
 * 
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 */
package com.projects;

public class P004 {
	public static void main(String[] args) {
		int prod = 1;
		int max = 0;
		for(int i=999;i>=100;i--) {
			for(int j=999;j>=100;j--) {
				prod = i * j;
				if(isPalindrome(prod)) {
					if(prod > max) {
						max = prod;
					}
				}
			}
		}
		System.out.println(max);
	}
	
	public static boolean isPalindrome(int num) {
		String str = Integer.toString(num);
		String newStr = "";
		for(int i=str.length()-1;i>=0;i--) {
			newStr = newStr + str.charAt(i);
		}
		int newNum = Integer.parseInt(newStr);
		
		if(newNum == num) {
			return true;
		} else {
			return false;
		}
	}

}
