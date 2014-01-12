// 打印攝氏溫度與華氏溫度對照表
// 攝氏溫度轉為華氏溫度的公式
// F = C * 9 / 5 + 32;

public class p57_02_TemperatureTable {
	public static void main(String[] args) {
		final int max = 10;  // 最高攝氏溫度
		final int min = -10; // 最低攝氏溫度

		for (int cel = max; cel >= min; cel = cel - 1) {
			double fah = cel * ((double)9) / ((double)5) + 32;
			System.out.println("攝氏" + cel + "度相當於華氏" + fah + "度");
		}
	}
}
