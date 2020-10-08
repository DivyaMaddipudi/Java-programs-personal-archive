/*
 * 
 * A perfect number is a number for which the sum of its proper divisors is exactly equal to the number.
 * For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.

	A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.
	
	As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, 
	the smallest number that can be written as the sum of two abundant numbers is 24. 
	By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers. 
	However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number 
	that cannot be expressed as the sum of two abundant numbers is less than this limit.
	
	Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
 * 
 */

package com.projects;

import java.util.ArrayList;

public class P023 {
	
	static int max = 28123;
	public static void main(String[] args) {
		
		ArrayList<Long> abundants = new ArrayList<Long>();
		ArrayList<Long> sumOfAbundants = new ArrayList<Long>();
		for(long i=1;i<=28123;i++) {
			if(isAbundant(i)) {
				abundants.add(i);
			}
		}
		
		
		
		int sum = 0;
		long temp =0;
		
		for(int i=0;i<abundants.size();i++){
			for(int j =i;j<abundants.size();j++) {
				temp = abundants.get(i) + abundants.get(j);
				if(temp <= max) {
					sumOfAbundants.add(temp);
				}
			}
		}
		//System.out.println(sumOfAbundants.size());
		
        for (long i = 1; i <= max; i++) {
            if (sumOfAbundants.contains(i) == false) {
                sum += i;
            }
            //System.out.println(sum);
        }
        System.out.println(sum);
	}
	
	public static boolean isAbundant(long num) {
		boolean isAbundant = false;
		long sum = 0;
		
		for(long i =1;i<=num/2;i++) {
			if(num%i == 0) {
				sum = sum + i;
			}
		}
		if(sum > num) {
			isAbundant = true;
		}
		return isAbundant;
	}

}
