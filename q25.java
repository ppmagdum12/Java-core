class q25{
	public static void main(String args[]){
		int ar[] = new  int[]{1,2,3,4,5,6,7,8,9};
		int sume=0;
		int sumo=0;
		
		for(int i=0; i<9; i++)
		{
			System.out.print(ar[i]+",");
			if(ar[i]%2==0)
			{
				sume+=ar[i];
			}
			else{
				sumo+=ar[i];
			}
		}
		System.out.println("");
		System.out.println("Sum of Even is "+sume+" & Sum of Odd "+sumo);
		
	}
}