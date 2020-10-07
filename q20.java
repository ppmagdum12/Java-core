class q20{
	public static void main(String args[])
	{
		int num1=3;
		int num2=100;
		int flag,j;
		for(int i=num1;i<num2;i++)
		{
			 if (i == 1 || i == 0) 
                continue; 
  
            // flag variable to tell 
            // if i is prime or not 
            flag = 1; 
  
            for (j = 2; j <= i / 2; ++j) { 
                if (i % j == 0) { 
                    flag = 0; 
                    break; 
                } 
            } 
  
            // flag = 1 means i is prime 
            // and flag = 0 means i is not prime 
            if (flag == 1) 
                System.out.println(i); 
		}
		
	}
}