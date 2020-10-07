class Student{
	private int rno;
	private String name;
	
	void SetData(int x,String y)
	{
		rno=x;
		name=y;
	}
	void ShowData()
	{
		System.out.println(rno+" "+name);
	}
}
class q31{
	
	public static void main(String args[])
	{
		Student s = new Student();
		s.SetData(14,"Prasad");
		s.ShowData();
	}
}