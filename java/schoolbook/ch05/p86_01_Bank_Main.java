public class p86_01_Bank_Main {
	public static void main(String[] args) {
		p83_01_Account Zhang = new p83_01_Account();
		Zhang.deposit(500);
		if (! Zhang.withdraw(100))
			System.out.println("餘額不足，取款失敗！");

		p83_01_Account Li = new p83_01_Account();
		if (! Zhang.withdraw(150))
			System.out.println("餘額不足，轉賬失敗！");
		else
			Li.deposit(150);

		System.out.println("張的賬戶餘額為 " + Zhang.getBalance());
		System.out.println("李的賬戶餘額為 " + Li.getBalance());
	}
}
class p83_01_Account {
	private double balance = 0;

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public boolean withdraw(double amount) {
		if (amount < balance) {
			balance = balance - amount;
			return true;
		} else return false;
	}
	public double getBalance() {
		return balance;
	}
}
