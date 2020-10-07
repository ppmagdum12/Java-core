class mathope{
	
	static void Multiply(int x,int y)
	{
		int k = x*y;
		System.out.println(k);
	}
	static void Multiply(float x,float y)
	{
		float k = x*y;
		System.out.println(k);	
	}
	static void Multiply(int x,double y)
	{
		double k = x*y;
			System.out.println(k);
	}
	
}
class q36{
	
	public static void main(String args[])
	{
		mathope.Multiply(12,12);
		mathope.Multiply(12.3f,10.0f);
		mathope.Multiply(12,12.50);
	}
}