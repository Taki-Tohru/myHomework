// page 61
// ��ˮ�ɻ���
// ˮ�ɻ���ָһ��n(n >= 3)λ���������ÿ�����ֵ�n�΃�ĺ͡����磬153��ˮ�ɻ��������Ĕ���3λ����1^3 + 5^3 + 3^3 = 153.
// ��3λ����ˮ�ɻ�����


public class ex0302 {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; ++i)
		{
			int single_digit = i % 10;
			int ten_digit = (i % 100) / 10;
			int hundred_digit = i / 100;
			if (hundred_digit * hundred_digit * hundred_digit + ten_digit * ten_digit * ten_digit + single_digit * single_digit * single_digit == i) {
				System.out.println(i + "��ˮ�ɻ�����");
			}
		}

	}
}
