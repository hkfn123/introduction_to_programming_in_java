public class Factors {
	public static void main(String[] args) {
		long num = Long.parseLong(args[0]);

		for (long factor = 2; factor * factor <= num;  factor++) {
			while( num%factor == 0 ) {
				System.out.print(factor + " ");
				num = num/factor;
			}
		}

		if(num > 1) System.out.println(num);
		else	  System.out.println();
	}
}