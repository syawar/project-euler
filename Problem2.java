package problems;

public class Problem2 {
	private static int answer=0;
	public static void solve(){
		int first=1;
		int second=2;
		int temp =1;
		if(first%2 == 0){
			answer=answer+first;
		}
		if(second%2 == 0){
			answer = answer+second;
		}
		for(int i=2;i<4000000 && second<4000000;i++){
			first=second;
			second= temp+second;
			temp = first;
			if(second%2 == 0 && second<4000000){
				answer = answer+second;
			}
		}
		System.out.println("Problem 2 answer="+answer);
	}
}
