class q26{
	public static void main(String args[]){
		int a[] = {1,2,3};
		int b[] = {4,5,6};
		int c[] = {7,8,9};
		int d[] = {10,11,12,13};
		int e[] = {14,15,16,17};
		int arr[][]=new int [5][];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		arr[3]=d;
		arr[4]=e;
		int sum=0;
		for(int ar[] : arr)
		{
			for(int f : ar)
			{
				sum+=f;
			}
		}
		System.out.println("Sum is : "+sum);
	}
}