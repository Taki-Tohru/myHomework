import java.io.*;
import java.lang.reflect.*;

class p106_01_ClassDemo {
	public double value = 3.14;

	public static void main(String[] args) {
		try {
			// 通過名字得到保存該類信息的一個實例對象
			Class classObj = Class.forName("p106_01_ClassDemo");
			// 獲取該類在本程序中的可以訪問的域（通常是公有的成員數據）
			Field[] fields = classObj.getFields();

			// 獲取該類在本程序中的可以訪問的方法（通常是公有的成員方法）
			Method[] methods = classObj.getMethods();

			for (int i = 0; i < fields.length; i++) {
				System.out.println("類" + classObj.getName() + "的第" + i + "個域的名字是" + fields[i].getName());
			}
			for (int i = 0; i < methods.length; i++) {
				System.out.println("類" + classObj.getName() + "的第" + i + "個方法的名字是" + methods[i].getName());
			}
		} catch (Exception exc) {
			System.out.println("Can not get the information of the class!");
		}
	}

	public static double test(double x) {
		return x * x;
	}
}
