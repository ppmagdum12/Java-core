class pen{
	private int qty;
	private String pname;
	public pen(int qty, String pname) {
		//super();
		this.qty = qty;
		this.pname = pname;
	}
	public int getQty() {
		return qty;
	}
	
	public String getPname() {
		return pname;
	}
	@Override
	public String toString() {
		return " qty are = " + qty + " & pname is = " + pname ;
	} 
	
	
	
	
}

public class stringtostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pen p = new pen(10,"Reynolds");
		System.out.println(p);
		
	}

}