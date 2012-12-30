package problems;

public class Problem40 {
	public static void solve(int max,int maximal){
		String cont="";
		for(int i=0;i<=max && cont.length() <= maximal+1;i++){
			cont=cont+i;
			System.out.println("currently added="+i);
		}
		int count = 1;
		while(count<=maximal){
			System.out.println("the char at "+count+"="+cont.charAt(count));
			count*=10;
		}
		
	}
}
