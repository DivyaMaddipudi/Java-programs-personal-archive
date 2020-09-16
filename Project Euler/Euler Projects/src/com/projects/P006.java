/*
 *Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640 
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * 
 */
package com.projects;

import java.util.Scanner;

public class P006 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int sumOfSquares = 0;
		int squareSum = 0;

		sumOfSquares = sumOfSquares + (num * (num + 1) * (2 * num + 1)) / 6;

		int sum = (num * (num + 1)) / 2;

		squareSum = sum * sum;

		int result = squareSum - sumOfSquares;
		System.out.println(result);

	}
}
