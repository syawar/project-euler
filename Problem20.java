package problems;

import helperClasses.NumStringToIntArray;

import java.math.BigInteger;

public class Problem20 {
	private static BigInteger answer=BigInteger.ONE;
	public static void solve(int num){
		for(long i=num;i>0;i--){
			answer=answer.multiply(BigInteger.valueOf(i));
		}
		String check = answer.toString();
		int[] numSt=NumStringToIntArray.convert(check);
		int ans = 0;
		for(int j=0;j<numSt.length;j++){
			ans=ans+numSt[j];
		}
		System.out.println("The factorial="+answer);
		System.out.println("The sum="+ans);
	}
}
