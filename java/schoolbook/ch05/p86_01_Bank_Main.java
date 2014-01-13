public class p86_01_Bank_Main {
	public static void main(String[] args) {
		p83_01_Account Zhang = new p83_01_Account();
		Zhang.deposit(500);
		if (! Zhang.withdraw(100))
			System.out.println("�N�~���㣬ȡ��ʧ����");

		p83_01_Account Li = new p83_01_Account();
		if (! Zhang.withdraw(150))
			System.out.println("�N�~���㣬�D�~ʧ����");
		else
			Li.deposit(150);

		System.out.println("�����~���N�~�� " + Zhang.getBalance());
		System.out.println("����~���N�~�� " + Li.getBalance());
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
