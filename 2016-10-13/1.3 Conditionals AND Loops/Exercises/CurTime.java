public class CurTime {
	public static void main(String[] args) {
		int h = Integer.parseInt(args[0]);

		if (h == 0) {
			System.out.println("12 midnight");
		} else if(h > 0 && h < 12) {
			System.out.println(h + " am");
		} else if( h == 12) {
			System.out.println(h + " noon");
		} else {
			System.out.println((h - 12) + " pm");
		}
	}
}