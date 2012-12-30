package problems;


import helperClasses.NonModTree;
import helperClasses.Tree;

import java.util.ArrayList;


public class Problem355 {
	public static ArrayList<Integer> numbers = new ArrayList<Integer>();
	//public static Tree numberTree;
	/**
	 * create the tree recursively.
	 * @param n
	 * @param limit
	 * @return
	 */
	public static NonModTree[] setTree(int n,int limit,String s){
		NonModTree[] temp = null;
		if(n<=limit){
			NonModTree [] num = new NonModTree[limit - n];
			int count=0;
			for(int i=n;i<=limit;i++){
				
					num[count] = new NonModTree(i);
					num[count].s += ","+s+","+Integer.toString(num[count].cargo);
					count++;
				
				
			}
			for(int j=0;j<count;j++){
				temp = setTree(num[j].cargo,limit,Integer.toString(n));
				System.out.println(num[j]);
				
			}
		}
		return temp;
		
	}
	public static void solve(int num){
		NonModTree[] t =setTree(1, num,"");
		//System.out.println(t.toString());
		//printTree(t);
		
	}
}

