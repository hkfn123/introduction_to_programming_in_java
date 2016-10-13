public class YIQtoRGB {
	public static void main(String[] args) {
		double y = Double.parseDouble(args[0]);
		double i = Double.parseDouble(args[1]);
		double q = Double.parseDouble(args[2]);

		double r =  255 * (y + 0.956 * i + 0.621 * q);
		double g =  255 * (y - 0.272 * i - 0.647 * q);
		double b =  255 * (y - 1.106 * i + 1.703 * q);

		System.out.println("yiq :" + y + " " + i + " " + q);
		System.out.printf("rgb %.2f %.2f %.2f", r, g, b);
		System.out.println();
	}
}