

class UniformCreditCard {
	private static double maxOverdraft = 1000; // 透支限額

	private double balance = 0;

	public void deposit(double amount) {
		balance = balance + amount;
	}
	public boolean withdraw(double amount) {
		if (amount <= balance + maxOverdraft) {
			balance = balance - amount;
			return true;
		} else return false;
	}

	public double getBalance() {
		return balance;
	}
}
public class p91_01_UniformCreditCard_Main {
	public static void main(String[] args) {
		UniformCreditCard zhang = new UniformCreditCard();
		zhang.deposit(500);
		if (! zhang.withdraw(100))
			System.out.println("餘額不足，取款失敗！");

		UniformCreditCard li = new UniformCreditCard();
		if (! zhang.withdraw(700))
			System.out.println("餘額不足，取款失敗！");
		else
			li.deposit(700);

		System.out.println("張的信用卡餘額為： " + zhang.getBalance());
		System.out.println("李的信用卡餘額為： " + li.getBalance());
	}
}
