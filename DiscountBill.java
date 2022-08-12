
import java.util.Scanner;
public class DiscountBill{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Quantity: ");
		float quantity=sc.nextFloat();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Price: ");
		float price=sc.nextFloat();
		float discount;
		float amount=quantity*price;
		System.out.println("Price for 1 Item: "+price);
		System.out.println("Your Quantity is: "+quantity);
		
		if(amount>=5000){
			
			discount=amount-(amount*5/100);
			float dis=amount-discount;
			System.out.println("Total amount is: "+amount);
			System.out.println("Total Discount You got is 5% ");
			System.out.println("Discount amount is: "+dis);
			System.out.println("Amount to pay: "+discount);
			
		}
		else{
			System.out.println("Your total amount below 500 so you cant get discount");
			System.out.println("Total amount to pay: "+amount);
		}
		
	}
}