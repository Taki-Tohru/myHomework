// ���Ӄ����[��

public class p79_01_HanoiTower {
	// ��n���P�ӏ�from�����Ƶ�to���ӣ���aux���Ӟ��o������
	
	public static void move(int n, char from, char to, char aux) {
		if (n == 1) {
			// �H��һ���P�r��ֱ�ӏ�from���Ƶ�to��
			System.out.println("��#1�P��" + from + "�Ƶ�" + to);
		} else {
			// ��n-1���P��from���Ƶ�aux������to�����o����
			move(n - 1, from, aux, to);

			// ��������ıP��from�Ƶ�to
			System.out.println("��#" + n + "�P��" + from + "�Ƶ�" + to);

			// ��n-1���P��aux�Ƶ�to�� ��from���o������
			move(n - 1, aux, to, from);
		}
	}

	public static void main(String[] args) {
		// ��4���P��A�����Ƶ�C���ӣ��Ƅӕr����B���Ӟ��o������

		move(4, 'A', 'C', 'B');
	}
}
