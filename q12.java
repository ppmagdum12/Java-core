import java.util.*;
class q12{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Salary");
		double basic = sc.nextDouble();
		if(basic > 10000){
			double hra = basic*.10;
			double da = basic*.90;
			double gross = basic+hra+da;
			System.out.println("Gross Salary is "+ gross);
		}
		else{
			double hra = 2000;
			double da = basic*.98;
			double gross = basic+hra+da;
			System.out.println("Gross Salary is "+ gross);
		}
		
	}
	
}