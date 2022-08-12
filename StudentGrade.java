//3 sub ph che math
//total 
//per 
//80 A+

import java.util.Scanner;
public class StudentGrade{
	public static void main(String args[]){
		float ph,che,math;
		Scanner  sc= new Scanner(System.in);
		System.out.println("Enter Marks of Physics: ");
		ph=sc.nextFloat();
		
		System.out.println("Enter Marks of Chemistry: ");
		che=sc.nextFloat();
		
		System.out.println("Enter Marks of Math: ");
		math=sc.nextFloat();
		
		float total= ph+ che+math;
		System.out.println("Total Marks: " +total);
		
		float per=total/3;
		System.out.println("Percentage is : "+per);
		
		if(per>=80){
			System.out.println("Grade: A+" );
		}
		else if(per>=70){
			System.out.println("Grade: A" );
		}
		else if(per>=60){
			System.out.println("Grade: B+" );
		}
		else if(per>=50){
			System.out.println("Grade: B" );
		}
		else if(per>=40){
			System.out.println("Grade: C" );
		}
		else {
			System.out.println("Grade: FAIL" );
		}
		
	}
}