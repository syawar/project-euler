package problems;

import java.math.BigInteger;
import java.text.NumberFormat;

public class Problem16 {
	public static void solve(int power){
		BigInteger two = new BigInteger("2");
		BigInteger value = two.pow(power);
		BigInteger sum = BigInteger.ZERO;
		while (value.compareTo(BigInteger.ZERO) == 1) {
		  sum=sum.add(value.remainder(new BigInteger("10")));
		  value = value.divide(new BigInteger("10"));
		}
		System.out.println("The answer="+ sum);
	}
}
