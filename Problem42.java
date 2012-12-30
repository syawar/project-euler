package problems;

import helperClasses.AlphaSortArray;
import helperClasses.CommaSeparateToArray;
import helperClasses.ReadWriteTextFile;
import helperClasses.WordValue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Problem42 {
	public static void solve(String filename) throws FileNotFoundException, IOException{
		File file = new File(filename);
		String content = ReadWriteTextFile.getContents(file);		
		String [] names = CommaSeparateToArray.convert(content);
		names=AlphaSortArray.sortStringExchange(names);
		int maxValue = 0;
		for(int i=0;i<names.length;i++){
			//System.out.println(names[i]+" value="+WordValue.getValue(names[i]));
			if(WordValue.getValue(names[i])>maxValue){
				maxValue=WordValue.getValue(names[i]);
			}
			
		}
		ArrayList<Double> tri = new ArrayList<Double>();
		Double value=0.0;
		int count=0;
		while(value<maxValue){
			value=0.5*count*(count+1);
			tri.add(value);
			count++;
		}
		int triCount=0;
		for(int i=0;i<names.length;i++){
			double temp = WordValue.getValue(names[i]);
			if(tri.contains(temp)){
				triCount++;
			}
		}
		System.out.println("The Triangle count="+triCount);
		
	}
	private static boolean checkTri(int value){
		boolean isTri = false;
		int currValue = 0;
		int count=0;
		while(currValue<value){
			currValue=(int) (0.5*count*(count+1));
			if(value==currValue){
				return true;
			}
			count++;
		}
		return isTri;
	}
}
