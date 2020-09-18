package Problems;

/**
 * 
 * @author vbtapper
 * 
 * A robot is located at the top-left corner of a m x n grid 
 * 
 * The robot can only move either down or right at any point in time. 
 * The robot is trying to reach the bottom-right corner of the grid 
 * 
 * How many possible unique paths are there?
 *
 * Time: O(m*n)
 * Space: O(m*n)
 */
public class UniquePaths {

	public static void main(String[] args) {
		System.out.println(uniquePaths(3, 7));
		System.out.println(uniquePaths(3, 2));
	}
	
	public static int uniquePaths(int m, int n) {
        int[][] ways = new int[m][n];
        
        ways[0][0] = 1;
        for(int i = 0; i < m; i++) {
        	for(int j = 0; j < n; j++) {
        		if(i > 0 && j > 0) {
        			ways[i][j] = ways[i-1][j] + ways[i][j-1];	
        		}
        		else if(i > 0 && j == 0) {
        			ways[i][j] = ways[i-1][j];
        		}
        		else if(j > 0 && i == 0) {
        			ways[i][j] = ways[i][j-1];
        		}
        	}
        }
        
        return ways[m-1][n-1];
    }

}
