// page 21

import java.io.*;
// import java.lang.*;

public class testDouble {
	public static String getString() throws IOException 
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

	// ����]��ʹ��static�����e���]�����o�B��������ʹ�÷��o�B��getDouble()
	public static double getDouble() throws IOException
	{
		String s = getString();
		Double aDub = Double.valueOf(s);
		return aDub.doubleValue();
	}
	public static void main(String[] args) throws IOException {
		System.out.println("Please input a double type number: ");
		double db = getDouble();
		System.out.println("Your input number is: " + db);
	}
}
