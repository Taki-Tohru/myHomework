import java.io.*;

// 給定正整數n，求平方不超過n的最大正整數
public class p49_01_squareMax {
	public static void main(String[] args) {
		int n;
		System.out.println("Please input an integer number: ");
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String inputLine = in.readLine();
			n = Integer.valueOf(inputLine).intValue();
		} catch (Exception exc) {
			System.out.println("Invalid input.");
			return;
		}

		if (n <= 0)
			System.out.println("Not a positive number.");
		else {
			// 利用循環求出平方大於n的最小整數max
			int max = 1;
			while (max * max <= n)
				max = max + 1;
			System.out.println("The square not great than " + n + "'s integer number is: " + (max - 1));
		}
	}
}
