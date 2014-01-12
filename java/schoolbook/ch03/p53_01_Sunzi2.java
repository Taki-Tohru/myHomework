// 求解《孫子算經》中的問題，採用continue 語句

public class p53_01_Sunzi2 {
	public static void main(String[] args) {
		int num = 1;
		while (true) {
			if(num % 3 != 2) {
				num = num + 1;
				continue;
			}
			if(num % 5 != 3) {
				num = num + 1;
				continue;
			}
			if(num % 7 != 2) {
				num = num + 1;
				continue;
			}
			System.out.println("滿足條件的最小的自然數是 " + num);
			break; // 這句一定要寫，否則一直執行while循環
		}
	}
}
