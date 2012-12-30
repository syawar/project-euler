package problems;

import java.util.ArrayList;

public class Problem29 {
	private static ArrayList<Double> power = new ArrayList<Double>();
	public static void solve(int aB,int aU,int bB, int bU){
		for(int i=aB;i<=aU;i++){
			for(int j=bB;j<=bU;j++){
				double temp=Math.pow(i, j);
				if(!power.contains(temp)){
					power.add(temp);
				}
			}
		}
		System.out.println("Number of distinct powers="+power.size());
	}
}
