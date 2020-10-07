import java.util.*;
class q10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temp in Fahreinite ");
		double f = sc.nextDouble();
		double c = 5 * ((f-32)/9);
		System.out.println("The temp In Celcius " + c);
	}
}