//menu 1. add 2.sub
import java.util.Scanner;
public class CalculatorSwitchCase{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number1: ");
		int num1=sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Number2: ");
		int num2=sc1.nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Hey,I'm Calculator Use Me for few operations.\n 1. Addition \n 2.Substraction \n 3.Multiplication \n 4.Division \n 5. Exit");
		int value=sc3.nextInt();
		switch(value){
			case 1:
				System.out.println("Addition is: "+num1+num2);
				break;
			case 2:
				System.out.println("Substraction is: "+(num1-num2));
				break;
			case 3:
				System.out.println("Multiplication is: "+num1*num2);
				break;
			case 4:
				System.out.println("Division is: "+num1/num2);
				break;
				
			case 5:
				System.exit(0);
			default:
				System.out.println("Sorry dude, you enter wrong.plz try again");
				
		}
	}
}