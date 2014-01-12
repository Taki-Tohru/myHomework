// 正向和反向打印字母表

public class p57_01_Alphabet {
	public static void main(String[] args) {
		char ch;

		for (ch = 'A'; ch <= 'Z'; ch = (char)(ch + 1))
			System.out.print(ch + " ");
		System.out.println();
		for (ch = 'Z'; ch >= 'A'; ch = (char)(ch - 1))
			System.out.print(ch + " ");
		System.out.println();
	}
}
