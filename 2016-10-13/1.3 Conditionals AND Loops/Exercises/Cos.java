public class Cos {
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);

		x = Math.PI/180*x;

		double ret = 1.0;
		double factorial = 1.0;
		for(int i = 1; factorial != 0.0; i++) {
			factorial *= (x/i);
			if (i%4 == 0) {
				ret += factorial;
			} 
			if(i%4 == 2) {
				ret -= factorial;
			}
		}

		System.out.println(ret);
	}
}