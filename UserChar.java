//sc.nextline().charAt(0);

//charAt(..here char number for scanning)

import java.util.Scanner;
public class UserChar{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter Character name: ");
		char ch=sc.nextLine().charAt(0);
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("You enter: "+ch);
		char ch1=sc1.nextLine().charAt(1);
		System.out.println("You enter: "+ch1);
		
		Scanner sc2 = new Scanner(System.in);
		char ch2=sc2.nextLine();
		System.out.println("You enter: "+ch2);
	}
}