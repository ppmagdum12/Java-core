class q57{
public static void main(String []args)
{
	String  s = new String("ELEPHANT");
	//System.out.println(s);
	//for(int i < s.length() ; i >= 0; i--)
		String ar[] = s.split("");
	
	System.out.println(" ");
	for(int i=0; i<s.length();i++)
	{
		System.out.print(s.charAt(i));
	}
	System.out.println(" ");
	for(int i=s.length()-1;i>=0;i--){
		System.out.print(s.charAt(i));
	}
}
}