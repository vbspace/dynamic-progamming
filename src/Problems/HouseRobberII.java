package Problems;

/**
 * You are a professional robber planning to rob houses along a street. 
 * Each house has a certain amount of money stashed. 
 * All houses at this place are arranged in a circle. 
 * That means the first house is the neighbor of the last one. 
 * Meanwhile, adjacent houses have security system 
 * connected and it will automatically contact the police 
 * if two adjacent houses were broken into on the same night.
 *
 * Given a list of non-negative integers representing 
 * the amount of money of each house, determine the maximum 
 * amount of money you can rob tonight without alerting the police.
 *
 * @author vbtapper
 *
 */
public class HouseRobberII {

	public static void main(String[] args) {
		int[] nums = {2, 3, 2};
		System.out.println(rob(nums));
		
		int[] nums1 = {1, 2, 3, 1};
		System.out.println(rob(nums1));
		
		int[] nums2 = {4, 9, 3, 1, 6};
		System.out.println(rob(nums2));
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
			
			if(i == nums.length) {
				// if we used the first value, we should skip the last
				if(robbedSoFar[i] - nums[0] == robbedSoFar[i - 1] - 1)  
					continue;
			}
			
			maxSoFar = Math.max(maxSoFar, robbedSoFar[i]);
		}
		
		return maxSoFar;
    }
}
