package euler;
/**
*  Author: Daniel Juszko
**/

/*
 * https://projecteuler.net/problem=5
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Problem_005 {
	
	/*
	 * @param value
	 * 		- 
	 * Finds the smallest positive number that is evenly divisible by all of the numbers from 1 to n.
	 * Iterates the given number by n and checks each value from 1 to n. Returns the first number that fits. 
	 */
	
	public static int SDN(int n){
		int value = n;
		
		while(!divisionCheck(value, n))
			value = value + n;
		
		return value;
	}
	
	/*
	 * @param value
	 * 		- the integer to be checked
	 * 
	 * Checks if the given integer is divisible by all numbers from 1 to n. Returns a boolean.
	 */
	
	public static boolean divisionCheck(int value, int n){
		for(int i=n; i>1; i--){
			if(!(value%i==0))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is " + SDN(20) + ".");
	}

}
