import java.util.Scanner;
public class StudentGrade2{
	public static void main(String args[]){
		float math,chem,ph,per,total,avg;
		int omath,ochem,oph;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of Math :");
		math=sc.nextFloat();
		
		Scanner osc = new Scanner(System.in);
		System.out.println("Math marks out off: ");
		omath=osc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter marks of Chemistry :");
		chem=sc1.nextFloat();
		
		Scanner osc1 = new Scanner(System.in);
		System.out.println("Chemistry marks out off: ");
		ochem=osc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter marks of physics :");
		ph=sc2.nextFloat();
		
		Scanner osc2 = new Scanner(System.in);
		System.out.println("Physics marks out off: ");
		oph=osc2.nextInt();
		
		
		float outOff=omath+ochem+oph;
		
		total=math+chem+ph;
		System.out.println("Total marks: "+total);
		
		System.out.println("outOff: "+outOff);
		
		per=(total/outOff)*100;
		System.out.println("Total Percetage: "+per);
		
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