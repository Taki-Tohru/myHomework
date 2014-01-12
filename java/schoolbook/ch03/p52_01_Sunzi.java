// 求解《孫子算經》中的問題，找出其最小解。
// 問：今有物不知其數，三三數之剩二，五五數之剩三，七七數之剩二，問物幾何？
// “三三數之剩二”意味著所求數n對3求模結果為2，即n%3==2
public class p52_01_Sunzi {
	public static void main(String[] args) {
		int num = 1;
		while (true) {
			if ((num % 3 == 2) && (num % 5 == 3) && (num % 7 == 2)) break;
			num = num + 1;
		}
		System.out.println("滿足條件的最小的自然數是" + num );
	}
}
