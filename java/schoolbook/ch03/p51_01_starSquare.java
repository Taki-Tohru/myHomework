// �����p��ѭ�h�Z������̖��һ�����΅^��
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
