import java.util.*;

class q7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enater the Matrks Of 5 Subjects");
		
		int subjects  = 5;
		int sum = 0;
		for(int i=1; i<=subjects;i++){
		System.out.println("Enter Subject "+i+" Marks");
		int marks = sc.nextInt();
		sum=sum+marks;
		//sum += marks
		}
		System.out.println("Total Marks"+sum);
		
		double per = ((sum/500.0)*100.0);
		System.out.println("Percentage marks = "+per+" %");
	}
}