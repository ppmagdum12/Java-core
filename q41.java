class a{
	a()
	{
		System.out.println("Hello I am A with no-arg");
		
	}
	a(int i)
	{
		System.out.println("Hello I am A with arg");
	}
}
class b extends a{
	
	b()
	{
		
		System.out.println("Hello I am B without no-arg");
	}
	b(int i)
	{
		this();
		System.out.println("Hello I am B with Arg");
	}
}

class q41{
	public static void main(String args[])
	{
		a c = new a();
		a c1 = new a(10);
		b d = new b();
		b d1 = new b(20);
	}
}