package problems;

import helperClasses.PrimeArray;
//import helperClasses.isPrime;

public class Problem10 {
	private static long answer = 0;
	public static void solve(int num){
		PrimeArray look = new PrimeArray(num);
		look.fillSieve();
		for(int i = 0;i<num;i++){
			if(look.isPrime(i)){
				answer+=i;
			}
		}
		System.out.println("The answer="+answer);
	}
}
