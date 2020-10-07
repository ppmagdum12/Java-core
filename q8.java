import java.util.*;
class q8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
			System.out.println("Eneter Principalamt ,roi and time");
			double prince = sc.nextDouble();
			double roi = sc.nextDouble();
			double time = sc.nextDouble();
			double SI = (prince*roi*time)/100;
			//double S = IA-prince;
			System.out.println(SI);
	}
}