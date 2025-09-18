public class BankMain{

	public static void main(String[] args){

		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount("5467", "Tajammul", 10_000.0);

		System.out.println(" Account Holder: "+ acc1.getAccountHolder());
		System.out.println(" Initial Balance: "+ acc1.getBalance());

		System.out.println(" Account Holder: "+ acc2.getAccountHolder());
		System.out.println(" Initial Balance: "+ acc2.getBalance());

		System.out.println("===========================");
		
		acc1.setAccountHolder("Ali");
		acc1.deposit(0);

		System.out.println(" Account Holder: "+ acc1.getAccountHolder());
		System.out.println(" Initial Balance: "+ acc1.getBalance());

		acc2.withdraw(500.0);
		System.out.println(" Remaining balance: " + acc2.getBalance());

		acc1.deposit(5_000.0);
		System.out.println(" New balance: " + acc1.getBalance());
		

			

		






}





}