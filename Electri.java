import java.util.Scanner;
class Electri{
	public static void main(String args[]){
		float unit,amount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your ElectriCity Bill Units: ");
		unit=sc.nextFloat();
		
		if(unit<=50){
			amount=(unit*2)+100;
			System.out.println("Total Payable Amount is: "+amount);
			
		}
		else if(unit<=80){
			amount=(50*2)+((unit-50)*3)+100;
			System.out.println("Total Payable Amount is: "+amount);
			
		}
		else if(unit<=100){
			amount=(50*2)+(30*3)+((unit-80)*4)+100;
			System.out.println("Total Payable Amount is: "+amount);
		}
		else if(unit>100){
			amount=(50*2)+(30*3)+(20*4)+((unit-100)*7)+100;
			System.out.println("Total Payable Amount is: "+amount);
		}
		System.out.println("(Including all the charges 100Rs.)");
	}
}