// ��⡶�O���㽛���еĆ��}������continue �Z��

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
			System.out.println("�M��l������С����Ȼ���� " + num);
			break; // �@��һ��Ҫ������tһֱ����whileѭ�h
		}
	}
}
