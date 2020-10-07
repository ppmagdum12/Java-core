import java.util.*;
class q19{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num=2;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			num+=10;
			if(i == n-1){
				
				System.out.print("Series : " + num);
				break;
			}
			System.out.print(num + "+");
		}
		
	}
}