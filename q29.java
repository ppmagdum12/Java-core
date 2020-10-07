class q29{
	public static void main(String args[]){
		int a[] = {1,2,3};
		int b[] = {4,5,6};
		int c[] = {7,8,9};
		int ar[][]=new int [3][];
		ar[0]=a;
		ar[1]=b;
		ar[2]=c;
		int counter1=0;
		int counter2=0;
		int counter3=0;
		for(int i=0;i<ar.length; i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i]==1)
				{
					counter1++;
				}
				else if(a[i]==2)
				{
					counter2++;
				}
				else if(a[i]==3)
				{
					counter3++;
				}
			}
			System.out.println("======"+ar.length);
		}
		System.out.println("The element in array a :"+counter1);
		System.out.println("The element in array b :"+counter2);
		System.out.println("The element in array c :"+counter3);
	}
}