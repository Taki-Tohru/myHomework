// ���÷����������������ֵ

import java.io.*;

public class p64_01_MaxUsingMethod {
	// ����x��y���е����ֵ
	
	public static double max(double x, double y) {
		double temp;
		if (x >= y) 
			temp = x;
		else 
			temp = y;
		return temp;
	}

	// main
	
	public static void main(String[] args) {
		// input three double numbers
		double value, value2, value3;
		System.out.println("Ոݔ��3�����c��(Ո�Ի�܇�I�Y��һ������ݔ��)�� ");
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String inputLine = in.readLine();
			value = Double.valueOf(inputLine).doubleValue();

			String inputLine2 = in.readLine();
			value2 = Double.valueOf(inputLine2).doubleValue();

			String inputLine3 = in.readLine();
			value3 = Double.valueOf(inputLine3).doubleValue();
		} catch (Exception exc) {
			System.out.println("ݔ��Ĳ��ǺϷ��ĸ��c��");
			return;
		}
		// call max() method
		double maxNum;
		maxNum = max(value, value2);
		maxNum = max(maxNum, value3);
		System.out.println("���ֵ��" + maxNum );
	}
}
