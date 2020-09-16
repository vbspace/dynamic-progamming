package Problems;

/**
 * 
 * @author vbtapper
 *
 * Given an integer array with all positive numbers and no duplicates, 
 * find the number of possible combinations that add up to a positive integer target.
 * 
 * Time : O(n * target); n is the size of nums
 * Space : O(target)
 *  
 */
public class CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3};
		int target = 4;
		
		System.out.println(combinationSum4(nums, target));

	}
	
	public static int combinationSum4(int[] nums, int target) {
        
		int[] maxCombo = new int[target + 1];
		
		maxCombo[0] = 1;
		for(int i = 1; i <= target; i++) {
			for(int number : nums) {
				if(i >= number)
					maxCombo[i] += maxCombo[i-number];
			}
		}
		
		return maxCombo[target];
    }

}
