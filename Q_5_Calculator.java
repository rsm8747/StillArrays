
import java.util.Scanner;

public class Q_5_Calculator {
	public static void main(String[] args) {
		double num1,num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First value");
		num1=sc.nextDouble();
		System.out.println("Enter First value");
		num2=sc.nextDouble();
		
		System.out.println("Enter an operator (+,-,*,/): ");
		char operator= sc.next().charAt(0);
		
		sc.close();
		double output;
		
		switch(operator) {
		
		case '+':
			output=num1+num2;
			break;
		case '-':
			output=num1-num2;
			break;
		case '*':
			output=num1*num2;
			break;
		case '/':
			output=num1/num2;
			break;
			
		default:
			System.out.println("Oops you enter wrong, try again");
		}
		System.out.println(num1+" "+operator+" "+num2+": "+output);
		
		
	}

}
