public class ThreeEquals {
	public static void main(String[] args) {
		String arg1 = args[0];
		String arg2 = args[1];
		String arg3 = args[2];

		System.out.println(arg1.equals(arg2) && arg1.equals(arg3));
	}
}