public class Hurricane {
	public static void main(String[] args) {
		int mph = Integer.parseInt(args[0]);
		String level = "undefined";
		if (mph>=74 && mph <=95) {
			level = "1";
		} else if(mph>=96 && mph <=110) {
			level = "2";
		} else if(mph>=111 && mph<=130) {
			level = "3";
		} else if(mph >=131 && mph <155) {
			level = "4";
		} else if( mph >= 155) {
			level = "5 hurricane";
		}

		System.out.println(level);
	}
}