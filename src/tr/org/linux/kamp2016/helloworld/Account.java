package tr.org.linux.kamp2016.helloworld;

public class Account {
	
	private String name;
	
	/*public:Her yerden erişilebilir.
	 * protect:Aynı paket içinden erişilebilir.
	 * private:Sınıf içinden 
	 * default:Aynı sınıf/hiyerarşi
	 */
	private double balance;
	
	public Account(String name, double balance){
		
		this.name = name;
		
		if(balance > 0.0)
			this.balance = balance;
	}
	
	public void deposit(double depositAmount){
		
		if(depositAmount > 0.0)
			balance = balance + depositAmount;
		
	}
	
	public double getBalance(){
		return balance;
	}
	public void setName(String name){
		this.name = name;
		
	}
	
	public String getName(){
		
		return name;
	}
	
	
	
	
	

}
