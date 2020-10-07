class Shape{
	int length;
	int height;
void show(){
	System.out.println("Length :" + length+ "Height"+ height);
}
Shape(int length,int height){
this.length=length;
this.height=height;	
}
void Area(){
	
}
}
class Rectangle extends Shape{
	
	void Area(){
		super.show();
		System.out.println("Area: "+ (length * height));
	}
	void diagonal(){
		System.out.println("Diagonal is =" + (Math.sqrt((length^2) + (height^2))));
	}
	Rectangle(int length,int height)
	{
		super.show();
	}
}
Class Triangle extends Shape{
	
	void Area(){
		super.show();
		System.out.println("Area: "+ (0.5 * length * height));
	}

}
class q46{
	public static void main(String args[]){
		
		Shape sarr[]={new Rectangle(30,40),new Rectangle(10,20)};
		sarr[0].Area();
		
		sarr[1].Area();
		Rectangle r =(Ractangle) sarr[0];
		r.diagonal();
		
	}
}