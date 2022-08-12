import java.util.Scanner;
public class Circle {
	public static void main(String[] args) {
		float pi=3.14f;
		float rad;
		float ac;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle");
		rad=sc.nextFloat();
		
		System.out.println("You entered rad of circle is " +rad);
		sc.close();
		ac=pi*(rad*rad);
		System.out.println("Area of Circle is " +ac);
		
	}

}
