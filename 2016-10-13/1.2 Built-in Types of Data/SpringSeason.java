public class SpringSeason {
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);

		boolean isIn;
		if(m >3 && m < 6) {
			isIn = true;
		} else if( m == 3) {
			if (d >= 20) {
				isIn = true;
			} else {
				isIn = false;
			}
		} else if(m == 6) {
			if (d <= 20) {
				isIn = true;
			} else {
				isIn = false;
			}
		}  else {
			isIn = false;
		}
		System.out.println(isIn);
	}
}