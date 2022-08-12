
import java.util.Scanner;
public class Convert{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Char: ");
		char ch = sc.next().charAt(0);
		System.out.println("ASCII Value:  " +(int)ch);
		
		char ch1='b';
		System.out.println(ch1-32);
		System.out.println(ch1+18);
		
		System.out.println(ch1);
		System.out.println((char)66);
		System.out.println((char)(char-32));
	}
}