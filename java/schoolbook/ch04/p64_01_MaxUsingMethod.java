// 利用方法求三個數的最大值

import java.io.*;

public class p64_01_MaxUsingMethod {
	// 返回x和y的中的最大值
	
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
		System.out.println("請輸入3個浮點數(請以回車鍵結束一個數的輸入)： ");
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String inputLine = in.readLine();
			value = Double.valueOf(inputLine).doubleValue();

			String inputLine2 = in.readLine();
			value2 = Double.valueOf(inputLine2).doubleValue();

			String inputLine3 = in.readLine();
			value3 = Double.valueOf(inputLine3).doubleValue();
		} catch (Exception exc) {
			System.out.println("輸入的不是合法的浮點數");
			return;
		}
		// call max() method
		double maxNum;
		maxNum = max(value, value2);
		maxNum = max(maxNum, value3);
		System.out.println("最大值為" + maxNum );
	}
}
