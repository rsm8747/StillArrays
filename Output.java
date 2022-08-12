class Output{
	public static void main(String args[]){
		//int a=(7+4)/2%3;
		
		int x=5,y=9;
		int z=x-- % y++ *(++y /--x)+3;
		
		System.out.println(z);
	}
}