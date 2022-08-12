//atm machine 4530 (notes like 2000,500,200,100,50)

import java.util.Scanner;
class AtmMachine{

	public static void main(String args[]){
			
			int moneyValue,twoThousand,fiveHundred,twoHundred,hundred,fifty;
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Enter Amount:  ");
			moneyValue=sc.nextInt();
			
			if(moneyValue>10000){
				System.out.println("ATM Cash Limit Exceeds");
				
			}
			else{
					System.out.println("Your Transaction Being Proceed Please wait a min..");
			
					twoThousand=moneyValue/2000;
					System.out.println("2000Rs. Notes are: "+twoThousand);
					moneyValue=moneyValue%2000;
					
					
					fiveHundred=moneyValue/500;
					System.out.println("500Rs. Notes Are: "+fiveHundred);
					moneyValue=moneyValue%500;
					
					twoHundred=moneyValue/200;
					System.out.println("200Rs. Notes are: " +twoHundred);
					moneyValue=moneyValue%200;
					
					hundred=moneyValue/100;
					System.out.println("100Rs. Notes are: " +hundred);
					moneyValue=moneyValue%100;
					
					fifty=moneyValue/50;
					System.out.println("50Rs. Notes are: " +fifty);
					moneyValue=moneyValue%50;
					
					
						if(moneyValue==0){
								System.out.println("\n\nCOLLECT YOUR CASH" );
						}
						else if(moneyValue<50){
							System.out.println("Dont Worry Your Remaning Amount Is Not DEDUCTED.It is SAVE in Your ACCOUNT Rs."+moneyValue);
						}
						
						
				}	
				
			
			
			
	
		
		
	}

}