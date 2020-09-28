/*
 * 
 * n! means n × (n − 1) × ... × 3 × 2 × 1

	For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
	and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
	
	Find the sum of the digits in the number 100!
 * 
 */
package com.projects;

import java.math.BigInteger;

public class P020 {

	public static void main(String[] args) {
		// System.out.println(factorial(100));
		// BigInteger value = new BigInteger(String.valueOf(factorial(100)));
		String value = String.valueOf(factorial(100));
		long sum = 0;
		for (int i = 0; i < value.length(); i++) {
			sum = sum + Character.getNumericValue(value.charAt(i));
		}
		System.out.println(sum);
	}

	public static BigInteger factorial(int num) {
		BigInteger factorialValue = BigInteger.ONE;
		for (int i = 1; i <= num; i++) {
			BigInteger val = new BigInteger(String.valueOf(i));
			factorialValue = factorialValue.multiply(val);
		}
		return factorialValue;
	}
}
