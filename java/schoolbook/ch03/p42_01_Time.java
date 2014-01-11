import java.io.*;

public class p42_01_Time {
	public static void main(String[] args) {
		int hour;
		System.out.println("請輸入24小時制時間： ");
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String inputLine = in.readLine();
			hour = Integer.valueOf(inputLine).intValue();
		} catch (Exception exc) {
			System.out.println("輸入的時間不合法！");
			return;
		}
		// 令時間後綴noon為A.M.
		String noon = "A.M.";
		// 時間大於或等於12則進行轉換
		if (hour >= 12) {
			hour = hour - 12;
			noon = "P.M.";
		}
		System.out.println("現在是 " + hour + " " + noon);
	}
}
