package euler;
/**
*  Author: Daniel Juszko
**/

/* 
 * https://projecteuler.net/problem=2
 * 
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 *  			1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms
 */

public class Problem_002 {
	
	/*
	 * @param m, @param n 
	 * 		- the latest two numbers in the Fibonacci sequence
	 * 		- starting values 1 and 2
	 * 
	 * @param fMax
	 * 		- the upper limit of the sequence
	 * 
	 * Calculates the Fibonacci sequence up to the given limit and returns the sum of all calculated even values. 
	 */
	
	public static int evenFibonacciSum(int fMax){
		int m = 1;
		int n = 2;
		int sum = 2;
		int tempSum;
		
		while(m+n < fMax){
			tempSum = m+n;
			if(tempSum % 2 == 0)
				sum += (tempSum);
			
			m = n;
			n = tempSum;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(evenFibonacciSum(4000000));
	}

}
