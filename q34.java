class Circle{
	private double radius;
	private double area;
	
	void setinit(double radius)
	{
		this.radius=radius;
	}
	void calarea()
	{
		 area= (3.14*radius*radius);
		
	}
	void showdata()
	{
		System.out.println(area);
		System.out.println(radius);
	}
}
class q34{
	public static void main(String args[])
	{
	Circle c = new Circle();
	c.setinit(32.50);
	c.calarea();
	c.showdata();
	}
}