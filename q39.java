class Product{
	private int pid;
	private int price;
	private int quantity;
	
	Product(){}
	Product(int pid , int price){
		this.pid=pid;
		this.price=price;
	}
	/*static int Totalamt()
	{
		int total=0;
		total+=price;
	}*/	
	int getprice(){
		//System.out.println("Price is: "+ price);
		//return price;
		return price;
		}
	int getpid(){
		//System.out.println("Product ID is: "+ pid);
		// pid;
		return pid;
		}
}
class q39{
	public static void main(String []args)
	{
		Product arr[]={new Product(12,2500),new Product(13,2000),
		new Product(14,1500),new Product(15,500),new Product(16,2700)
		};
		
		for(Product a : arr)
		{
			System.out.println("Product ID is: "+a.getpid()+"  "+" Price is: "+ a.getprice());
		}
		int hi=0;
		int pi=0;
		System.out.println("****************************");
		for(int j =0;j<arr.length;j++){
		for(int i=0;i<arr.length-1;i++)
		{
		if(arr[j].getprice() > arr[i+1].getprice())
		{
				 hi = arr[i].getprice();
				 pi = arr[i].getpid();
				// System.out.println("PID IS : "+ arr[0].getpid());
		}
		else
		{
				hi = arr[i+1].getprice();
				pi = arr[i+1].getpid();
				//System.out.println("PID IS : "+ arr[1].getpid());
		}
		
		}
		}
		 System.out.println("Highest Pice IS : "+hi);
		 System.out.println("Pid IS : "+pi);
		
		
	}
	
}