import java.util.*;
class q4{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Entaer 2 numbers");
		
		byte b1 = sc.nextByte();
		byte b2 = sc.nextByte();
		byte b3 = (byte)(b1+b2);
		System.out.println("Sum is = "+b3);
	}
}