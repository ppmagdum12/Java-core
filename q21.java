import java.util.*;
class q21{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	int [] ar = new int[10];
	int sum=0;
	
	for(int i = 0; i < ar.length; i++)
	{
		System.out.println("Enter numbers");
		int x = sc.nextInt();
		sum = sum + x;
	}
	System.out.println(sum);
	System.out.println(sum/10);
	}
}