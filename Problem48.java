package problems;

import java.math.BigInteger;

public class Problem48 {
	public static void solve(long max){
		BigInteger sum = BigInteger.ZERO;
		for(int i=1;i<=max;i++){
			BigInteger temp=BigInteger.valueOf(i);
			temp=temp.pow(i);
			sum=sum.add(temp);
		}
		System.out.println("The sum "+sum);
	}
}
