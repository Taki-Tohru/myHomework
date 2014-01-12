// 用牛頓法求平方根

import java.io.*;

public class p55_01_SquareRoot {
	public static void main(String[] args) {
		final double EPSILON = 0.00001; // 精度要求

		System.out.print("請輸入一個正數： ");
		double num;
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String inputLine = in.readLine();
			num = Double.valueOf(inputLine).doubleValue();
		} catch (Exception exc) {
			System.out.println("輸入的不是合法的浮點數。");
			return;
		}

		if(num < 0) System.out.println("負數無法求平方根！");
		else {
			// 用牛頓法求平方根

			double root = 1;
			double pre;
			do {
				pre = root;
				root = (num / root + root) / 2;
			} while ((pre - root > EPSILON) || (root - pre > EPSILON));
			System.out.println("求得" + num + "的平方根是" + root);
		}
	}
}
