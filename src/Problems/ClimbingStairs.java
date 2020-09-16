package Problems;

/**
 * 
 * @author vbtapper
 * 
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. 
 * In how many distinct ways can you climb to the top?
 *
 * Time - O(n); n is the amount of steps
 * Space - O(1)
 */
public class ClimbingStairs {

	public static void main(String[] args) {
		System.out.println(climbStairs(8));

	}
	
	public static int climbStairs(int n) {
        int first = 1;
        int second = 1;
        
        int current = first + second;
        for(int i = 2; i <= n; i++) {
        	current = first + second;
        	
        	first = second;
        	second = current;
        }
        
        return current;
    }

}
