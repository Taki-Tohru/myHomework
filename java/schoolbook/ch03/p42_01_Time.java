import java.io.*;

public class p42_01_Time {
	public static void main(String[] args) {
		int hour;
		System.out.println("Ոݔ��24С�r�ƕr�g�� ");
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String inputLine = in.readLine();
			hour = Integer.valueOf(inputLine).intValue();
		} catch (Exception exc) {
			System.out.println("ݔ��ĕr�g���Ϸ���");
			return;
		}
		// ��r�g��Ynoon��A.M.
		String noon = "A.M.";
		// �r�g��춻���12�t�M���D�Q
		if (hour >= 12) {
			hour = hour - 12;
			noon = "P.M.";
		}
		System.out.println("�F���� " + hour + " " + noon);
	}
}
