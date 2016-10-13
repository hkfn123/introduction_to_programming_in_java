public class CMYKtoRGB {
	public static void main(String[] args) {
		double c = Double.parseDouble(args[0]);
		double m = Double.parseDouble(args[1]);
		double y = Double.parseDouble(args[2]);
		double k = Double.parseDouble(args[3]);

		double r = 255 * (1 - c) * (1 - k);
		double g = 255 * (1 - m) * (1 - k);
		double b = 255 * (1 - y) * (1 - k);

		System.out.println("cmyk :" + c + " " + m + " " + y + " " + k);
		System.out.printf("rgb %.2f %.2f %.2f", r, g, b);
		System.out.println();
	}
}