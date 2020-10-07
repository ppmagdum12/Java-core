class q23{
	public static void main(String args[]){
		int ar[] = new  int[]{1,3,2,4,6,8,7,6,9};
		Array.sort(ar);
		for(int i=9; i>0; i--)
		{
			System.out.print(ar[i]);
		}