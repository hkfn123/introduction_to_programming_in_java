public class Sin {
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);

		x = x % (2 * Math.PI);
		int times = 1;
		double result = 0.0;
		for(int i = 1; i <= 13; i += 2) {
			double ret = Math.pow(x, i);
			if (times++ % 2 == 0) {
				for (int j = i; j > 0; j--) {
					ret /= j;
				}
				result -= ret;
			} else {
				for (int j = i; j > 0; j--) {
					ret /= j;
				}
				result += ret;
			}
		}

		System.out.println(result);
	}

}