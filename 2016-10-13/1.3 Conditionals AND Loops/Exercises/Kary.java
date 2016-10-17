public class Kary {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int base = Integer.parseInt(args[1]);
		String ret = "";

		while((num > 0) && (num/base >=0) ) {
			String rem = num%base + "";
			int intrem = num%base;
			if (intrem >= 10) {
				switch(intrem) {
					case 10: rem = "A"; break;
					case 11: rem = "B"; break;
					case 12: rem = "C"; break;
					case 13: rem = "D"; break;
					case 14: rem = "E"; break;
					case 15: rem = "F"; break;
				}
			}
			ret = rem + ret;
			num /= base;
		}
		System.out.println(ret);
	}
}


