/*
 * 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

	Find the sum of all the primes below two million.	
 * 
 */

package com.projects;

public class P010 {
	
	public static void main(String[] args) {
		
		long sum = 2;
		for(long i=3;i<2_000_000;i=i+2) {
			if(isPrime(i)) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
	
	public static boolean isPrime(long num) {
		
		long count = 0;
		if(num%2 == 0 && num!=2) {
			count = count + 1;
		}
		else {
		for(long i=3;i<=Math.sqrt(num);i=i+2) {
			if(num%i == 0) {
				count = count + 1;
				}
			}
		}
		if(count == 0) {
			return true;
		} else {
			return false;
		}
	}
}
