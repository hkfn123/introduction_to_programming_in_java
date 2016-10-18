public class Result16 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		int c = 0;
		while(b > 0) {
			if (b % 2 == 1) {
				c = c + a;
			}
			b = b/2;
			a = a+a;
		}

		System.out.println(c);
	}
}