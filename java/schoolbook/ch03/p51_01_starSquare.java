// 利用雙重循環語句用星號畫一個矩形區域
public class p51_01_starSquare {
	public static void main(String[] args) {
		int row = 1;
		while (row <= 12) {
			int column = 1;
			while (column <= 40) {
				System.out.print("*");
				column = column + 1;
			}
			System.out.println();
			row = row + 1;
		}
	}
}
