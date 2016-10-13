public class RGBtoYIQ {
	public static void main(String[] args) {
		double r = Double.parseDouble(args[0]);
		double g = Double.parseDouble(args[1]);
		double b = Double.parseDouble(args[2]);

		double y = 0.299 * r + 0.587 * g + 0.114 * b;
		double i = 0.596 * r - 0.274 * g - 0.322 * b;
		double q = 0.211 * r - 0.523 * g + 0.312 * b;

		System.out.println("rgb :" + r + " " + g + " " + b);
		System.out.printf("yiq %.2f %.2f %.2f", y , i, q);
		System.out.println();
	}
}