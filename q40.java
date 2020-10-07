class Student{
	int rollno;
	int age;
	int score;
	String name;
	Student(){}
	Student(int x,int y, int s,String n)
	{
		rollno=x;
		age=y;
		score=s;
		name=n;
	}
int getscore(){return score;}
	void show(){
		System.out.println(rollno+" "+age+" "+score+" "+name);
	}
}
class q40{
	public static void main(String args[]){
	Student arr[]={new Student(101,25,65,"pr"),new Student(102,26,50,"qw"),
					new Student(103,27,45,"we"),
					new Student(104,28,80,"rt"),new Student(108,23,60,"bb"),
					new Student(105,29,85,"tt"),new Student(109,24,40,"fg"),
					new Student(106,21,90,"yu"),new Student(110,20,70,"pg"),
					new Student(107,22,82,"kl")};
					
		for(Student a : arr)
		{
			a.show();
		}
		Student s = new Student();
		int sc = s.getscore();
		System.out.println("==================================");
		for(Student a : arr)
		{
			if(a.score <= 50){
			//a.show();
			System.out.println("Below 50 :"+ a.score);
			}
			if(a.score > 50 && a.score <=65){
				//a.show();
				System.out.println("Below 65 :"+ a.score);
			}
				
			else if(a.score > 65 && a.score <=80)
			{
					//a.show();
					System.out.println("Below 65 : "+ a.score);
			}
				//a.show();
			else if(a.score > 80 && a.score <=100){
				//a.show();
			System.out.println("Above 80 : "+ a.score);	
			}
				
			else
				System.out.println(" ");
			
		}
	}
}