import java.util.*;
class q15{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enater the AGE and Gender");
		int age = sc.nextInt();
		char g = sc.next().charAt(0);
		if((g == 'M' && age >= 21 ) || (g == 'F' && age >= 21)){
			System.out.println(" AGE is Eligible For Marrage");
		}
		else{
			System.out.println(" AGE is Not Eligible For Marrage");
		}
	}
} 