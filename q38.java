class Employee{
	private int empno;
	private int salary;
	private int totalsalary;
	
	Employee(){}
	Employee(int empno,  int salary){
	this.empno=empno;
	this.salary = salary;
	}
	int getsal()
	{
		
		totalsalary += salary;
		
		return totalsalary;
		
		
	}	
	void show(){
		System.out.println("Employee ID is : " + empno);
		//System.out.println("Total Salary : "+totalsalary);
		System.out.println("Salary is : "+salary);
	}
}
class q38{
	public static void main(String args[]){
			int x=101;
	Employee e = new Employee();
	
	Employee arr[]={new Employee(x,10000),new Employee(++x,10000),
	new Employee(++x,10000),new Employee(++x,10000),
	new Employee(++x,10000)};
	int count=0;
	int z=0;
	for( Employee s : arr){
	s.show();
	int y = s.getsal();
	z += y;
	count++;
	}
	System.out.println("No of Employee: " + count);
	//int y = e.getsal();
	System.out.println("Total Salary : " + z );
	}
	
	
}