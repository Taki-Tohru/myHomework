import java.io.*;

public class p34_01_Temperature3 {
	public static void main(String[] args) {
		float fah; // �A�Ϝض�
		float cel; // ����fah�D�Q�õ��Ĕz�Ϝض�

		System.out.println("������A�ϜضȞ飺 ");
		try {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String inputLine = in.readLine();
		fah = Float.valueOf(inputLine).floatValue();
		} catch (Exception exc) {
		System.out.println("ݔ�벻�Ϸ���");
		return;
		}
		// Ӌ��z�Ϝض�
		cel = (fah - 32) * 5 / 9;
		System.out.println("�ضȞ�z��" + cel + "�ȡ�");
	}
}
