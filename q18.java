import java.util.*;
class q18{
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		 int n = sc.nextInt();
		 int f=0;
		 for (int i = 2; i < n/2; i++)
		 {
			 if(n%i == 0)
			 {
				 f=1;
				 break;
			 }
		 }
		 if(f == 1)
		 {
			 System.out.println("Not prime");
		 }
		 else
		 {
			 System.out.println("Prime");
		 }
	}
}