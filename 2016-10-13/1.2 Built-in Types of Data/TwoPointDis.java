public class TwoPointDis {
	public static void main(String[] args) {
		double x1 = Double.parseDouble(args[0]);
		double y1 = Double.parseDouble(args[1]);

		double x2 = Double.parseDouble(args[2]);
		double y2 = Double.parseDouble(args[3]);

		double xdis = x2 - x1;
		double ydis = y2 - y1;
		
		System.out.println(Math.sqrt(xdis*xdis + ydis*ydis));
	}
}