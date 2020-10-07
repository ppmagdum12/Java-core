class Student{
	private int rno;
	private String name;
	
	void SetData(int rno,String name)
	{
		this.rno=rno;
		this.name=name;
	}
	void ShowData()
	{
		System.out.println(rno+" "+name);
	}
}
class q33{
	
	public static void main(String args[])
	{
		Student s = new Student();
		s.SetData(14,"Prasad");
		s.ShowData();
	}
}