package problems;

import helperClasses.Proper;
import helperClasses.ReadWriteTextFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Problem23 {
	private static ArrayList<Integer> allAbun = new ArrayList<Integer>();
	public static void solve() throws FileNotFoundException, IOException{
		String allAb = "";
		
		for(int i=1;i<=28123;i++){
			int temp=Proper.getProp(i);//<----should be sum of factors not zero
			if(temp > i){
				allAbun.add(i);
			}
		}
		long sum=0;
		for(int l=0;l<=28123;l++){
			System.out.println("Checking-"+l);
			if(!isAbundant(l)){
				sum+=l;
			}
		}
		System.out.println("The answer="+sum);
		
		
	}
	public static boolean isAbundant(int num){
		boolean check = false;
		for(int j=0;j<allAbun.size();j++){
			for(int k=0;k<allAbun.size();k++){
				int temp = allAbun.get(j)+allAbun.get(k);
				if(temp<=28123){
					if(temp == num){
						return true;
					}
				}
				
			}
		}
		return check;
	}
}
