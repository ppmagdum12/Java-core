class person{
	private int age;
	private String name;
	
	person()
	{
		name="Prasad";
		age=18;
	}
	void show()
	{
		System.out.println(name+" "+18);
	}
}
class q37{
	public static void main(String args[])
	{
		person p = new person();
		p.show();
	}
}