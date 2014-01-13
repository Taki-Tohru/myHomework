public class p93_01_Transfer_Main {
	public static boolean transfer(p93_01_Account source, p93_01_Account target, double amount) {
		if (! source.withdraw(amount))
			return false;
		else {
			target.deposit(amount);
			return true;
		}
	}

	public static void main(String[] args) {
		p93_01_Account Zhang = new p93_01_Account();
		Zhang.deposit(500);
		if (! Zhang.withdraw(100))
			System.out.println("餘額不足，取款失敗！");

		p93_01_Account Li = new p93_01_Account();
		if (! transfer(Zhang, Li, 150))
			System.out.println("餘額不足，轉賬失敗！");

		System.out.println("張的賬戶餘額為 " + Zhang.getBalance());
		System.out.println("李的賬戶餘額為 " + Li.getBalance());
	}
}
class p93_01_Account {
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
