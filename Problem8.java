package problems;

import helperClasses.ReadWriteTextFile;

import java.io.File;

public class Problem8 {
	private static int answer=0;
	public static void solve(String str){
		File theFile = new File(str);
		String theNum = ReadWriteTextFile.getContents(theFile);
		for(int i=0;i<theNum.length()-5;i++){
			char one = theNum.charAt(i);
			char two = theNum.charAt(i+1);
			char three = theNum.charAt(i+2);
			char four = theNum.charAt(i+3);
			char five = theNum.charAt(i+4);
			String [] temp = new String[5];
			temp[0] = Character.toString(one);
			temp[1] = Character.toString(two);
			temp[2] = Character.toString(three);
			temp[3] = Character.toString(four);
			temp[4] = Character.toString(five);
			int tempo = Integer.valueOf(temp[0])*Integer.valueOf(temp[1])*Integer.valueOf(temp[2])*Integer.valueOf(temp[3])*Integer.valueOf(temp[4]);
			if(tempo > answer){
				answer = tempo;
			}
		}
		System.out.println("The largest product is="+answer);
	}
}
