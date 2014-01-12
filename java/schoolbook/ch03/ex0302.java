// page 61
// 求水仙花數
// 水仙花數指一個n(n >= 3)位數，它等於每個數字的n次冪的和。例如，153是水仙花數，因為改數是3位數且1^3 + 5^3 + 3^3 = 153.
// 求3位數的水仙花數。


public class ex0302 {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; ++i)
		{
			int single_digit = i % 10;
			int ten_digit = (i % 100) / 10;
			int hundred_digit = i / 100;
			if (hundred_digit * hundred_digit * hundred_digit + ten_digit * ten_digit * ten_digit + single_digit * single_digit * single_digit == i) {
				System.out.println(i + "是水仙花數。");
			}
		}

	}
}
