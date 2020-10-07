import java.util.*;
class q14{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Year");
		int year = sc.nextInt();
		if(year%400 == 0 && year%4 == 0){
			System.out.println("The Year" + year +" is Leap");
		}
		else{
			System.out.println("The Year" + year +" is Not Leap");
		}
		
	}
}