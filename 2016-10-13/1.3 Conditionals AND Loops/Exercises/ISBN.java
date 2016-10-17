public class ISBN {
	public static void main(String[] args) {
		long isbn = Long.parseLong(args[0]);
		int sumd = 0, i = 2;

		long tempisbn = isbn;
		while(tempisbn > 0) {
			sumd += (tempisbn%10) * (i++);
			tempisbn /= 10;
		}
		int checksum = 0;
		for( ; checksum <= 10; checksum++) {
			if((checksum + sumd)%11 == 0){
				break;
			}
		}

		String  comisbn = "";
		if (checksum == 10) {
			comisbn += isbn;
			comisbn += "X";
		} else {
			comisbn = isbn * 10 + checksum + "";
		}
		System.out.println(comisbn);

	}
}