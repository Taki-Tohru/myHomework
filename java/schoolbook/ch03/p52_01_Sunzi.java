// ��⡶�O���㽛���еĆ��}���ҳ�����С�⡣
// ���������ﲻ֪�䔵��������֮ʣ�������唵֮ʣ�������ߔ�֮ʣ��������׺Σ�
// ��������֮ʣ������ζ������n��3��ģ�Y����2����n%3==2
public class p52_01_Sunzi {
	public static void main(String[] args) {
		int num = 1;
		while (true) {
			if ((num % 3 == 2) && (num % 5 == 3) && (num % 7 == 2)) break;
			num = num + 1;
		}
		System.out.println("�M��l������С����Ȼ����" + num );
	}
}
