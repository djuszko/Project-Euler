package euler;
/**
*  Author: Daniel Juszko
**/

/* 
 * https://projecteuler.net/problem=3
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

public class Problem_003 {

	/*
	 * @param n
	 * 		- the upper bound up to which prime numbers will be calculated
	 * 
	 * @param array
	 * 		- the array used to calculate the prime numbers
	 * 
	 * @param sqrt
	 * 		- the square root of n
	 * 
	 * Creates a Sieve of Eratosthenes to calculate all the primes from 2 to the inputted integer.
	 * Sets all composite valued indexes of @param array to 1, leaving all prime valued indexes at 0 (which is default when the array is created). Indexes 0 and 1 are ignored.
	 */
	
	public static int[] Sieve(int n){
		int[] array = new int[n+1];
		int sqrt = (int) Math.sqrt(n);
		
		//start at 2, the first prime number
		for (int i=2; i<sqrt+1; i++){
			if(array[i] == 0){
				// for x = i^2, i^2+i, i^2+2i, ..., x is composite 
				for(int j=0; j<n; j++){
					if((i*i)+j*i < n+1){
						array[(i*i)+j*i]=1;
					}
				}
			}
		}
		
		return array;
	}
	
	/* 
	 * @param n
	 * 		- the given integer for which highest factor is being calculated
	 * 
	 * @param arr
	 * 		- array which contains potential factors of n
	 * 
	 * @param x
	 * 		- the highest factor
	 * 
	 * @param sqrt
	 * 		- square root of n
	 * 
	 * Iterates backwards through the given array, returning the first (and therefore highest) value that is a factor of the given integer.
	 */
	
	public static int highestFactor(long n){
		int x = 0;
		int sqrt = (int) Math.sqrt(n);
		int[] arr = Sieve(sqrt);
		
		for(int i=arr.length-1; i>1; i--){
			//if current index is prime
			if(arr[i] == 0){
				//check if it's a factor of n
				if(n % i == 0){
					//if yes, return x
					x = i;
					return x;
				}
			}
		}
		
		return x;
	}

	public static void main(String[] args) {
		System.out.println(highestFactor(new Long("600851475143")));
	}

}
