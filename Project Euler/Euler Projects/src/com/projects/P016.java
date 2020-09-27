/*
 * 
 * 2**15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

	What is the sum of the digits of the number 2**1000?
 * 
 */
package com.projects;

import java.math.BigInteger;

public class P016 {
	public static void main(String[] args) {
		BigInteger result = BigInteger.ONE;
		BigInteger  val = new BigInteger("2");
		for(long i=1;i<=1000;i++) {
			result = result.multiply(val);	
		}
		BigInteger sum = BigInteger.ZERO;
		BigInteger ten = BigInteger.TEN;
		while(result != BigInteger.ZERO) {
			sum = sum.add(result.mod(ten));
			result = result.divide(ten);
		}
		System.out.println(sum);
		
	}
}
