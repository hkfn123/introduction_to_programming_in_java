public class Ramanujan {
	public static void main(String[] args) {
		long n = Long.parseLong(args[0]);

		for(int a = 1; a*a*a < n; a++) {
			for(int b = 1; b*b*b < n; b++) {
				for(int c = a+1; c*c*c < n; c++) {
					if(b == c) continue;
					for(int d = b-1; d > 0 && d >= c; d--) {
						long left = a*a*a + b*b*b;
						long right = c*c*c + d*d*d;
						if (left == right) {
							System.out.println(left + " = " + a + "^3" + " + " + b + "^3" + 
								" = " + c + "^3" + " + " + d + "^3");
						}
					}
				} 
			}
		}
	}
}