// 採用嵌套調用的方法改寫菜單選擇與處理程序

import java.io.*;

public class p68_01_EmbeddedMethods {
	// 顯示菜單並返回用戶的選擇結果
	public static int selectMenu() {
		System.out.println("1, 蘋果");
		System.out.println("2, 栗子");
		System.out.println("0, 退出");
		System.out.print("請選擇(0~2): ");

		int choice = -1;
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String inputLine = in.readLine();
			choice = Integer.valueOf(inputLine).intValue();
		} catch (Exception exc) {}

		return choice;
	}

	public static void handleApple() {
		System.out.println("你選擇了蘋果");
	}
	public static void handleChestnut() {
		System.out.println("你選擇了栗子");
	}
	public static void handle(int choice) {
		if (choice == 0)
			;
		else if (choice == 1) 
			handleApple();
		else if (choice == 2) 
			handleChestnut();
		else
			System.out.println("你的選擇不正確");
	}

	// main
	public static void main(String[] args) {
		int choice = -1;
		while (choice != 0) {
			choice = selectMenu();
			handle(choice);
		}
	}
}
