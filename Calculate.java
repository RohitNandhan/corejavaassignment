package classexample;

public class Calculate {
	public int add(int a,int b) {
		return a+b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public int max(int a[]) {
		int max=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
	public int divide(int a,int b) {
		return a/b;
	}
}

