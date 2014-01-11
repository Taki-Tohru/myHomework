import java.io.*;

public class Ex0208 {
	public static void main(String[] args) {
		int num;
		boolean isEven = false; // 是不是偶數，初始為假

		System.out.print("Please input a number, integer type: ");
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String inputLine = in.readLine();
			num = Integer.valueOf(inputLine).intValue();
		} catch (Exception exc) {
			System.out.println("Invalid input.");
			return;
		}
		if (num  % 2 == 0)
			System.out.println("num is an even number.");
		else
			System.out.println("num is an odd number.");
	}
}
