class Mathope{
	
	static int add(int i,int j)
	{
		return i+j;
	}
	static int sub(int i,int j)
	{
		return i-j;
	}
	static int multi(int i,int j)
	{
		return i*j;
	}
	static int power(int i)
	{
		return i*i;
	}
	static void show(int res)
	{
		System.out.println(res);
	}
	
}
class q35{
	public static void main(String args[])
	{
		int s = Mathope.add(12,12);
		int x = Mathope.sub(12,12);
		int y = Mathope.multi(12,12);
		int z = Mathope.power(12);
		Mathope.show(s);
		Mathope.show(x);
		Mathope.show(y);
		Mathope.show(z);
	}
}