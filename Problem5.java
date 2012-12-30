package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * notes.
 * this is a bad solution:
 * my original solution of search all prime and greatest power of 3 and greatest power of 2 was correct.
 * @author saqib
 *
 */
public class Problem5 {
	public static int answer = 1;
	public static void solve() throws NumberFormatException, IOException{
		System.out.println("The number:");
		BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(is.readLine());
		checkEven(number);
		System.out.println("the answer="+ answer);
	}
	
	private static void checkEven(int max){
		boolean even = false;
		boolean broken = false;
		int notEven = max;
		while(!even){
			for(int i=1;i<max;i++){
				if(notEven%i != 0){
					broken = true;
					break;
				}
			}
			if(broken){
				notEven++;
				broken=false;
			}
			else{
				even = true;
				answer = notEven;
			}
		}
		
	}
}
