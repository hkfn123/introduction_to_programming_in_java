public class ThreeSort {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		int min = Math.min(Math.min(a, b), c);
		int max = Math.max(Math.max(a, b), c);
		int mid = a + b + c - max - min;

		System.out.print(min + " ");
		System.out.print(mid + " ");
		System.out.println(max);
	}
}