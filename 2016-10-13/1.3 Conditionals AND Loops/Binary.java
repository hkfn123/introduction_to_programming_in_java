public class Binary {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int power = 1;

		while(power <= num/2) {
			power *= 2;
		}

		while(power > 0) {
			if(num < power) {
				System.out.print(0);
			} else {
				System.out.print(1);
				num -= power;
			}

			power /= 2;
		}
		System.out.println();
	}
}