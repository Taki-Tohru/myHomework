import java.io.*;

public class p34_01_Temperature3 {
	public static void main(String[] args) {
		float fah; // 華氏溫度
		float cel; // 根據fah轉換得到的攝氏溫度

		System.out.println("今天的華氏溫度為： ");
		try {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String inputLine = in.readLine();
		fah = Float.valueOf(inputLine).floatValue();
		} catch (Exception exc) {
		System.out.println("輸入不合法！");
		return;
		}
		// 計算攝氏溫度
		cel = (fah - 32) * 5 / 9;
		System.out.println("溫度為攝氏" + cel + "度。");
	}
}
