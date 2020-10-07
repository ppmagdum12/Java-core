class Student{
	private int rollno;
	private double percentage;
	
	Student(){
		rollno = -1;
		pecentage = 0;
	}
	Student(int rollno, double percentage)
	{
			this.rollno=rollno;
			this.percentage=percentage;
	}
	void show(){
		System.out.println("Roll no :" + rollno + "Percentage : "+pecentage+" %");
		
	}
	int GetRollNo(){
		return rollno;
	}
	int getpecenatge(){
		return percentage;
	}
	
}

class CollegeStudent extends Student{
	
	private int semester;
	
	CollegeStudent()
	{
		semester=0;
	}
	CollegeStudent( int rollno, double percentage, int semester)
	{
		super(rollno,percentage);
		this.semester=semester;
	}
	void show()
	{
		super.show();
		System.out.println("sem: "+ semester);
	}
}
class SchoolStudent extends Student{
	
	private int classname;
	
	SchoolStudent()
	{
		classname=0;
	}
	SchoolStudent( int rollno, double percentage, int classname)
	{
		super(rollno,percentage);
		this.classsname=classname;
	}
	void show()
	{
		super.show();
		System.out.println("classname: "+ classname);
	}
}

class q45{
	public static void main (String args[])
	{
		Student sarr[]={new CollegeStudent(10,60,1),new CollegeStudent(12,80,2), new SchollStudent(15,95,10),
		new SchoolStudent(18,75,7),new SchoolStudent(8,90,8)
		};
		
		for(Student s : arr){
			s.show();
		}
		int SearchRollNo = 15;
		for(Student s : sarr){
			if(s.GetRollNo() == SearchRollNo){
			if( s instanceof CollegeStudent){
				System.out.println("This is college Student ");
			}
			else if(s instanceof SchoolStudent)
			{
				System.out.println("This is School Student ");
			}
			s.show();
			}
		}
		int count=0;
		for(Student s : sarr){
			if(s.getpecenatge() >= 75)
			{
				count++;
				System.out.println("Count of Student with A Garde: " + count);
			}
		} 
	}
}