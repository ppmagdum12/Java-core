import java.util.*;
interface Taxable{
	int saletax = 7;
	double incometax = 10.5;
	void caltax();
}
class Employee implements Taxable{
	int empid;
	int salary;
	String name;
	double taxx;
	Employee(int empid,int salary,String name ){
		
		this .empid=empid;
		this.salary=salary;
		this.name=name;
	}
	
	public void caltax(){
	
	    taxx = salary * (incometax/100);
	}
	void show(){
		
		System.out.println("Emplyee Id is: "+empid);
		System.out.println("Employee Name is:"+name);
		System.out.println("Employee Salary is: "+salary);
		System.out.println("Payable Tax is:"+taxx);
	}
}
class Product implements Taxable{
	
	int pid;
	int price;
	int quantity;
	double tax;
	Product(int pid, int price, int quantity)
	{
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	
	public void caltax(){
		double x = price/quantity;
		double y = saletax/100.0;
		tax = (x*y);
	}
	void show(){
		
		System.out.println("Product Id is: "+pid);
		System.out.println("Price of Product:"+price);
		System.out.println("Product Quantity: "+quantity);
		System.out.println("Payable sale Tax is:"+tax);
	}
}
class q49{
	public static void main(String args[]){
	Employee e  =  new Employee(112,500000,"ABCD");
	Product e1 =  new Product(12,10000,20);
	e.caltax();
	e1.caltax();
	e.show();
	e1.show();

	}
}