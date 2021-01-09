

public   class  Account {


	public  String ID;

	final static int limitOnAccount = -1000;

	private double balance;



	public Account(String id, double initial) {

		this.ID=id;
		this.balance=initial;
	}



	public double getBalance() {

		return this.balance;
	}



	public void display() {
		System.out.println("Account: "+ID+ " Balance ="+balance);
		System.out.println("LIMIT ="+ limitOnAccount);
		System.out.println("CURRENCY ="+currencyExchange);
	}



	public void deposit(double amount) {

		balance+=amount;

	}

	public boolean withdraw(double amount) {

		if (isSufficient(amount) ) {
			balance-=amount;
			return true;
		}
		return false;
	}



	public boolean isSufficient(double amount) {
		
		return balance>=amount +limitOnAccount;
	}
		

	//add currency feature
	int currencyExchange;

	 
	 public int getCurrency() {
		 
		 return currencyExchange;
	 }


}
