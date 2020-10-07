/*Create a program that helps banks to maintain records. It should have following facilities. o Anybody can create current or saving account with following initial information: account number, name, balance, and branch. o display account detail for a particular accounts. o display total money deposited in bank. o allow deposit and withdrawal in an account . o for saving account opening balance and minimum balance must be 5000. o for current account opening balance and minimum balance must be 1000. o can not withdraw the amount from the account that makes balance less than the minimum balance.*/

class Records{
	private int acno;
	private String name;
	private double bals = 500;
	private double balc = 1000;
	private String branch;
	
	Records(int acno, String name, String branch)
	{
		this.acno=acno;
		this.name=name;
		//this.bal=bal;
		this.branch=branch;
	}
	void saving(double x)
	{
		if(bals < 500){
		bals += x;
		}
		else {
			System.out.println("Minimum 500 balance are required");
		}
	}
	void savingmin(double x)
	{
		if(bals < 500){
		bals -= x;
		}
		else {
			System.out.println("***** Minimum 500 balance are required ******");
		}
	}
	void current(double y)
	{
		if(balc < 1000){
		balc += y;
		}
		else {
			System.out.println("Minimum 1000 balance are required");
		}
	}
	void currentmin(double y)
	{
		if(balc < 1000){
		balc -= y;
		}
		else {
			System.out.println("**** Minimum 1000 balance are required ****");
		}
	}
	void display(){
		System.out.println("Total money in Saving : "+bals);
		System.out.println("Total money in Current : "+balc);
	}
	
}
class q51{
	public static void main(String []args)
	{
		Records r = new Records(1234,"RAM","pune");
		r.display();
		r.saving(800);
		r.current(800);
		r.savingmin(1200);
		r.currentmin(1200);
		r.display();
		
	}
}