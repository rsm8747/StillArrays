//ternary operator
import java.util.Scanner;
public class TernaryStudentPassFail{
	public static void main(String args[]){
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter Sub1 Marks: ");
		int sub1=sc1.nextInt();
		
		Scanner sc2= new Scanner(System.in);
		System.out.println("Enter Sub2 Marks: ");
		int sub2=sc2.nextInt();
		
		Scanner sc3= new Scanner(System.in);
		System.out.println("Enter Sub3 Marks: ");
		int sub3=sc3.nextInt();
		
		float per=(sub1+sub2+sub3)/3;
		
		
		String mm=per>40 ? "Student is pass : "  +per : "Student Fail :"+per;
		System.out.println(mm);
		
	}
}