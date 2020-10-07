class Tile{
	private int length;
	private int area;
	Tile(){}
	Tile(int x)
	{
		length=x;
	}
	
	void Area()
	{
			
		area = length*length;
		//System.out.println("AREA******"+area);
	}
	
	int getarea()
	{
		return area;
	}
	void show(){
		System.out.println("Area of Tile: " + area);
		//System.out.println(length);
	}
}
class Floor extends Tile{
	private int lengthf;
	private int width;
	private int TotalTil;
	
	Floor(int x,int y)
	{
		lengthf = x;
		width = y;
		
	}
	void Totaltile(int a){
		int Tarea;
		Tarea = lengthf * width;
		TotalTil = Tarea/a;
		
	}
	void show(){
		System.out.println("Total Area:" + (lengthf*width));
		System.out.println("No of Tiles are: "+TotalTil);
	}
}
class q42{
	public static void main(String args[])
	{
		Tile t  = new Tile(10);
		Floor f = new Floor(50,50);
		t.Area();
		int x = t.getarea();
		f.Totaltile(x);
		t.show();
		f.show();
	}
}