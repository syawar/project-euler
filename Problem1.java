package problems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Problem1 {
	private static int answer=0;
	public static void solve() throws IOException{
		System.out.println("The max number:");
		BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(is.readLine());
		multiply(number);
		System.out.println("Problem1:"+answer);
	}
	private static void multiply(int max){
		
		for(int i=0;i < max;i++){
			if((i%3 == 0) || (i%5 == 0)){
				answer = answer+i;
			}
		}
	}
}
