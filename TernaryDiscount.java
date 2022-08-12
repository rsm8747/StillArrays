
import java.util.Scanner;
public class TernaryDiscount{
	public static void main(String args[]){
		
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter Price for 1 Item: ");
		float price=sc1.nextFloat();
		
		Scanner sc2= new Scanner(System.in);
		System.out.println("Enter Quantity of Item : ");
		float quantity=sc2.nextFloat();
		
		float totalAmount=price*quantity;
		//System.out.println("Total Amount is: "+totalAmount);
	
		float dis1=totalAmount-(totalAmount*5)/100;
		float disAmt=totalAmount-dis1;
		String dis=totalAmount>=5000 ? "You Got Discount of 5% just pay:  " +dis1 : "Total Amount is: "+totalAmount; 
		
		
		  
		System.out.println("Total Amount is: " +totalAmount);
		//System.out.println("You Got 5% Discount  : " +disAmt);
		System.out.println(dis);
		//System.out.println("Amount to pay: " +dis1);
		
	}
}