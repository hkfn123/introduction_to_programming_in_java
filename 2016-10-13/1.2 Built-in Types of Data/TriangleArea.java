public class TriangleArea {
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		int p = Integer.parseInt(args[2]);

		double sides = m + n + p;
		double halfside = sides/2;
		double area = (halfside*(halfside-m)*(halfside-n)*(halfside-p));

		System.out.println("Sides = " + sides);
		System.out.println("Area = " + area);
	}
}