public class Ordered {
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		int p = Integer.parseInt(args[2]);

		boolean b = m >= n && n >= p;
		b = b || (m <= n && n <= p);

		System.out.println(b);
	}
}