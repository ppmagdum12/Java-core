import java.util.*;
class q17{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		System.out.print("Reverse number : ");
		
		while(num > 0)
		{
			int value = num%10;
			System.out.print(value);
			num = num/10;
			
		}
	}
	}