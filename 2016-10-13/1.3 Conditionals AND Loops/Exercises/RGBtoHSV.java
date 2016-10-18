public class RGBtoHSV {
	public static void main(String[] args) {
		
		double r = Integer.parseInt(args[0])/255.0;
		double g = Integer.parseInt(args[1])/255.0;
		double b = Integer.parseInt(args[2])/255.0;

		double max = Math.max(Math.max(r, g), b);
		double min = Math.min(Math.min(r, g), b);

		double h, s, v;
		if (max == min) {
			h = 0.0;
		} else if (max == r && g >=b) {
			h = 60.0 * (g-b)/(max-min) +0.0;
		} else if (max == r && g < b) {
			h = 60.0 * (g-b)/(max-min) + 360.0;
		} else if(max == g) {
			h = 60.0 * (b-r)/(max-min) + 120.0;
		} else {
			h = 60.0 * (r-g)/(max-min) + 240.0;
		}

		System.out.print(h + " ");
		if (max == 0) {
			s = 0;
		} else {
			s = 1 - min/max;
		}
		System.out.print(s + " ");

		v = max;
		System.out.println(v + " ");

	}
}
