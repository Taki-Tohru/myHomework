// 求解《孫子算經》中的問題，找出其最小的5個解。
// 參見p52_01_Sunzi.java

public class p52_02_multiSunzi {
	public static void main(String[] args) {
		int num = 1;
		int counter = 1;

		while (counter <= 5) {
			while (true) {
				if ((num % 3 == 2) && (num % 5 == 3) && (num % 7 == 2)) break;
				num = num + 1;
			}
			System.out.println("找到第" + counter + "個滿足條件的自然數是" + num );
			num = num + 1;
			counter = counter + 1;
		}
	}
}
