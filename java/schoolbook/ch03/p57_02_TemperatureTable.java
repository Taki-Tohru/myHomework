// ��ӡ�z�Ϝض��c�A�ϜضȌ��ձ�
// �z�Ϝض��D���A�ϜضȵĹ�ʽ
// F = C * 9 / 5 + 32;

public class p57_02_TemperatureTable {
	public static void main(String[] args) {
		final int max = 10;  // ��ߔz�Ϝض�
		final int min = -10; // ��͔z�Ϝض�

		for (int cel = max; cel >= min; cel = cel - 1) {
			double fah = cel * ((double)9) / ((double)5) + 32;
			System.out.println("�z��" + cel + "���ஔ��A��" + fah + "��");
		}
	}
}
