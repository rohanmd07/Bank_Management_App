
public class Account {
	
	protected String ownerName;
	protected String address;
	protected double balanceAmount;
	protected String date;
	protected String status;
	
	public Account(String ownerName,String address,double balanceAmount,String date,String status) {
		this.ownerName = ownerName;
		this.address = address;
		this.balanceAmount = balanceAmount;
		this.date = date;
		this.status = status;
	}
}
