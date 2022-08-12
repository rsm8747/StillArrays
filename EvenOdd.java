//EvenOdd

import java.util.Scanner;
class EvenOdd{
	public static void main(String args[]){
		int num;
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number" );
		num=sc.nextInt();
		
		if(num%2!=0)
			System.out.println("Odd Num" +num);
		
		else
			System.out.println("Even Number" +num);
	}
}//class ends 