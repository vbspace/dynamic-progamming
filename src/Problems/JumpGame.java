package Problems;

/**
 * 
 * @author vbtapper
 *
 * Given an array of non-negative integers, 
 * you are initially positioned at the first index of the array.
 *
 * Each element in the array represents your maximum 
 * jump length at that position.
 *
 * Determine if you are able to reach the last index.
 * 
 * Time : O(n), n is the length of the input array
 * Space: O(1)
 */
public class JumpGame {

	public static void main(String[] args) {
		int[] nums = {2, 3, 1, 1, 4};
		System.out.println(canJump(nums));
		
		int[] nums1 = {3, 2, 1, 0, 4};
		System.out.println(canJump(nums1));

	}

	public static boolean canJump(int[] nums) {
		if(nums.length == 0) return false;
		
        int jumpedSoFar = 0;
        for(int i = 1; i < nums.length; i++) {
        	if(nums[i-1] >= i) {
        		jumpedSoFar = nums[i - 1];
        	}
        	else {
        		jumpedSoFar = nums[i-1] + jumpedSoFar;
        	}
        }
        
        return jumpedSoFar == nums.length ? true : false;
    }
}
