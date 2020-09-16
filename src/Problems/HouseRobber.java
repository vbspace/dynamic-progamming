package Problems;

/**
 * 
 * @author vbtapper
 * 
 * You are a professional robber planning to rob houses along a street. 
 * Each house has a certain amount of money stashed, the only constraint 
 * stopping you from robbing each of them is that adjacent houses have 
 * security system connected and it will automatically contact the 
 * police if two adjacent houses were broken into on the same night.
 *
 * Given a list of non-negative integers representing the amount of 
 * money of each house, determine the maximum amount of money you 
 * can rob tonight without alerting the police.
 * 
 * URL : https://leetcode.com/problems/house-robber/
 * 
 * Time : O(n), n is the size of the input array
 * Space : O(n) 
 *
 */
public class HouseRobber {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 1};
		System.out.println(rob(nums));
		
		int[] nums1 = {2, 7, 9, 3, 1};
		System.out.println(rob(nums1));
	}

	public static int rob(int[] nums) {
        
		if(nums.length == 0) return 0;
		if(nums.length == 1) return nums[0];
		
		int[] robbedSoFar = new int[nums.length + 1];
		
		robbedSoFar[0] = 0;
		robbedSoFar[1] = nums[0];
		robbedSoFar[2] = Math.max(nums[0], nums[1]);
		
		int maxSoFar = robbedSoFar[2];
		for(int i = 3; i <= nums.length; i++) {
			robbedSoFar[i] = robbedSoFar[i-2] + nums[i-1];
			maxSoFar = Math.max(maxSoFar, robbedSoFar[i]);
		}
		
		return maxSoFar;
    }
}
