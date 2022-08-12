
public class Ascii{
	public static void main(String args[]){
		char ch='b';
		System.out.println(ch);//b
		System.out.println((int)ch);//98
		System.out.println('B');
		System.out.println((int)'B');//6
		System.out.println(ch-32);//66
		System.out.println((char)(ch-32));//B
		System.out.println((char)ch-32);// 66 bcz ch is casting in Char only so arithmetic operation
		System.out.println(ch1-32);
	}
}