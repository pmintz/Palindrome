package palindrome;


import java.util.ArrayList;
import java.util.List;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "aba";
		String s2 = "abcaaabcbbabcdcba";
		printLargestPalindrome(findPalindromes(s1));
		printLargestPalindrome(findPalindromes(s2));
		

	}
	
	public static List<String> findPalindromes(String s) {
		List<String> palindromes = new ArrayList<>();
		for(int y = s.length(); y >= 0; y-- ) { 
			inner : for(int x = 0; x< s.length(); x++) {
				String forwards = s.substring(x, y);
				String reverse = new StringBuilder(forwards)
						.reverse().toString();
				if(forwards.length() <= 1)
					break inner;
				if(reverse.equalsIgnoreCase(forwards))
						palindromes.add(forwards);
				
			}
			
		}
		return palindromes;
	}
	
	public static void printLargestPalindrome(List<String> palindromes) {
		String largestPalindrome = "";
		for(String x: palindromes) {
			if(x.length() > largestPalindrome.length())
				largestPalindrome = x;
		}
		System.out.println("printing largest palindromes");
		System.out.println(largestPalindrome);
		System.out.println("-------------");
	}

}
