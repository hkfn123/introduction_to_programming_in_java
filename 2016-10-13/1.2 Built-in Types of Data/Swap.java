public class Swap {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		System.out.print("Before swap: ");
		System.out.println("a = " + a + ", b = " + b + ".");
		
		int t = b;
		b = a;
		a = t;

		System.out.print("After swap: ");
		System.out.println("a = " + a + ", b = " + b + ".");
	}
}