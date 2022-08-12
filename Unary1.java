class Unary1{
	public static void main(String args[]){
		//1st operation
		int x=5;
		int y=9;
		int z;
		
		
		
		//2nd operation
		int z1=x-- % y++ *(++y/--x)+3;
		System.out.println(z1);
		System.out.println(x);
		System.out.println(y);
		
	}
}