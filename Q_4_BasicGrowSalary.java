
import java.util.Scanner;
public class Q_4_BasicGrowSalary {
	public static void main(String[] args) {
		double basic,da,hra,gross;
		System.out.println("Enter Basic salary of the empl\n");
		
		Scanner obj1= new Scanner(System.in);
		basic=obj1.nextDouble();
		da=80*basic/100;
		hra=20*basic/100;
		gross=basic+da+hra;
		System.out.println("THe DA of Basic salary of the employee is : " +da);
		System.out.println("The HRA of Basic salary of the employee is : " +hra);
		System.out.println("The Gross salary of the employee is: " +gross);
	}

}
