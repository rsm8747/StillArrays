class Unary{
	public static void main(String args[]){
		//1st operation
		int x=5;
		int y=9;
		int z;
		z=++x - --y + x++ *2/y++;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		//2nd operation
		int z1=x-- % y++ *(++y/--x)+3;
		System.out.println(z1);
	}
}