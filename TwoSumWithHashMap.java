/*
Problem 1. Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*/

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class TwoSumWithHashMap
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements to store: ");
		int n = sc.nextInt();
		int nums[] = new int[n];
		System.out.println("Enter the elements: "); 
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
        Map<Integer, Integer> map = new HashMap<>(); 
        for (int i = 0; i < nums.length; i++)
        {
            int diff = target - nums[i];
            if (map.containsKey(diff))
            {
                return new int[] {map.get(diff), i};
            }
            map.put(nums[i], i);    
        }
        throw new IllegalArgumentException("no numbers found");
    }
}
