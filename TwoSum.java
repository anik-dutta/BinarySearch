/*
Problem 1. Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*/

import java.util.Scanner;
public class TwoSum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements u want to store: ");
		int n = sc.nextInt();
		int nums[] = new int[n];
		System.out.println("Enter the elements of the array: "); 
		for (int i = 0; i < n; i ++)
		{
			nums[i] = sc.nextInt();
		}
		System.out.print("\nEnter the target: ");
		int target = sc.nextInt();
		Solution ob = new Solution();
		int result[] = ob.twoSum(nums, target);
		System.out.print(result[0] + " " + result[1]);
		
	}
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++)
        {
            for (int j = i + 1; j< nums.length; j ++)
            {
                if(nums[i] + nums[j] == target)
                {
                    return new int[] {i, j};
                }
            }
        }
        //return new int[]{-1,-1};
		throw new IllegalArgumentException("no numbers found");
    }
}
