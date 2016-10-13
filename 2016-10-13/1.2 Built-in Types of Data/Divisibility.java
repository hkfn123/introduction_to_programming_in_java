public class Divisibility {
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);

		boolean b = (m%7 == 0) && (n%7 == 0);

		System.out.println(b);
	}
}