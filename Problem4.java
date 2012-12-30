package problems;

public class Problem4 {
	private static int answer = 0;

	public static void solve() {
		boolean palindrome = false;
		for (int i = 999; i > 99 ; i--) {
			for (int j = 999; j > 99 ; j--) {
				int result = i * j;
				String pro = String.valueOf(result);
				palindrome=isPalindrome(pro);
				if(palindrome){
					if(result > answer){
						answer = result;
					}
					palindrome=false;
				}
			}
		}
		System.out.println("Largest palindrome ="+ answer);
	}

	// ========================================================= isPalindrome
	// This method returns 'true' if the parameter
	// is a palindrome, a word that is spelled the
	// same both forwards and backwards, eg, radar.

	private static boolean isPalindrome(String word) {
		int left = 0; // index of leftmost unchecked char
		int right = word.length() - 1; // index of the rightmost

		while (left < right) { // continue until they reach center
			if (word.charAt(left) != word.charAt(right)) {
				return false; // if chars are different, finished
			}
			left++; // move left index toward the center
			right--; // move right index toward the center
		}

		return true; // if finished, all chars were same
	}
}
