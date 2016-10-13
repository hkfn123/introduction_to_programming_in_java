public class SomeTest {
	public static void main(String[] args) {
		System.out.println(Math.pow(2, 31));
		System.out.println(Math.sqrt(2) * Math.sqrt(2));
		// System.out.println(1/0);
		System.out.println(17.0/0.0);//Infinity
		System.out.println(17.0%0.0);//NAN
		// int a = 27 * "three";
		// int x;
		// System.out.println(x);

		int threeInt = 3;
		int fourInt = 4;
		double threeDouble = 3.0;
		double fourDouble = 4.0;
		System.out.println(threeInt/fourInt);
		System.out.println(threeInt/fourDouble);
		System.out.println(threeDouble/fourInt);
		System.out.println(threeDouble/fourDouble);

	}
}