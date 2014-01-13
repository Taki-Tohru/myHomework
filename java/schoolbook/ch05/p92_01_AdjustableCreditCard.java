// ͸֧���~�ɸ��ӵ����ÿ��~������

public class p92_01_AdjustableCreditCard {
	private static double maxOverdraft = 1000;
	private double balance = 0;

	// �o�B����
	// ���������ÿ��~����͸֧���~�O�Þ�max
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
			System.out.println("�N�~���㣬ȡ��ʧ����");

		p92_01_AdjustableCreditCard li = new p92_01_AdjustableCreditCard();
		// �����O���������ÿ���͸֧���~��1200
		p92_01_AdjustableCreditCard.adjustOverdraft(1200);

		if (!zhang.withdraw(1500))
			System.out.println("�N�~���㣬ȡ��ʧ����");
		else 
			li.deposit(1500);

		System.out.println("�������ÿ��N�~��" + zhang.getBalance());
		System.out.println("������ÿ��N�~��" + li.getBalance());
	}
}
