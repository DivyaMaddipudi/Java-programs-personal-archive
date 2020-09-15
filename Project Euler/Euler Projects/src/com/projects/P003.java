/*
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * 
 */

package com.projects;

import java.util.Scanner;

public class P003 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		
		for(long i=1;i<=num/2;i=i+2) {
			if(isPrime(i)) {
				if(num%i == 0) {
					System.out.println(i);
				}
				else {
					continue;
				}
			}
		}
		
	}
	
	public static boolean isPrime(long num) {
		boolean isPrime = false;
		int count = 0;
		for(long i=1;i<=num/2;i=i+2) {
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
