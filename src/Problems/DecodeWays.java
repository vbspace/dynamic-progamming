package Problems;

/**
 * 
 * @author vbtapper
 *
 * A message containing letters from A-Z is being 
 * encoded to numbers using the following mapping:
 * 
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * Given a non-empty string containing only digits, 
 * determine the total number of ways to decode it.
 * 
 * Time : O(n)
 * Space: O(1)
 * 
 */
public class DecodeWays {

	public static void main(String[] args) {
		System.out.println(numDecodings("12"));
		System.out.println(numDecodings("226"));
		System.out.println(numDecodings("2122116"));
	}

	public static int numDecodings(String s) {
        if(s.length() <= 1) return 1;
   
        int first = 1;
        int second = 1;
        int current = first + second;
        for(int i = 2; i <= s.length(); i++) {
        	current = first + second;
        	
        	second = first;
        	first = current;
        }
        
        return current;
    }
}
