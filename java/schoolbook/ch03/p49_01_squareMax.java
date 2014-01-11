import java.io.*;

// �o��������n����ƽ�������^n�����������
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
			// ����ѭ�h���ƽ�����n����С����max
			int max = 1;
			while (max * max <= n)
				max = max + 1;
			System.out.println("The square not great than " + n + "'s integer number is: " + (max - 1));
		}
	}
}
