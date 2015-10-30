package euler;
/**
*  Author: Daniel Juszko
**/

/* 
 * https://projecteuler.net/problem=1
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Problem_001 {
	
	/*
	 * Finds all multiples of 3 and 5 below the limit (@param n) and returns the sum.
	 */
	
	public static int multipleSum(int n){
		int sum = 0;
		int i = 1;
		int multiple = 0;
		
		while(3*i < n){
			multiple = 3*i;
			sum += multiple;
			
			// to make sure some multiples aren't counted twice (example: 15), we check to see
			// that the multiple isn't already a multiple of 3
			if(5*i < n && (5*i % 3 != 0)){
				multiple = 5*i;
				sum += multiple;
			}
			
			i++;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(multipleSum(1000));
	}
}
