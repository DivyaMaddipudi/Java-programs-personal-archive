/*
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * 
 */
// 
package com.projects;

import java.util.Scanner;

public class P005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long ans = 1;
		for(long i=1;i<=num;i++) {
			ans = (ans * i)/gcd(ans, i);
		}
		System.out.println(ans);
		
	}
	
	static long gcd(long a, long b) {
		if(a%b != 0) 
			return gcd(b, a%b);
		else 
			return b;
	}
}
