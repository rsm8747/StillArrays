//gave input l result is L not int 

import java.util.Scanner;
public class AsciiValue{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any character: ");
		char ch=sc.nextLine().charAt(0);
		
		if(ch>='A' && ch<='Z'){
			System.out.println("Its Capital: "+ch);
			System.out.println("Ascii Value is: "+ (ch-32));//checked it 
			System.out.println("Small letter: "+ ((char)(ch+32)));
		}
		else if(ch>='a' && ch<='z'){
			System.out.println("Its small Letter: "+ch);
			
			System.out.println("Ascii Value is: "+ ((int)ch));
			System.out.println("Capital: "+ ((char)(ch-32)) );
		}
		else{
			System.out.println("Please enter character, try again !");
		}
	}
}