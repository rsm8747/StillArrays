public class SumOfNaturalNum{
	public static void main(String[] args){
		int i=1,sum=0,num=10;
		do{
			sum=sum+i;
			System.out.println(sum);
			//System.out.println(sum+i);
			i++;
		}while(i<=num);
		System.out.println(sum);
	}
}