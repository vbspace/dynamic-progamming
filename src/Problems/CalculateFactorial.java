package Problems;

/**
 * 
 * @author vbtapper
 *
 * Giving n calculate n! for all n >= 1
 * 
 * Time - O(n)
 * Space - O(n)
 */
public class CalculateFactorial {

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	
	public static long factorial(int n) {
		
		long[] fact = new long[n+1];
		
		fact[0] = 1;
		for(int i = 1; i <= n; i++) {
			fact[i] = fact[i-1] * i;
		}
		
		return fact[n];
	}

}
