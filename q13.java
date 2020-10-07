import java.util.*;
class q13{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 number");
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		
		int x =(a>b)?((a>c)? a : c) :((b>c) ? b : c);
		System.out.println("Gretest number is "+x);
	}
}