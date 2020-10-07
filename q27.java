class q27{
	public static void main(String args[]){
		int a[] = new int[]{1,2,3,4,5,6};
		int temp=a[0];
		int temp1=a[0];
		for(int i=0;i<6;i++)
		{
			
			if(temp>a[i])
			temp=a[i];
		
		if(temp1<a[i])
			temp1=a[i];
			
		}
		System.out.println("Highest Element in Arrar :"+temp1);
		System.out.println("Lowest Element in Arrar :"+temp);
	}
}