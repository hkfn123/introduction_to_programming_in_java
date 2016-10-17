public class PrintResult {
	public static void main(String[] args) {
		/*int n = 123456789;
		int m = 0;
		while (n != 0) {
			m = (10 * m) + (n % 10);
			n = n / 10;
		}

		System.out.println("n = " + n +", m = " + m);*/

		//print 0 1 1 2 3 5 8 13 21 34 ... 
		int f = 0, g = 1;
		for (int i = 0; i <= 15; i++) {
			System.out.println(f);
			f = f + g;
			g = f - g;
		}


	}
}