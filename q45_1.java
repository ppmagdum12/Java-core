import java.util.*;
class Student{
	private int rollno;
	private int percentage;
	
	Student(int rollno,int percentage)
	{
		this.rollno=rollno;
		this.percentage=percentage;
	}
	int getrollno()
	{
		return rollno;
	}
	int getpercentage()
	{
		return percentage;
	}
	
	void show()
	{
		System.out.println("The Roll No is: "+rollno+" Percentage is: "+percentage);
	}
}
class CollegeStudent extends Student{
	private int semester;
	CollegeStudent(int rollno,int percentage,int semester)
	{
		super(rollno,percentage);
		this.semester=semester;
	}
	
	void show()
	{
		super.show();
		System.out.println("Semester is: "+semester);
	}
}
class SchoolStudent extends Student{
	private int classname;
	SchoolStudent(int rollno,int percentage,int classname){
		super(rollno,percentage);
		this.classname=classname;
	}
	
	
	void show()
	{
		super.show();
		System.out.println("ClassName is: "+classname);
	}
}
class q45_1{
	public static void main(String args[])
	{
	Student arr[]={new CollegeStudent(12,75,1),new CollegeStudent(13,69,2),
					new SchoolStudent(14,78,10),new SchoolStudent(15,80,12),new SchoolStudent(16,19,12) };
			for( Student a : arr)
			{
				a.show();
			}
			int searchrollno = 13;
			for(Student a: arr)
			{
				if(a.getrollno()== searchrollno)
				{
					if(a instanceof SchoolStudent)
					{
					System.out.println("School student");
					}
					else{
						System.out.println("College student ***");	
					}
				}
			}
			int count=0;
			for(Student a : arr)
			{
				if(a.getpercentage()<= 75)
				{
					count++;
					
				}
				
			}
			System.out.println("Count of Student with A Garde: " + count);
					
	}
}