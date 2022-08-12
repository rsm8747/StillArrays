//days 

import java.util.Scanner;
class Days{
	public static void main(String args[]){
		int month, year, week, day;
		
		
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of days:");
        month = s.nextInt();
		
        year = month / 365;
        
		month = month % 365;
        System.out.println("No. of years:"+year);
	
        
		week = month / 7;
        
		month = month % 7;
        
		System.out.println("No. of weeks:"+week);
        day = month;
        System.out.println("No. of days:"+day);
		
		
	}
}