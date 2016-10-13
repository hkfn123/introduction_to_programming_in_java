public class RGBtoCMYK {
	public static void main(String[] args) {
		int r = Integer.parseInt(args[0]);
		int g = Integer.parseInt(args[1]);
		int b = Integer.parseInt(args[2]);

		double r_ = r/255.0;
		double g_ = g/255.0;
		double b_ = b/255.0;

		double k =  1 - Math.max(Math.max(r_, g_), b_);
		double c =  (1 - r_ - k)/(1 - k);
		double m =  (1 - g_ -k)/(1 - k);
		double y = (1 - b_ - k)/(1 - k);

		
		System.out.printf("rgb %d %d %d", r, g, b);
		System.out.println();
		System.out.printf("kcmy : %.3f %.3f %.3f %.3f" , k  , c , m , y);
		System.out.println();
	}
}