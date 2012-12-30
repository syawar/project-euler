package problems;

import java.math.BigInteger;

public class Problem25 {
	public static void solve(int num){
		String val = "";
		BigInteger prev=BigInteger.ONE;
		BigInteger prev2=BigInteger.ONE;
		int count=2;
		while(val.length() < num){
			BigInteger temp = prev2;
			prev2=prev2.add(prev);
			prev=temp;
			val=prev2.toString();
			System.out.println("Current number="+val);
			count++;
		}
		System.out.println("\n\nthe Answer="+val);
		System.out.println("The count="+count);
	}
}
