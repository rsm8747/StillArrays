import java.util.Scanner;
public class User{
	public static void main(String[] args){
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of A: " );
			a=sc.nextInt();
			System.out.println("Value of A is" +a );
			sc.close();
			
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter value of B " );
		b=sc1.nextInt();
		System.out.println("Value of B is ");
		sc1.close();
		
		int c=a+b;
		System.out.println("Addition of a and b is " +c);
	}//main() ends 
}//class ends