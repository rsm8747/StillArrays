import java.util.Scanner;
class GrossSalary{
	float basic,hra,da,gross;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Basic Salary: ");
	basic=sc.nextFloat();
	
	
	da=basic*0.25;
	System.out.println("da for basic salary is : " +da);
	
	hra=basic*0.35;
	System.out.println("hra of basic salary is : "+hra);
	
	gross=basic+hra+da;
	
	if(gross>=100000){
		System.out.println("Salary is: "+gross +"He/She is Vice President");
	}
	else if(gross<100000 && gross<=80000){
		System.out.println("Salary is: "+gross +"He/She is Assi. Vice President");
	}
	else if(gross<80000 && gross>=60000){
		System.out.println("Salary is: "+gross +"He/She is Manager");
	}
	else if(gross<60000 && gross>=40000){
		System.out.println("Salary is: "+gross "+He/She is Assi. Manager");
	}
	else if(gross>40000){
		System.out.println("Salary is: "+gross "+He/She is Officer");
	}
}