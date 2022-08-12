//student is pass or not

import java.util.Scanner;

class Student{
	public static void main(String args[]){
	
		int marks;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your marks: ");
		marks=sc.nextInt();
		
		if(marks>=40 && marks<=100){
			System.out.println("Pass" +marks);
		}
		else if(marks<=40){
		System.out.println("Fail" +marks);
		}
		else{
			System.out.println("You Enter wrong,plz try again");
		}
	}
}