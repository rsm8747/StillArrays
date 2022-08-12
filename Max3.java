//max of 3 number
public class Max3{
	public static void main(String args[]){
		int x=89,y=120,z=200;
/*		System.out.println("value of X: "+x);
		System.out.println("value of Y: "+y);
		System.out.println("value of Z: "+z);
		System.out.println("\n....  Greater   ....  ");	
		
		if(x>y && y>z){
			System.out.println("x is greater" +x);
		}
		else if(y>x && y>z){
			System.out.println("y is greater" +y);
		}
		else 
			System.out.println("       Z is greater: " +z);
		*/
		
		
		//By using Ternary Operator
		
		int max=(x>y && x>z) ? "x is greater" : (y>x && y>z) ? "y is greater" : "Z is greater";
		System.out.println(max);
	}
}