package problems;

import helperClasses.ReadWriteTextFile;

import java.io.File;
import java.math.BigInteger;

public class Problem13 {
	private static String answer = "";
	private static String first = "";
	private static int[][] rec ;

	public static void solve(String name,int max) {
		File cont = new File(name);
		String content = ReadWriteTextFile.getContents(cont);
		int oper =(int) Math.floor(content.length() / max);
		rec = new int [max][oper - 1];
		System.out.println("number of operands=" + oper);
		char[] tec = content.toCharArray();
		int count = 0;
		int temp = 0;
		for (int i = 0; i < content.length(); i++) {
			String s = Character.toString(tec[i]);
			if (!s.equals(" ") && !s.equals("\n")) {
				first = first + s;
				count++;
				if (count == max) {
					System.out.println("first=" + first);
					addInArray(first, temp);
					first = "";
					count = 0;
					temp++;
				}

			}
		}
		addArray();
		System.out.println("the Answer="+answer);
	}

	private static void addArray() {
		int carry = 0;
		int added = 0;
		for (int i = rec.length - 1; i >= 0; i--) {
			for (int j = 0; j < rec[rec.length - 1].length; j++) {
				System.out.println("adding "+added+"+"+rec[i][j]);
				added = added + rec[i][j];
				System.out.println("addition is "+added);
			}
			
			added = added+carry;
			if (added > 9 && i!=0) {
				int count = 0;
				int temp = added;
				while (temp > 9) {
					temp =temp - 10;
					count++;
				}
				carry = count;
				System.out.println("carry is "+carry);
				System.out.println("addition number "+i+" is "+added);
				answer = temp + answer;
				added = 0;
			}
			else{
				if(added <= 9 && i!=0){
					carry = 0;
					System.out.println("addition number "+i+" is "+added);
					answer = added + answer;
					added = 0;
				}
				else{
					answer = added + answer;
				}
			}
		}

	}
	
	private static void addInArray(String s, int count){
		for(int i=0;i<s.length();i++){
			char temp = s.charAt(i);
			String s2 = Character.toString(temp);
			int temp3 =Integer.valueOf(s2);
			rec[i][count] = temp3;
			System.out.println("adding to array "+rec[i][count]);
		}
	}

}
