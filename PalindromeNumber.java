/*
Problem 7: Palindrome Number

Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
*/

import java.util.Scanner;
public class PalindromeNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int x = sc.nextInt();
		Solution ob = new Solution();
		System.out.print(ob.isPalindrome(x));
		
	}
}
class Solution {
    public boolean isPalindrome(int x) {
        int n = x, sum = 0;
        while (n > 0)
        {
            sum = sum * 10 + n % 10;
            n /= 10;
        }
		return x == sum;
    }
}