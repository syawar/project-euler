package problems;

public class Problem9 {
	public static void solve(){
		double temp = 0;
		int sol1=0,sol2=0;
		for(int a=0;a<1000;a++){
			for(int b=0;b<1000;b++){
				if(b>a){
					temp=a+b+Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
					if(temp == 1000){
						sol1=a;
						sol2=b;
						System.out.println("a="+sol1+" b="+sol2+" c="+Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)));
					}
				}
			}
		}
		
	}

}
