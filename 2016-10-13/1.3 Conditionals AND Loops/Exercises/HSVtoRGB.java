public class HSVtoRGB {
	public static void main(String[] args) {
		double h = Double.parseDouble(args[0]);
		double s = Double.parseDouble(args[1]);
		double v = Double.parseDouble(args[2]);

		int hi = (int)(h%6);
		double c = v * s;
		double x = c * (1 - Math.abs((h/60)%2-1));
		double m = v - c;

		System.out.println(hi);

		double r1 , g1, b1;
		switch(hi) {
			case 0:
				r1 = c;
				g1 = x;
				b1 = 0;
				break;
			
			case 1: 
				r1 = x;
				g1 = c;
				b1 = 0;
				break;
			
			case 2: 
				r1 = 0;
				g1 = c;
				b1 = x;
				break;
			
			case 3: 
				r1 = 0;
				g1 = x;
				b1 = c;
				break;
			
			case 4: 
				r1 = x;
				g1 = 0;
				b1 = c;
				break;
			
			case 5: 
				r1 = c;
				g1 = 0;
				b1 = x;
				break;
			default:
				r1 = g1 = b1 = 0;
		}

		System.out.println("r: " + (r1+m) * 255 + " g: " + (g1+m) * 255 + " b: " + (b1+m) * 255);
	}
}