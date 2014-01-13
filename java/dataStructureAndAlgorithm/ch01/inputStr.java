// page 20
////////////////////////////////////////////////////////////
import java.io.*;

class getString
{
	public static String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
}
////////////////////////////////////////////////////////////

class inputStrMain
{
	public static void main(String[] args)
	{
		getString str = new getString();
		String s = str.getString();
		System.out.println(s);
	}
}
////////////////////////////////////////////////////////////
