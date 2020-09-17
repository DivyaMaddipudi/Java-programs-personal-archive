/*
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
 * we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 * 
 */

package com.projects;

public class P007 {
	
	public static void main(String[] args) {
		
		
		int counter = 0;
		
		int i = 1;
		
		int value = 0;
		
		while(i<=10001) {
			counter++;
			if(isPrime(counter)) {
				i++;
				
				value = counter;
			}
		} 
		System.out.println(value);
	}
	
	public static boolean isPrime(long num) {
		boolean isPrime = false;
		int count = 0;
		for(long i=1;i<=num/2;i++) {
			if(num%i == 0) {
				count++;
			}
		}
		if(count == 1) {
			isPrime = true;
		} else {
			isPrime = false;
		}
		return isPrime;
	}

}
