import java.util.*;
class faculty{
	private int facid;
	private double salary;
	
	faculty(){}
	
	void input(int facid)
	{
	this.facid=facid;
	salary=0;
	}
	protected double getsalary()
	{
		return salary;
	}
	
	protected void setsalary(double salary)
	{
		this.salary=salary;
	}
	void printsalary(){
		System.out.println("The salary of faculty id :"+facid+" salary "+salary);
	}
	
}
class FullTimeFaculty extends faculty{
	private double basicsalary;
	private double allowance;
	FullTimeFaculty(){
		
		super();
		basicsalary=0;
		allowance=0;
	}
	void input(int facid,double basicsalary,double allowance)
	{
		input(facid);
		this.basicsalary=basicsalary;
		this.allowance=allowance;
		setsalary(basicsalary + allowance);
		
		
	}

}
class PartTimeFaculty extends faculty{
	private double workinghour;
	private double rateperhour;
	PartTimeFaculty(){
		
		super();
		workinghour=0;
		rateperhour=0;
	}
	void input(int facid,double workinghour,double rateperhour)
	{
		input(facid);
		this.rateperhour=rateperhour;
		this.workinghour=workinghour;
		setsalary(workinghour + rateperhour);
		
		
	}
	
}

public class q44{
	public static void main(String args[])
	{
		FullTimeFaculty f = new FullTimeFaculty();
		PartTimeFaculty p = new PartTimeFaculty();
		
		f.input(100,5000,2000);
		p.input(200,10,1000);
		f.printsalary();
		p.printsalary();
	}
}