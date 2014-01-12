// 求解河內塔遊戲

public class p79_01_HanoiTower {
	// 將n個盤子從from柱子移到to柱子，以aux柱子為輔助柱子
	
	public static void move(int n, char from, char to, char aux) {
		if (n == 1) {
			// 僅有一個盤時，直接從from柱移到to柱
			System.out.println("將#1盤從" + from + "移到" + to);
		} else {
			// 將n-1個盤從from柱移到aux柱，以to柱為輔助柱
			move(n - 1, from, aux, to);

			// 將最下面的盤從from移到to
			System.out.println("將#" + n + "盤從" + from + "移到" + to);

			// 將n-1個盤從aux移到to， 以from為輔助柱子
			move(n - 1, aux, to, from);
		}
	}

	public static void main(String[] args) {
		// 將4個盤從A柱子移到C柱子，移動時利用B柱子為輔助柱子

		move(4, 'A', 'C', 'B');
	}
}
