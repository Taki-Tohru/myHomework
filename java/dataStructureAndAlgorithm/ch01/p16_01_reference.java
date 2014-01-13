// page 16
////////////////////////////////////////////////////////////
class p16_01_BankAccount
{
	private double balance;

	public p16_01_BankAccount(double openingBalance) // constuctor
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
class p16_01_BankAppRef_Main
{
	public static void main(String[] args)
	{
		p16_01_BankAccount bc1 = new p16_01_BankAccount(100.00);
		p16_01_BankAccount bc2 = bc1;

		System.out.println("bc1: Before transactions, ");
		bc1.display();
		System.out.println("bc2: Before transactions, ");
		bc2.display();
		System.out.println("----------");

		bc1.deposit(74.35);
		System.out.println("After bc1 deposit, ");
		System.out.print("bc1, ");
		bc1.display();
		System.out.print("bc2, ");
		bc2.display();
		System.out.println("----------");

		bc2.withdraw(20.00);
		System.out.println("After bc2 withdraw, ");
		System.out.print("bc1, ");
		bc1.display();
		System.out.print("bc2, ");
		bc2.display();
	}
}
