package Problems;

import java.util.*;

/**
 * 
 * @author vbtapper
 *
 * Given a non-empty string s and a dictionary wordDict containing 
 * a list of non-empty words, determine if s can be segmented into a 
 * space-separated sequence of one or more dictionary words.
 *
 * Note:
 *
 * The same word in the dictionary may be reused multiple times in the segmentation.
 * You may assume the dictionary does not contain duplicate words.
 * 
 * Example 1:
 *
 * Input: s = "leetcode", wordDict = ["leet", "code"]
 * Output: true
 *
 * Explanation: Return true because "leetcode" can be segmented as "leet code".
 *
 * Example 2:
 *
 * Input: s = "applepenapple", wordDict = ["apple", "pen"]
 * Output: true
 * Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
 *            Note that you are allowed to reuse a dictionary word.
 * Example 3:
 *
 * Input: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
 * Output: false
 * 
 * Time : O(n * d), where n is the size of wordDict and d is the length of s
 * Space: O(1)
 * 
 */
public class WordBreak {

	public static void main(String[] args) {
		String s = "leetcode";
		List<String> wordDict = new ArrayList<String>();

		wordDict.add("leet");
		wordDict.add("code");
		
		System.out.println(wordBreak(s, wordDict));
		
		String ss = "catsandog";
		List<String> wordDict2 = new ArrayList<String>();
		
		wordDict2.add("cats");
		wordDict2.add("dog");
		wordDict2.add("sand");
		wordDict2.add("and");
		wordDict2.add("cat");
		
		System.out.println(wordBreak(ss, wordDict2));
	}
	
	public static boolean wordBreak(String s, List<String> wordDict) {
		int n = wordDict.size();
		int seguementsFound = 0;
		
		for(int i = 1; i <= n; i++) {
			int found = compareSeguement(s, wordDict.get(i-1));
			
			seguementsFound = found + seguementsFound;
			if(found == 1) {
				s = updateSeguement(s, wordDict.get(i-1));
			}
		}
		
		return seguementsFound == n ? true : false;
    }
	
	/**
	 * 
	 * @param s
	 * @param str
	 * @return 1 if str can be found s, 0 otherwise
	 */
	public static int compareSeguement(String s, String str) {		
		return s.indexOf(str) >= 0 ? 1 : 0;
	}
	
	/**
	 * 
	 * @param s
	 * @param str
	 * @return remove all occurrence of str in s
	 */
	public static String updateSeguement(String s, String str) {
		return s.replaceAll(str, "");
	}

}
