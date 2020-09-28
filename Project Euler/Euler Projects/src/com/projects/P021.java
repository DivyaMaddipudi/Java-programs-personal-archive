/*
 * 
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
	If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.
	
	For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. 
	The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
	
	Evaluate the sum of all the amicable numbers under 10000.
 * 
 */
package com.projects;

public class P021 {

	public static void main(String[] args) {
		
		long sumOfAmicablePairs = 0;
		for (long i = 1; i < 10000; i++) {
			long val = sumOfDivisors(i);
			if (sumOfDivisors(i) == val && sumOfDivisors(val) == i && i!=val) {
				sumOfAmicablePairs = sumOfAmicablePairs + i;
				System.out.println(i);
				//System.out.println(i);
			}
		}
		System.out.println(sumOfAmicablePairs);
	}

	public static long sumOfDivisors(long num) {
		long sum = 0;
		for (long i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

}
