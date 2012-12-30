package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem6 {
	private static int answer=0;
	public static void solve() throws NumberFormatException, IOException{
		System.out.println("Problem 2 max:");
		BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
		int limit = Integer.parseInt(is.readLine());
		makeAnswer(limit);
		System.out.println("Problem3 answer="+answer);
		
	}
	private static void makeAnswer(int max){
		for(int i=1;i<max;i++){
			for(int j=i+1;j<=max;j++){
				//System.out.println("i="+i+" j="+j);
				answer = answer+2*i*j;
			}
		}
	}
}
