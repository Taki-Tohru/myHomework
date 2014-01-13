// 透支限額可浮動的信用卡賬戶管理

public class p92_01_AdjustableCreditCard {
	private static double maxOverdraft = 1000;
	private double balance = 0;

	// 靜態方法
	// 將所有信用卡賬戶的透支限額設置為max
	public static void adjustOverdraft(double max) {
		maxOverdraft = max;
	}

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

	public static void main(String[] args) {
		p92_01_AdjustableCreditCard zhang = new p92_01_AdjustableCreditCard();
		zhang.deposit(500);

		if(!zhang.withdraw(100))
			System.out.println("餘額不足，取款失敗！");

		p92_01_AdjustableCreditCard li = new p92_01_AdjustableCreditCard();
		// 重新設置所有信用卡的透支限額為1200
		p92_01_AdjustableCreditCard.adjustOverdraft(1200);

		if (!zhang.withdraw(1500))
			System.out.println("餘額不足，取款失敗！");
		else 
			li.deposit(1500);

		System.out.println("張的信用卡餘額為" + zhang.getBalance());
		System.out.println("李的信用卡餘額為" + li.getBalance());
	}
}
