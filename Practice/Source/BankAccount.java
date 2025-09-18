public class BankAccount{

	private String accountNumber;
	private String accountHolder;
	private double balance;

		public BankAccount(){

			this("000", null, 0.0 );


}

		public BankAccount(String accountNumber, String accountHolder, double balance){

			this.accountNumber = accountNumber;
			this.accountHolder = accountHolder;
			this.balance = balance;
}
		public boolean deposit(double amount){

			if (amount > 0){
				balance += amount;
				return true;
}
			else{
				return false;
			}
}

		public boolean withdraw(double amount){

			if(amount > 0 && amount <= balance){
				balance -= amount;
				return true;
}
			else{
				return false;


}
		

}

		public double getBalance(){

			return balance;

}

		public String getAccountHolder(){

			return accountHolder;


}

		public void setAccountHolder(String accountHolder){
			
			if(accountHolder != null && accountHolder.length() <= 3){
			
				this.accountHolder = accountHolder;
}

}
	
		

}
		