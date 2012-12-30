package problems;

import helperClasses.NumStringToIntArray;

public class Problem35 {
	private static long current;
	public static void solve(){
		
	}
	private static int[] shiftRight(){
		String need = Long.toString(current);
		int[] shiftable = NumStringToIntArray.convert(need);
		int[]shifted = new int[shiftable.length];
		shifted[0]=shiftable[shiftable.length-1];
		for(int i=1;i<shiftable.length - 1;i++){
			shifted[i]=shiftable[i-1];
		}
		return shifted;
	}
	private static boolean isCircularPrime(int num){
		boolean isCP=false;
		current = num;
		while(true){
			int[] x = shiftRight();
			String y=x.toString();
			
			if(y.equals(Integer.toString(num))){
				break;
			}
		}
		
		return isCP;
	}
}
