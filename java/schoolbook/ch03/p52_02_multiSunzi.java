// ��⡶�O���㽛���еĆ��}���ҳ�����С��5���⡣
// ��Ҋp52_01_Sunzi.java

public class p52_02_multiSunzi {
	public static void main(String[] args) {
		int num = 1;
		int counter = 1;

		while (counter <= 5) {
			while (true) {
				if ((num % 3 == 2) && (num % 5 == 3) && (num % 7 == 2)) break;
				num = num + 1;
			}
			System.out.println("�ҵ���" + counter + "���M��l������Ȼ����" + num );
			num = num + 1;
			counter = counter + 1;
		}
	}
}
