import java.util.*;
abstract class Processor{
	
	double data;
	
	abstract void process(int i);
	
	void show()
	{
		System.out.println( "Value is: "+ data);
	}
}

class Factorial extends Processor{
	
	void process(int f)
	{
		int fact=1;
		for(int i=1; i<=f;i++)
		{
			
			fact=fact * i;
			
		}
		data=fact;
	}
}

class Circle extends Processor{
	
	void process(int r)
	{
		data = 3.14 * (r * r);
	}
	
}

class q48{
	
	
	public static void main(String args[]){
		
	Processor p =  new Factorial();
	Processor p1 = new Circle();
	System.out.println("ENTER value 1 for calculate Factorial or Press any no to clculate area of circle");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	if(num ==  1)
	{
		System.out.println("Enter no ");
		int num1 = sc.nextInt();
		p.process(num1);
		p.show();
	}else{
		System.out.println("Enter no ");
		int num1 = sc.nextInt();
		p1.process(num1);
		p1.show();
		
	}
	}
	
		
}