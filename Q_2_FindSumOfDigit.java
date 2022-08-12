import java.util.Scanner;
public class Q_2_FindSumOfDigit {
	public static void main(String[] args) {
		int num,digit,sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		num=sc.nextInt();
		
		while(num>0) {
				//here we find last digit of the given num
				digit=num%10;
				
				//add last digit to the variable sum
				sum=sum+digit;
				
				//removes the last digit from the number
				num=num/10;
		}
		System.out.println("Sum of DIGIT is " +sum);
	}//main ends here 

}//class ends 
