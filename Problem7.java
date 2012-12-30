package problems;

public class Problem7 {
	private static int answer;
	public static void solve(int num){
		int count = 1;
		int number = 2;
		while(count < num+1){
			if(checkPrime(number)){
				count++;
				answer = number;
			}
			number++;
		}
		System.out.println("The "+num+" prime number is:"+ answer);
	}
	
	private static boolean checkPrime(int pr) {
		boolean isPrime=false;
		int num = pr;
		int i;
		for (i = 2; i < num; i++) {
			int n = num % i;
			if (n == 0) {
				break;
			}
		}
		if (i == num) {
			isPrime = true;
		}
		return isPrime;
	}

}
