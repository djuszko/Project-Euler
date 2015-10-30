package euler;
/**
*  Author: Daniel Juszko
**/

/* 
 * https://projecteuler.net/problem=4
 * 
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 Å~ 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Problem_004 {

	/* 
	 * Detects if the inputted number is palindromic. Returns a boolean.
	 * Compares the first number to the last, then the second to the second-last, etc., until reaching the middle.
	 */
	
	public static boolean isPalindrome(int n){
		boolean b = true;
		String num = Integer.toString(n);
		int l = num.length();
		
		for(int i=0; i<l/2; i++){
			if(num.charAt(i) != num.charAt(l-i-1)){
				b = false;
				break;
			}
		}
		return b;
	}
	
	/*
	 * @param m
	 * 		- number used to help find the highest n-digit value
	 * 
	 * @param temp
	 * 		- current highest palindrome
	 * 
	 * Computes the largest palindrome made from the product of two n-digit numbers.
	 * Iterates backwards through a loop, starting at the highest n-digit numbers. Returns the first palindromic number.
	 */
	
	public static int largestPalindrome(int n){
		int m = (int) Math.pow(10, n);
		int temp = 0;
		
		for(int i=m-1; i>0; i--){
			for(int j=m-1; j>0; j--){
				if(isPalindrome(i*j)){
					if(i*j > temp)
						temp = i*j;
				}
			}
		}
		return temp;
	}
	
	public static void main(String[] args) {
		System.out.println("The largest palindrome made from a product of 3-digit numbers is " + largestPalindrome(3));

	}

}
