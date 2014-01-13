// page 13
////////////////////////////////////////////////////////////
class p13_01_BankAccount
{
	private double balance;

	public p13_01_BankAccount(double openingBalance) // constuctor
	{
		balance = openingBalance;
	}

	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	public void withdraw(double amount)
	{
		balance = balance - amount;
	}

	public void display()
	{
		System.out.println("balance = " + balance);
	}
}
////////////////////////////////////////////////////////////
class p13_01_BankApp_Main
{
	public static void main(String[] args)
	{
		p13_01_BankAccount ba1 = new p13_01_BankAccount(100.00);

		System.out.println("Before transactions, ");
		ba1.display();

		ba1.deposit(74.35);
		ba1.withdraw(20.00);
		System.out.println("After transactions, ");
		ba1.display();
	}
}
