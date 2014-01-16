import java.io.*;
import java.lang.reflect.*;

class p106_01_ClassDemo {
	public double value = 3.14;

	public static void main(String[] args) {
		try {
			// ͨ�^���ֵõ�����ԓ���Ϣ��һ����������
			Class classObj = Class.forName("p106_01_ClassDemo");
			// �@ȡԓ��ڱ������еĿ����L������ͨ���ǹ��еĳɆT������
			Field[] fields = classObj.getFields();

			// �@ȡԓ��ڱ������еĿ����L���ķ�����ͨ���ǹ��еĳɆT������
			Method[] methods = classObj.getMethods();

			for (int i = 0; i < fields.length; i++) {
				System.out.println("�" + classObj.getName() + "�ĵ�" + i + "�����������" + fields[i].getName());
			}
			for (int i = 0; i < methods.length; i++) {
				System.out.println("�" + classObj.getName() + "�ĵ�" + i + "��������������" + methods[i].getName());
			}
		} catch (Exception exc) {
			System.out.println("Can not get the information of the class!");
		}
	}

	public static double test(double x) {
		return x * x;
	}
}
