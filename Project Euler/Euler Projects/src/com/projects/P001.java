/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
package com.projects;

import java.util.Scanner;

public class P001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int range = sc.nextInt();
		
		for(int i=1;i<range;i++) {
			if(i%3!=0 && i%5 != 0) {
				continue;
			} else {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

}
