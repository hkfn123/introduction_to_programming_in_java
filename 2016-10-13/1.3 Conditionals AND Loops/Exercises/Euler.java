public class Euler {
	public static void main(String[] args) {
		long n = Long.parseLong(args[0]);
		long a, b, c, d, e;
		for(e = 1; e <= n; e++) {
			long e5 = (long)Math.pow(e, 5);
			for(a = 1; a <= n; a++) {
				long a5 = (long)Math.pow(a, 5);
				if(a5 * 4 > e5) break;
				for(b = a+1; b <= n; b++) {
					long b5 = (long)Math.pow(b, 5);
					if(a5 + 3*b5 > e5) break;
					for(c = b+1;c <= n; c++) {
						long c5 = (long)Math.pow(c, 5);
						if(a5+b5+2*c5 > e5) break;
						for(d = c+1;d <= n; d++) { 
							long d5 = (long)Math.pow(d, 5);
							if(a5+b5+c5+d5 > e5) break;
							if (a5+b5+c5+d5 == e5) {
								System.out.println(a + "^5 +" + b + "^5 +" + c + "^5 +" + d+ "^5 = " + e + "^5" );
							}
						}
					}
				}
			}
		}
	}
}
