
public class Q_10_PrimeNumber {
	public static void main(String[] args) {
	int count,i,n=50;
	
	for(int j=2;j<=n;j++) {
		count=0;
		for(i=1;i<=j;i++) {
			if(j%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(j+ " ");
		}
	}
	
		
	
	}

}
