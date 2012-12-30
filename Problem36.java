package problems;

import helperClasses.PalindromeNumber;
import helperClasses.PalindromeString;

public class Problem36 {
	private static int sum = 0;
	public static void solve(int max){
		for(int i=0;i<max;i++){
			String num = Integer.toBinaryString(i);
			if(PalindromeNumber.isPalindrome(i) && PalindromeString.isPalindrome(num)){
				sum+=i;
			}
		}
		System.out.println("the total num="+sum);
	}
}
