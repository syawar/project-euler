package problems;

public class Problem28 {
	public static void solve(int max){
		long diff = 2;
		long sum = 1;
		long count = 0;
		long inc = 2;
		for(long i=3;i<=max;i+=diff){
			System.out.println(i);
			sum+=i;
			count++;
			if(count == 4){
				diff = diff+2;
				count = 0;
			}
		}
		System.out.println("sum="+sum);
	}
}
