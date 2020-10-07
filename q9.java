import java.util.*;
class q9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		int year = days/365;
		int da = days%365;
		int day = da%30;
		int month = da/30;
		System.out.println("days in Year = " +year + " Month = " + month + " and days =" +day);
	}
}