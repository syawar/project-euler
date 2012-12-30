package problems;

public class Problem14 {
	private static int answer = 0 ;
	private static int num = 0;
	public static void solve(long max){
		for(int i=1;i<max;i++){
			System.out.println("\nChecking chain of "+i);
			int temp=getChainLength(i);
			
			if(temp>answer){
				answer = temp;
				num = i;
			}
		}
		System.out.println("\nthe greatest chain of number="+ num+" and length="+answer);
		
	}
	public static int getChainLength(int max){
		int count = 1;
		long n=max;
		while (n != 1){
			if(n%2 == 0){
				n=n/2;
			}
			else{
				n=3*n+1;
			}
			count++;
			//System.out.print("->"+n);
		}
		return count;
	}
}
