// ����Ƕ���{�õķ����Č��ˆ��x���c̎�����

import java.io.*;

public class p68_01_EmbeddedMethods {
	// �@ʾ�ˆ΁K�����Ñ����x��Y��
	public static int selectMenu() {
		System.out.println("1, �O��");
		System.out.println("2, ����");
		System.out.println("0, �˳�");
		System.out.print("Ո�x��(0~2): ");

		int choice = -1;
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String inputLine = in.readLine();
			choice = Integer.valueOf(inputLine).intValue();
		} catch (Exception exc) {}

		return choice;
	}

	public static void handleApple() {
		System.out.println("���x�����O��");
	}
	public static void handleChestnut() {
		System.out.println("���x��������");
	}
	public static void handle(int choice) {
		if (choice == 0)
			;
		else if (choice == 1) 
			handleApple();
		else if (choice == 2) 
			handleChestnut();
		else
			System.out.println("����x�����_");
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
