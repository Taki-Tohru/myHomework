// ��ţ�D����ƽ����

import java.io.*;

public class p55_01_SquareRoot {
	public static void main(String[] args) {
		final double EPSILON = 0.00001; // ����Ҫ��

		System.out.print("Ոݔ��һ�������� ");
		double num;
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String inputLine = in.readLine();
			num = Double.valueOf(inputLine).doubleValue();
		} catch (Exception exc) {
			System.out.println("ݔ��Ĳ��ǺϷ��ĸ��c����");
			return;
		}

		if(num < 0) System.out.println("ؓ���o����ƽ������");
		else {
			// ��ţ�D����ƽ����

			double root = 1;
			double pre;
			do {
				pre = root;
				root = (num / root + root) / 2;
			} while ((pre - root > EPSILON) || (root - pre > EPSILON));
			System.out.println("���" + num + "��ƽ������" + root);
		}
	}
}
