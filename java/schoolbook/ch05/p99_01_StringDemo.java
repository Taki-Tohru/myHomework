// 演示字符串對象的用法

public class p99_01_StringDemo {
	public static void main(String[] args) {
		String myName = "G. Leeman";
		int lengthA = "張曉風".length();
		System.out.println("myName.length: " + myName.length());
		System.out.println("lengthA: " + lengthA); // is 3 not 6

		String nameA = "programming in java";
		String nameB = "Programming in Java";
		System.out.println("equals: " + nameA.equals(nameB));
		System.out.println("equalsIgnoreCase: " + nameA.equalsIgnoreCase(nameB));
		System.out.println("compareTo: " + nameB.compareTo("Program"));

		System.out.println("charAt(4): " + nameA.charAt(4));
		System.out.println("indexOf('a'): " + nameA.indexOf('a'));
		System.out.println("lastIndexOf('a'): " + nameA.lastIndexOf('a'));

		String subname = "in";
		System.out.println(nameA.substring(3, 10));
		System.out.println("abc".concat("123"));
		System.out.println(nameB.startsWith("Pro"));
		System.out.println(nameB.endsWith("in Java"));
		System.out.println(nameA.indexOf(subname));
		System.out.println(nameA.lastIndexOf(subname));

		System.out.println(nameB.toLowerCase());
		System.out.println(nameB.toUpperCase());
		System.out.println(nameA.replace('a', 'A'));
	}
}
