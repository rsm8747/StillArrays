import java.util.Scanner;
public class Q_1_FindMazNum {
	public static void main(String[] args) {
		int larg,temp,num1,num2,num3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		num1=sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		num2=sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		num3=sc2.nextInt();
		
		System.out.println("First Number is: " +num1);
		System.out.println("Second Number is: " +num2);
		System.out.println("Third Number is: " +num3);
		
		
		temp=num1>num2?num1:num2;
		System.out.println("Temp is "+temp);
		
		larg=num1>num2?num3:temp;
		System.out.println("Largest Number is "+larg);
		
	}

}
