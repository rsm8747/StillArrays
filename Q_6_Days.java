import java.util.Scanner;

public class Q_6_Days {
	public static void main(String[] args) {
		int days;
		System.out.println("Hey, Entered day as 1-Mondays and all..");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day: ");
		days=sc.nextInt();
		
		
		switch(days) {
		
		case 1:
			System.out.println("Its Monday");
			break;
		case 2:
			System.out.println("Its Tuesday");
			break;
		case 3:
			System.out.println("Its Wednesday");
			break;
		case 4:
			System.out.println("Its Thursday");
			break;
		case 5:
			System.out.println("Its Friday");
			break;
		case 6:
			System.out.println("Its Saturday");
			break;
		case 7:
			System.out.println("Its Sunday");
			break;
			
		default:
			System.out.println("Hey you enter wrong, plz try again");
		}
	}

}
